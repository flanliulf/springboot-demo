package com.fancyliu.springboot.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Fancy Liu
 * @since : 2024/12/16 18:06
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello");

		return "hello";
	}
}
