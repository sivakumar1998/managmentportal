package in.cdac.managmentportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}
	
	@PostMapping("/createuser")
	public boolean createUser() {
		return true;
	}
	@PostMapping("/test")
	public boolean testPost() {
		return true;
	}
}
