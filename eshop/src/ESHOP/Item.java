package ESHOP;

public abstract class Item {
	
	protected String name;
	protected double price;
	protected String description;
	protected int stock;
	protected int id;
	
	public Item(String name, double price, String description, int stock, int id) {
		
		this.name = name;
		this.price = price;
		this.description = description;
		this.stock = stock;
		this.id = id;
		
	}
	
	public void setName(String nm) {
		
		this.name=nm;
	}
	
public void setPrice(double nm) {
		
		this.price=nm;
	}

public void setDescription(String nm) {
	
	this.description=nm;
}

public void setStock(int nm) {
	
	this.stock=nm;
}

public void setId(int nm) {
	
	this.id=nm;
}
	public String getName() {
		
		return name;
	}
	
public double getprice() {
		
		return price;
	}

public String getDesription() {
	
	return description;
}

public int getStock() {
	
	return stock;
}

public int getId() {
	
	return id;
}


	
	
	public final String getBasicInfo() {
		
		return "name:" + name + "\n" +
                "price:" + price + "\n" +
                "description:" + description + "\n" +
                "stock:" + stock + "\n" +
                "id:" + id;
		
	}
	
	public abstract String getDetails();

    public String toString()
    {
        return getBasicInfo() + "\n" +
                getDetails();
    }

}
