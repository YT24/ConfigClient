package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rcontroller {
	@Value("${hahaha.h}")
	private String aaa;
	
	@RequestMapping("get")
	public String get(HttpServletRequest req,HttpServletResponse res) {
		
		return aaa;
	}
}
