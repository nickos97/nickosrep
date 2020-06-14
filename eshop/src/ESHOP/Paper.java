package ESHOP;

public class Paper extends Item {
	
	protected int weight;
	protected int pages;
	
public Paper(String name,double price,String description, int stock, int id, int weight, int pages) {
		
	super(name,price,description,stock,id);
		this.weight=weight;
		this.pages=pages;
	}

public void setWeight(int weight) {
	
	this.weight=weight;
}

public void setPages(int pages) {
	
	this.pages=pages;
}

public int getWeight() {
	
	return weight;
}

public int getPages() {
	
	return pages;
}
	
	@Override
    public String getDetails() {
        return "weight:" + weight + "\n" + "pages:" + pages;
    }

}
