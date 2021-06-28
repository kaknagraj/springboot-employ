package com.demo.employee.controller;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.entity.EmployDao;
import com.demo.employee.service.EmployService;


@RestController
public class EmployController {
	
	Logger log= org.slf4j.LoggerFactory.getLogger(EmployController.class);
	
	@Autowired
	 EmployService employService;
	
	   @GetMapping("/getHello")
	    @ResponseBody
	    private String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }
	 
	
    @PostMapping(value = "/employee", //
          
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    private ResponseEntity<EmployDao> saveEmploy(@RequestBody EmployDao emp) {
		log.info("save service called...");
		try {
		employService.saveEmploy(emp);
	
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		log.info("save service end...");
		return new ResponseEntity<EmployDao>(emp,HttpStatus.CREATED);
		//return EmployDaoemp;
	
		
		
		
	}
  

}
