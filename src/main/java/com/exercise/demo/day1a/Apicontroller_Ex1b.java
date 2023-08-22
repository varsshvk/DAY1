package com.exercise.demo.day1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_Ex1b {
@GetMapping("getName")
public String getName(@RequestParam String Name)
{
	return "Welcome"+ Name +"!";
}
}
