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
@RequestMapping("/transport")
public class TransportEndpoint {
	
	Logger logger = LoggerFactory.getLogger(TransportEndpoint.class);

	private final TransportApi transportApi ;
	
	@Autowired
	public TransportEndpoint(TransportApi transportApi) {
		this.transportApi = transportApi;
	}
	
	// Add Transport details
	@PostMapping("/add")
	public ResponseEntity<Transport> saveTransport(@RequestBody TransportDto transportDto) {
		Transport transport = new Transport();
		
		transport.setId(transportDto.getId());
		transport.setuserid(transportDto.getuserid());
		transport.setName(transportDto.getName());
		transport.setAddress(transportDto.getAddress());
		transport.setCity(transportDto.getCity());
		transport.setpostel_code(transportDto.getpostel_code());
		transport.setMobileNumber(transportDto.getmobile_number());
		
		transportApi.AddTransport(transport);
		
		return ResponseEntity.ok(transport);
		
	}
	
	//get transport by UserId rest api
	@GetMapping("/getTransport")
	public List<Transport> getTransportById() {
		return transportApi.getAllTransport();
	}
	
	@GetMapping("/test")
	public String test() {
		return "testing";
	}
	
	
}
