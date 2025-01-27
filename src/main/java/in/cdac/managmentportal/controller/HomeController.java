package in.cdac.managmentportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cdac.managmentportal.entity.User;
import in.cdac.managmentportal.repository.UserRepository;
import in.cdac.managmentportal.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService service;
	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}
	
	@PostMapping("/createuser")
	public User createUser(@RequestBody User user) {
		 return service.save(user);
//		return savedUser;
	}
	@PostMapping("/test")
	public boolean testPost() {
		return true;
	}
}
