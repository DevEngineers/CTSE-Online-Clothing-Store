package com.example.transportservice;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.assignment02.onlinestoreservice.api.TransportApi;
//import com.assignment02.onlinestoreservice.domain.Transport;
//import com.assignment02.onlinestoreservice.dto.TransportDto;


@CrossOrigin("*")
@RestController
public class TransportEndpoint2 {
	
	
	@GetMapping("/")
	public String test() {
		return "testing from 2";
	}
	
	
}
