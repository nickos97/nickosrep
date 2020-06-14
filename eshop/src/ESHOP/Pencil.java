package ESHOP;

public class Pencil extends Item {
	public enum t {
		H,
		B,
		HB
	}
	
	protected double tipSize;
	protected t type; 
	
public Pencil(String name,double price,String description, int stock, int id, double tipSize, t type) {
		
	super(name,price,description,stock,id);
		this.tipSize=tipSize;
		this.type=type;
	}

public void setTipSize(double tipSize) {
	
	this.tipSize=tipSize;
}

public void setType(t type) {
	
	this.type=type;
}

public double getTipSize() {
	
	return tipSize;
}

public t getType() {
	
	return type;
}



	
	@Override
    public String getDetails() {
        return "tipSize:" + tipSize + "\n" + "type:" + type;
    }

}
