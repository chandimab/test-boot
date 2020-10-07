package com.sausecode.testboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBootController {
	@GetMapping("/hi")
	public String getmap() {
		return "Hello";
	}
}
