package model;

public class User {
	
	private int id;
	private String username, password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		System.out.println("***LISTA DE USUARIO***");
		System.out.println("Username: "+ getUsername());
		System.out.println("Password: "+ getPassword());
		System.out.println("");
		return null;
	}
	
}
