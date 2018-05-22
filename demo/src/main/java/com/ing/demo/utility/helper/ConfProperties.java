/**
 * 
 */
package com.ing.demo.utility.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author bdeshpan
 *
 */
@Component
@PropertySource("config.properties")
public class ConfProperties {
	@Value("${privateKey}")
	private String privateKey;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

}
