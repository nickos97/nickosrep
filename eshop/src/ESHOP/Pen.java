package ESHOP;

public class Pen extends Item{

	protected String color;
	protected double tipSize;
	
	public Pen(String name,double price,String description, int stock, int id,String color,double tipSize) {
		super(name,price,description,stock,id);
		
		this.color=color;
		this.tipSize=tipSize;
	}
	
	public void setColor(String color) {
		
		this.color=color;
	}
	
	public void setTipSize(double tipSize) {
		
		this.tipSize=tipSize;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public double getTipSize() {
		
		return tipSize;
	}
	
	@Override
    public String getDetails() {
        return "color:" + color + "\n" + "tipSize:" + tipSize;
    }




}
