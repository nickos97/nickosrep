package ESHOP;

public class Buyer extends User {
	
	private  int bonus=0;
	private  cat buyerCategory=cat.BRONZE;
	
	public  Buyer(String email, String name, int bonus, cat bc) {
		
		super(email,name);
		this.bonus=bonus;
		buyerCategory=bc;

	}

	public enum cat 
	{
		BRONZE,
		SILVER,
		GOLD
	}
	
    
	
	public void awardBonus(int bonus) {
		
		bonus = bonus + (int)Math.round(0.1*ShoppingCart.calculateNet());
		
		if(bonus<100)
			buyerCategory=cat.BRONZE;
		else if(bonus>=100 && bonus<200)
			buyerCategory=cat.BRONZE;
		else  
			buyerCategory=cat.BRONZE;
	}
	
	public void setBonus(int bonus) {
		
		this.bonus=bonus;
	}
	
	public void setbuyerCategory(cat bc) {
		
		buyerCategory=bc;
	}
	
	public cat getBuyerCategory() {
		
		return buyerCategory;
	}
	
	public int getBonus() {
		
		return bonus;
	}
	
	public void placeOrder(int bonus,int input,int quantity) {
		
		try {
		ShoppingCart.addItemOrdered(input, quantity);
		awardBonus(bonus);
	} catch(NoStockAvailable e) {
		System.out.println("Sorry, no Stock Available");
	}
	}
	
	public String getBuyerInfo() {
		
		return "Name: " + getName() + "\n" + "Email: " + getEmail() + "\n" + "Bonus: " + getBonus() + "\n" + "Category: " + getBuyerCategory();
	}
	
	
	
}
