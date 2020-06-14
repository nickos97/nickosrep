package ESHOP;

public class ItemOrdered {
	Item item;
    int quantity;
	public ItemOrdered(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		
	}
	
	public int getID() {
		
		return item.getId();
	}
public int getStock() {
		
		return item.getStock();
	
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return item.getprice();
	}
	public String getName() {
		return item.getName();
	}
	

	public String toString()
    {
        return item.getBasicInfo() + "\n" + "Quantity:" +  getQuantity();
    }
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
      
	
     // public int getitemID() {
    	//  return Item.getId();
     // }
}
