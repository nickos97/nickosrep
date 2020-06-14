package ESHOP;
import java.util.Scanner;


public class Menu {
	
	public static void Credentials() {
		
	 int user=0,c=0;
	 Owner owner= new Owner("Nikos@gmail.com","Nikos",true);	
	System.out.println("Enter your email: ");
	String mail_in=input();
		for(int i=0; i<Eshop.buyersList.size(); i++) {
	
			if(Eshop.buyersList.get(i).getEmail().equals(mail_in)) {
				c=i;
				user=1; 
				break;
			}
			
			else if(owner.getEmail().equals(mail_in)) {
				c=i;
				user=2;
				break;
				
			}
			else {
				if(i==Eshop.buyersList.size()-1) {
				user=3;
				break;
				}
		}
		}
		
		int b1=0,ans1,temp=0;
		while(true) {
			if(b1==2) {
				bye();
				break;
			}
		switch(user) {
		//******USER*******
		case 1: 
			if(b1==0) {
			System.out.println("\n\n***WELCOME TO OUR ESHOP***");
			b1=1;
			System.out.println("INFO:" + "\n" + Eshop.buyersList.get(c).getBuyerInfo() + "\n");
			System.out.println("1. Browse Store \n2. View Cart \n3. Checkout \n4. Disconnect \n5. Exit ");
			 ans1=intput();
			 temp=ans1;
			}
			else
				ans1=temp;
			
			switch(ans1) {
			case 1:
				Eshop.showCategories();
				System.out.println("5. Back(-1)");
				System.out.println("Choose a category or insert -1 to go back: ");
				int cat1 = intput();
				if(cat1==-1) {
					b1=0;
					continue;
				}
				Eshop.showProductsInCategory(cat1);
				System.out.println("Choose a product by inserting the id in the brackets or insert -1 to go back: ");
			
				int id,id1; 
				id = intput();
			 
				if(id==-1) 
					continue;
				else 
					id1 = Eshop.showProduct(id);
			 
				System.out.println("Please insert the quantity of the product: ");
				int q=intput();
				System.out.println("Do you want to add this product to the shopping cart? (y/n)");
				String in=input();
				if(in.equals("y")) {
					
				int b=Eshop.buyersList.get(c).getBonus();
					Eshop.buyersList.get(c).placeOrder(b,id1, q);
					System.out.println("Your order was added to the shopping cart");
					b1=0;
					
					continue;
					//System.out.println(ShoppingCart.orderList.get(0));
				}
			
				else  {
					b1=1;
					continue;
				}
				
			case 2: 
				System.out.println("*YOUR SHOPPING CART*");
				if(ShoppingCart.orderList.size()==0) {
					System.out.println("Your shopping cart is empty");
					System.out.println("Go to Browse Store to add something to your cart");
					b1=0;
					continue;
				}
				else {
					ShoppingCart.showCart(c);
					System.out.println("\n1. Remove order \n2. Alter order \n3. Clear cart \n4. Checkout \n5. Back(-1)" );
					System.out.println("Insert -1 if you want go back");
					int ans2 = intput();
					if(ans2==-1) {
						b1=0;
						continue;
					}
						
					switch(ans2) {
					case 1: 
						for(int i=0; i<ShoppingCart.orderList.size(); i++) {
						System.out.println(i + "." + ShoppingCart.orderList.get(i).getName());
						}
						System.out.println("choose the item you want to remove");
						int index=intput();
						ShoppingCart.removeItemOrdered(index);
						b1=1;
						continue;
					case 2:
						for(int i=0; i<ShoppingCart.orderList.size(); i++) {
							System.out.println(i + "." + ShoppingCart.orderList.get(i).getName());
							}
							System.out.println("choose the item you want to alter");
							 index=intput();
							 System.out.println("insert the new quantity: ");
							 int qnt=intput();
							 ShoppingCart.changeItemOrderedQuantity(index,qnt);
							 b1=1;
							 continue;
							 
					case 3:
						ShoppingCart.clearCart();
						b1=0;
						continue;
						
					case 4:
						int r=ShoppingCart.checkout(c);
						if(r==0) {
							System.out.println("Your order was completed successfully");
							b1=0;
						continue;
						
						}
						else {
							b1=1;
						continue;
						}
						
					}
				}
				
					
				
				
			case 3:
				int r=ShoppingCart.checkout(c);
				if(r==0) {
					System.out.println("Your order was completed successfully");
					b1=0;
				continue;
				
				}
				else {
					b1=0;
				continue;
				}
				
				
				
			case 4:
				System.out.println("Are you sure you want to disconnect? (y/n)");
				String ans4 = input();
				if(ans4.equals("y")) {
					System.out.println("Enter your email: ");
					 mail_in=input();
						for(int i=0; i<Eshop.buyersList.size(); i++) {
							if(Eshop.buyersList.get(i).getEmail().equals(mail_in)) {
								c=i;
								user=1; 
								b1=0;
								break;
							}
							else if(owner.getEmail().equals(mail_in)) {
								c=i;
								user=2;
								break;
							}
							else {
								if(i==Eshop.buyersList.size()-1) {
								user=3;
								break;
								}
						}
						}
					continue;
				}
				else
				{
					b1=0;
					continue;
				}

			
			case 5:
				System.out.println("Are you sure you want to exit? (y/n)");
				 ans4=input();
				 if(ans4.equals("y")) {
					 b1=2;
					 continue;
				 }
				 else {
					 b1=1;
					 continue;
				 }
					 
				 
				
			
			}
		//******OWNER******
		case 2:
			
			if(owner.getisAdmin()==true) {
				System.out.println("\n\n***WELCOME BACK	OWNER***");
				System.out.println("INFO:" + "\n" + owner.getOwnerInfo() + "\n" + "User: Owner");
				System.out.println("1. Browse Store \n2. Check Status \n3. Disconnect \n4. Exit ");
				int input2=intput();
				switch(input2) {
				case 1:
				
				Eshop.showCategories();
				System.out.println("Choose a category: ");
				 int cat2 = intput();
				Eshop.showProductsInCategory(cat2);
				System.out.println("Choose a product by inserting the id in the brackets or insert -1 to go back: ");
				
				 int s2,id2 = intput();
				 
				 if(id2==-1) 
					continue;
				 else 
					 s2 = Eshop.showProduct(id2);
				 
				 System.out.println("Do you want to alter the product? (y/n)");
				  String ans2=input();
				  if(ans2.equals("y")) {
					  	System.out.println("Set the stock manually");
						int st=intput();
						Eshop.updateItemStock(st, s2);
						System.out.println(Eshop.itemsList.get(s2).stock);					
						}
					
					else if(ans2.equals("n")) {
						continue;
					}
				case 2:
					Eshop.checkStatus();
					System.out.println("Please insert the buyer you want to check: ");
					input2=intput();
					for(int i=0; i<Eshop.buyersList.size(); i++) {
					if(input2==i+1) 
						 c=i;
					
					}
					ShoppingCart.showCart(c);
					System.out.println("Do you want to clear the cart?");
					ans2=input();
					if(ans2.equals("y")) {
						ShoppingCart.clearCart();
					}
					continue;
				case 3:
					System.out.println("Are you sure you want to disconnect? (y/n)");
					String ans4 = input();
					if(ans4.equals("y")) {
						System.out.println("Enter your email: ");
						 mail_in=input();
							for(int i=0; i<Eshop.buyersList.size(); i++) {
								if(Eshop.buyersList.get(i).getEmail().equals(mail_in)) {
									c=i;
									user=1; 
									b1=0;
									break;
								}
								else if(owner.getEmail().equals(mail_in)) {
									c=i;
									user=2;
									break;
								}
								else {
									if(i==Eshop.buyersList.size()-1) {
									user=3;
									break;
									}
							}
							}
						continue;
					}
					else
					{
						b1=0;
						continue;
					}
				case 4:
					System.out.println("Are you sure you want to exit? (y/n)");
					 ans4=input();
					 if(ans4.equals("y")) {
						 b1=2;
						 continue;
					 }
					 else {
						 b1=1;
						 continue;
					 }
					
					
			}
			}
			break;
		case 3:
			System.out.println("Do you want to sign up with this email? (y/n)");
			String ans2 = input();
			
				if (ans2.equals("y")) {
					System.out.println("Give a username: ");
					String ans3 = input();
					try {
					Eshop.addBuyer(new Buyer(mail_in,ans3,0,Buyer.cat.BRONZE));
					}
					catch(SameBuyerAdded eb) {
						System.out.println("This buyer already exists in the list");
					}
					c=Eshop.buyersList.size()-1;
					user=1;
					b1=0;
					continue;
				}
				else {
					b1=2;
					continue;
				}
				
					
		  
		}
	  }
	}
		
	public static void bye() {
		System.out.println("***THANK YOU FOR USING OUR SERVICE***");
	}
	
	public static String input() {
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		return answer;
	}
	
	public static int intput() {
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		return answer;
	}
	 
	public static int back1(int id) {
		 Eshop.showCategories();
		 System.out.println("Choose a category: ");
		 int cat = Menu.intput();
		 Eshop.showProductsInCategory(cat);
		 System.out.println("Choose a product by inserting the id in the brackets or insert -1 to go back: ");
		 id=Menu.intput();
		 Eshop.showProduct(id);
		 return id;
	}
	


}
