
package com.exercise.demo.day1a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Apicontroller_Ex1c {
	@RequestMapping("Fav")
@ResponseBody
public String getColor()
{
	String myFavcolor ="Black";
	return "Welcome "+ "My Favourite color is "+ myFavcolor;
}
}
