package com.example.demo;

import java.util.HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DServices {

	private static Map<String, DClass> productRepo = new HashMap<>();
	 private static final Logger LOG = Logger.getLogger(DServices.class.getName());
	
	   @RequestMapping(value = "/addproducts", method = RequestMethod.POST)
	   public ResponseEntity<String> createProduct(@RequestBody DClass dclass) {
	      
		   LOG.log(Level.INFO, "Calling createProducts");
		   
		   productRepo.put(dclass.getName(), dclass);
		   
		   LOG.log(Level.INFO, "returning createProducts");
		   
	       return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	       
	   }
	   
	   
	   
	   @RequestMapping(value = "/getproduct/{id}", method = RequestMethod.GET)
	   public ResponseEntity<DClass> getProduct(@PathVariable String id) {	      
		   
		   LOG.log(Level.INFO, "calling getProduct");
		   
		   return new ResponseEntity<>(productRepo.get(id), HttpStatus.CREATED);
	       
	   }
	   
	   
	   @RequestMapping(value = "/getproducts", method = RequestMethod.GET)
	   public ResponseEntity<List<Object>> listProducts() {	      
		   
		   LOG.log(Level.INFO, "calling listProducts");
		   
		   return new ResponseEntity<>(productRepo.values().stream().collect(Collectors.toList()), HttpStatus.CREATED);
	       
	   }
	   
	   
	   @RequestMapping(value = "/globalexcpetion", method = RequestMethod.PUT)
	   public ResponseEntity<Object> globalException() { 
	      throw new DClassException();
	   }


}
