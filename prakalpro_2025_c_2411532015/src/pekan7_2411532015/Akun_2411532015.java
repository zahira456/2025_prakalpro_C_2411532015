package pekan7_2411532015;

public class Akun_2411532015 {
	private String username, password, email;
	private int pinAngka;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPinAngka() {
		return pinAngka;
	}
	public void setPinAngka(int pinAngka) {
		this.pinAngka = pinAngka;
	}
	public boolean isPasswordValid() {
		return password.length()>=8;
	}
	public boolean isEmailValid() {
		return email.contains("@") && email.contains(".");
	}
	

}
