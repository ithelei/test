package com.wayboo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController相当于SpringMVC中的 @Controller + @ResponseBody
@RestController
public class HelloController {
	// 映射"/hello"请求
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring Boot!";
	}
}
