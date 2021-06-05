package org.decibel.services.imagestore;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WebImageStoreApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testServiceReturnsAJson() {
		
		
		String resultString = null;
		try {
			ResultActions result = mockMvc.perform(post("/").contentType(MediaType.APPLICATION_JSON).content(
					"[{\"domain\":\"github.com\",\"images\":[\"https://github.githubassets.com/images/search-key-slash.svg\",\"https://avatars.githubusercontent.com/u/31847993?s=48&v=4\"]}]"))
					.andExpect(status().isOk());
			
			resultString = result.andReturn().getResponse().getContentAsString();
			
		
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(resultString);
		
		assertEquals("[{\"domain\":\"github.com\",\"images\":[\"https://github.githubassets.com/images/search-key-slash.svg\",\"https://avatars.githubusercontent.com/u/31847993?s=48&v=4\"]}]",resultString);
		
		
	}

}
