package com.github.richygreat.springreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class RootRestController {
	@GetMapping("/{message}")
	public String echo(@PathVariable("message") String message) {
		System.out.println("echo: message: " + message);
		return message;
	}

	@GetMapping("/mono/{message}")
	public Mono<String> echoMono(@PathVariable("message") String message) {
		return Mono.just(message);
	}
}
