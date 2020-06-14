package ESHOP;
import java.util.ArrayList;

public class ShoppingCart {
	static ArrayList <ItemOrdered> orderList = new ArrayList<>();
	
	 static void addItemOrdered(int input1,int quantity) throws NoStockAvailable {
		
		Item obj = Eshop.itemsList.get(input1);
		//ItemOrdered it = new ItemOrdered(obj, quantity);
		int i;
		boolean check = false;
		int as = obj.getStock();
		int c = 0;
		
		if(orderList.size()!=0) {
			
		for(i=0; i<orderList.size(); i++) {
			if(orderList.get(i).getID() == input1) {
				check = true;
				c = i;
				
			}
		  }
		}
		
		if(check == true) {
			int Q = orderList.get(c).getQuantity();
			//System.out.println("hello");
			//System.out.println(Q);
			if(as >= quantity) {
			Q = Q + quantity;
			//System.out.println(Q);
			orderList.get(c).setQuantity(Q);
			as = as - quantity;
			obj.setStock(as);
			}
			else
				throw new NoStockAvailable("There is no stock available");
		}
		
		else 
			if(as >= quantity) {
				orderList.add(new ItemOrdered(obj, quantity));
				//System.out.println("hello");
				as = as - quantity;
				obj.setStock(as);
			}
			else
				throw new NoStockAvailable("There is no stock available");
				
	}
		
	 
	 
	
	static void removeItemOrdered(int index) {
		
		
		int as = orderList.get(index).getStock();
		int q = orderList.get(index).getQuantity();
		int id = orderList.get(index).getID();
		orderList.remove(index);
		
		as = as + q;
		
		Eshop.itemsList.get(id).setStock(as);
	}
	static void changeItemOrderedQuantity(int index1,  int quantity) {
		int as = orderList.get(index1).getStock();
		int id = orderList.get(index1).getID();
		int q = orderList.get(index1).getQuantity();
		
		
		
			
		if(quantity > q) {
		  as = as + q - quantity;
		  q =  quantity;
		  orderList.get(index1).setQuantity(q);
		  Eshop.updateItemStock(as, id);
		}
		  
		else if(quantity < q) {
		  as = as + q - quantity;
		  q =  quantity;
		  orderList.get(index1).setQuantity(q);
		  Eshop.updateItemStock(as, id);
		  
		}
		else
			System.out.println("There is no difference");
		  
			  
			  
		}
	static double  calculateNet() {
		
		double pr = 0;
		double total = 0;
		for(int i=0; i<orderList.size(); i++) {
			pr=orderList.get(i).getPrice() * orderList.get(i).getQuantity();
			total = total + pr;
			}
		return total;
		
	}
	
public static double calculateCourierCost(int c) {
		
		Buyer.cat category=Eshop.buyersList.get(c).getBuyerCategory();
		
		double courier = 0.02*calculateNet();
		if(courier<3) 
			courier = 3;
		if(category==Buyer.cat.GOLD) {
			courier=0;
		}
		else if(category==Buyer.cat.SILVER) {
			courier=courier/2;
		}
		
		return courier;
	}

public static void showCart(int c) {
	
	for (int i=0; i<orderList.size(); i++ ) {
		System.out.println("ORDER" + (i+1)+ "\n" + "Name: " + orderList.get(i).getName() + "\n" + "Quantity: " + orderList.get(i).getQuantity() + "\n" + "Price: " + orderList.get(i).getPrice() + "\n");
	}
	
	System.out.println("\n" + "Total cost: " + calculateNet());
	System.out.println("Courier cost: " + calculateCourierCost(c));
}

public static void clearCart() {
	for(int i=0; i<orderList.size(); i++) {
	removeItemOrdered(i);
}
	
	
}

public static int checkout(int c) {
	showCart(c);
	System.out.println("Confirm order? (y/n)");
	String ans = Menu.input();
	if(ans.equals("y") ) {
		for(int i=0; i<orderList.size(); i++) {
			orderList.remove(i);
		}
		int bonus= Eshop.buyersList.get(c).getBonus();
		Eshop.buyersList.get(c).awardBonus(bonus);
		return 0;
	}
	else
		return 1;
	
}
}