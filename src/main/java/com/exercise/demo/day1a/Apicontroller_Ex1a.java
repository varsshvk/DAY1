package com.exercise.demo.day1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_Ex1a {
@GetMapping("welcome")
public String Welcome()
{
	return "Welcome";
}
}
