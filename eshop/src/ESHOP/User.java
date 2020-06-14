package ESHOP;

public class User {

	protected  String email;
	protected  String name;
	
	public User(String email,String name) {
		this.email=email;
		this.name=name;
	}
	
	public void setEmail(String mail) {
		
		email=mail;
	}
	
	public void setName(String nm) {
		
		this.name=nm;
	}
	
	public  String getEmail() {
		
		return email;
	}
	
	public  String getName() {
		
		return name;
	}
}
