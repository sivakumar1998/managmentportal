package in.cdac.managmentportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.cdac.managmentportal.entity.User;
import in.cdac.managmentportal.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public User save(User user) {
		User savedUser=null;
		if(user.getPassword()!=null) {
			String hashedpassword=passwordEncoder.encode(user.getPassword());
			user.setPassword(hashedpassword);
			savedUser=repository.save(user);
		}else {
			System.err.println("password was null");
		}
		
		return savedUser;
		
	}
}
