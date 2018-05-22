package com.ing.demo.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ing.demo.controller.ProductController;
import com.ing.demo.service.ProductService;
/**
 * 
 * @author bdeshpan
 * this will perform integration tests.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class ProductDetailsIntegrationTest {

	private MockMvc mockMvc;

	//@InjectMocks
	private ProductController productController;

	//@Mock
	private ProductService productService;

	/**
	 * will set up beans those are required.
	 */
	//@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
	}

	/**
	 * Will test customer product details end point.
	 * @throws Exception
	 */
	//@Test
	public void getCustomerProductDetails() throws Exception {
		this.mockMvc.perform(get("/ing/product/11")).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

	}

}
