package com.karina.ExceptionHandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
	
	@GetMapping("/test")
	public String test()
	{
		throw new RuntimeException("!!!!!!!!******Exception Occured******!!!!!!!!");
	}
	
	


}
