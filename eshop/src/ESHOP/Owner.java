package ESHOP;

public class Owner extends User {

	protected boolean isAdmin=true;
		
public  Owner(String email, String name,boolean isAdmin) {
		
		super(email,name);
		this.isAdmin=isAdmin;
	}

public boolean getisAdmin() {
	
	return isAdmin;
}

public void setisAdmin(boolean isAdmin) {
	
	this.isAdmin=isAdmin;
}

public String getOwnerInfo() {
	
	return "Email:" + getEmail() + "\n" + "Name:" + getName();
}


}
