/**
 * 
 */
package com.ing.demo.utility;

import java.security.InvalidKeyException;
import java.security.Key;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ing.demo.utility.helper.ConfProperties;

/**
 * @author bdeshpan
 *
 */
@Component
public class EncryptDecryptUtility {

	@Autowired
	private ConfProperties confProperties;
	

	/**
	 * 
	 * @param encrypted
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws Exception
	 */
	public  String Decrypt(byte[] encrypted)
			throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, Exception {
		// decrypt the text
		Key aesKey = new SecretKeySpec(confProperties.getPrivateKey().getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, aesKey);
		String decrypted = new String(cipher.doFinal(encrypted));
		return decrypted;
	}

	/**
	 * 
	 * @param textToEncrypt
	 * @return
	 * @throws Exception
	 */
	public  byte[] Encrtpy(String textToEncrypt) throws Exception {
		// Create key and cipher
		Key aesKey = new SecretKeySpec(confProperties.getPrivateKey().getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		// encrypt the text
		cipher.init(Cipher.ENCRYPT_MODE, aesKey);
		byte[] encrypted = cipher.doFinal(textToEncrypt.getBytes());
		return encrypted;
	}
}
