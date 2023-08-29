package com.mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping(value="/getmsg")
	public String Msg() {
		return "Hello World";
	}

}
