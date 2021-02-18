package com.swayzetrain.utility.proceduralmap.common.service;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class ResponseHeaderService {
	
	public HttpHeaders generateResponseHeader() {
		HttpHeaders httpHeaders = new HttpHeaders();
		
		httpHeaders.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
		httpHeaders.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "POST");
		
		return httpHeaders;
	}
	

}
