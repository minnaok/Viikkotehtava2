package fi.viikkotehtava.Viikkotehtava2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	
	public String returnGreetingForName(@RequestParam(name="location") String location,
			@RequestParam(name="name") String name) {
		
		return "Welcome to the " + location + " " + name + "!";
}
}