package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Value("${msg:Not Connected}")
	String msg;
	
	@GetMapping("/getvar")
	public String fun1() {
		return msg;
	}

}
