package com.example.transportservice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TransportApi {

	List<Transport> transports = new ArrayList<Transport>();
	HashMap<String, String> cap = new HashMap<String, String>();
	
	
	
	public void AddTransport(Transport transport) {
		transports.add(transport);
	}
	
	public List<Transport> getAllTransport() {
		if(transports.isEmpty()) {
			transports.add(new Transport(101,"1","Rahman","colombo1","kalmunai2","32008","077633488"));
			transports.add(new Transport(102,"2","David","colombo2","kalmunai7","32008","077633499"));
			transports.add(new Transport(103,"3","Raddy","colonbo3","kalmunai5","32008","077633477"));
		}
		return transports;
	}
	
}


