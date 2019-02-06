package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
	String hello(@PathVariable String user) {
		return "Hello " + user + "!";
	}

}