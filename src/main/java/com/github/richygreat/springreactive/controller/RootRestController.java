package com.github.richygreat.springreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootRestController {
	@GetMapping("/{message}")
	public String echo(@PathVariable("message") String message) {
		return message;
	}
}
