package in.cdac.managmentportal.data;

public class Login {
	private String username;
	private CharSequence password;

	public Login(String username, CharSequence password) {
		this.username = username;
		this.password = password;
	}

	public CharSequence getPassword() {
		return password;
	}

	public void setPassword(CharSequence password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
