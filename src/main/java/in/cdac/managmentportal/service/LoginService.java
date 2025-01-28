package in.cdac.managmentportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.cdac.managmentportal.data.Login;
import in.cdac.managmentportal.entity.User;
import in.cdac.managmentportal.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Autowired
	private UserRepository repository;

	public boolean verifyLogin(Login login) {
		User user = repository.findByUsername(login.getUsername());
		return encoder.matches(encoder.encode(login.getPassword()), user.getPassword());

	}
}
