package in.cdac.managmentportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cdac.managmentportal.data.Login;
import in.cdac.managmentportal.dto.ResponseDTO;
import in.cdac.managmentportal.entity.User;
import in.cdac.managmentportal.repository.UserRepository;
import in.cdac.managmentportal.service.LoginService;
import in.cdac.managmentportal.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;
	@Autowired
	private LoginService loginService;

	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}

	@PostMapping("/createuser")
	public ResponseEntity<ResponseDTO> createUser(@RequestBody User user) {
		User savedUser = userService.save(user);
		ResponseDTO response = null;
//		return savedUser;
		if (savedUser.getDept_id() > 0) {
			response = new ResponseDTO("user created successfully", "201");
		} else {
			response = new ResponseDTO("User not created", "500");
		}
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PostMapping("/test")
	public boolean testPost() {
		return true;
	}
	@PostMapping("/login")
	public ResponseEntity<ResponseDTO> doLogin(@RequestBody Login login){
		
		if(loginService.verifyLogin(login)) {
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO("login sucessfull", "sucess"));
	}else {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseDTO("login failed", "fail"));
	}
	}
}
