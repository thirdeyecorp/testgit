package com.sb.client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeWebService {

	@Autowired
	RestTemplate  restTemplate;
	
	
	 @RequestMapping(value = "/template/products", method = RequestMethod.POST)
	   public String createProducts(@RequestBody DClass dclass) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<DClass> entity = new HttpEntity<DClass>(dclass,headers);
	      
	      return restTemplate.exchange("http://localhost:9090/addproducts", HttpMethod.POST, entity, String.class).getBody();
	   }
}
