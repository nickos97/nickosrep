package ESHOP;
import java.util.ArrayList;
import ESHOP.SameItemAdded;  

//import java.util.Scanner;
public class Eshop {
	protected String name;
	Owner owner;

		 //Creating Lists for the items and the buyers  
		 public static ArrayList<Item> itemsList=new ArrayList<>();  
		 public static ArrayList<Buyer> buyersList=new ArrayList<>();  	 
		
		 
		 public static void addItem(Item item) throws SameItemAdded {
			 boolean check=false;
			 for(int i=0; i<itemsList.size(); i++) {
				 if(itemsList.get(i).getId()==item.getId())
					 check=true;
			 }
			 if(check==false)
				 itemsList.add(item);
			 else 
				 throw new SameItemAdded("This item already exists in the item list");
		 }
		 
		 
		 public static void getItemByid(int id) {

			 for(int i=0; i<itemsList.size(); i++) {
				 if(itemsList.get(i).getId()==id)
					 System.out.println(itemsList.get(i));
			 }
			 
			
		 }
		 
		 public static void removeItem(int id) {
			 
			 for(int i=0; i<itemsList.size(); i++) {
				 if(itemsList.get(i).getId()==id)
					 itemsList.remove(i);
			 }
			 
		 }
		 
		 public static void addBuyer(Buyer buyer) throws SameBuyerAdded {
			 boolean check=false;
			 for(int i=0; i<buyersList.size(); i++) {
				 if(buyersList.get(i).getEmail()==buyer.getEmail())
					 check=true;
			 }
			 if(check==false)
				 buyersList.add(buyer);
			 else 
				 throw new SameBuyerAdded("This buyer already exists in the item list");
			 
		 }
		 
		 public static void updateItemStock(int stock,int id) {
			 
					 itemsList.get(id).setStock(stock);
			 
			 
		 }
		 
		 public static void showCategories() {
			 int s1=0,s2=0,s3=0,s4=0;
			 for(int i=0; i<itemsList.size(); i++) {
				 if(itemsList.get(i) instanceof Pen) {
					 s1 = s1 + itemsList.get(i).getStock();
				 }
				 else if(itemsList.get(i) instanceof Pencil) {
					 s2 = s2 + itemsList.get(i).getStock();
				 }
				 else if(itemsList.get(i) instanceof Paper) {
					 s3 = s3 + itemsList.get(i).getStock();
				 }
				 else {
					 s4 = s4 + itemsList.get(i).getStock();
				 }
					
			 }
			 
			 System.out.println("CATEGORIES" + "\n" + "1. Pens(" + s1 + ")" + "\n" + "2. Pencils(" + s2 + ")" + "\n" + "3. Papers(" + s3 + ")" + "\n" + "4. Notebooks(" + s4 + ")");
			 
		 }
		 public static int c=0;
		 public static void showProductsInCategory(int cat) {
			int d=0;
				 if(cat<1 || cat>4) 
					 while(true) {
					 System.out.println("Wrong input, try again:");
					  cat=Menu.intput();
					  if(cat>0 && cat<5)
						  break;
					 
					 }
				 
				 switch(cat) {
				 case 1: 
					 System.out.println("PENS: ");
					 for(int i=0; i<itemsList.size(); i++) {
						 
						 if(itemsList.get(i) instanceof Pen)
						 System.out.println(++d + ". " + Eshop.itemsList.get(i).getName() + "(" + Eshop.itemsList.get(i).getId()  + ")");
					 }
					 c=cat;
					 break;
				 
				 case 2: 
					 System.out.println("PENCILS: ");
					 for(int i=0; i<itemsList.size(); i++) {
						 if(itemsList.get(i) instanceof Pencil) 
						 System.out.println(++d + ". " + Eshop.itemsList.get(i).getName() + "(" + Eshop.itemsList.get(i).getId()  + ")");
					 }
					 c=cat;
					 break;
				 
				 case 3:
					 System.out.println("PAPERS: ");
					 for(int i=0; i<itemsList.size(); i++) {
						 if(itemsList.get(i) instanceof Paper)
						 System.out.println(++d + ". " + Eshop.itemsList.get(i).getName() + "(" + Eshop.itemsList.get(i).getId() + ")");
					 }
					 c=cat;
					 break;
				 
				 case 4:
					System.out.println("NOTEBOOKS: ");
				 	for(int i=0; i<itemsList.size(); i++) {
				 		if(itemsList.get(i) instanceof Notebook)
				 		System.out.println(++d + ". " + Eshop.itemsList.get(i).getName() + "(" + Eshop.itemsList.get(i).getId()  + ")");
				 	}
				 	c=cat;
				 	break;
			
			 }
				 System.out.println(++d + ". Back(-1)");
				
				 
		}
		 
		 
		 public static int showProduct(int id) {
			 
			 
			 
			 
			 switch(c) {
			 	
			 case 1:
			 	 while(true) {
			 		if(id>=0 && id<=2) {
			 			System.out.println(itemsList.get(id).getBasicInfo()+ "\n" +itemsList.get(id).getDetails());
		 				 break;
		 			 }
			 		else if(id==-1) {
			 			Menu.back1(id);
			 			break;
			 		}
			 		else if(id<0 || id>2) {
			 			 System.out.println("Wrong input1, try again: ");
			 			 id=Menu.intput();
			 			 
			 		 }
			 			 
			 }
			 	
			 	
			 	 break;
			 	 
			 case 2:
			 	 while(true) {
			 		 if(id>=3 && id<=5) {
			 			System.out.println(itemsList.get(id).getBasicInfo() + "\n" +itemsList.get(id).getDetails());
			 				break;
			 			 }
			 		else if(id==-1) {
			 			Menu.back1(id);
			 			break;
			 		}
			 		 else if(id<3 || id>5) {
			 			 System.out.println("Wrong input2, try again: ");
			 			 id=Menu.intput();
			 			
			 				 
			 		 }
			 			 
			 }
			 	 break;
			 case 3:
			 	 while(true) {
			 		if(id>=6 && id<=8) {
			 			System.out.println(itemsList.get(id).getBasicInfo()+ "\n" +itemsList.get(id).getDetails() + "hello");
		 				 break;
		 			 }
			 		else if(id==-1) {
			 			Menu.back1(id);
			 			break;
			 		}
			 		else if(id<6 || id>8) {
			 			 System.out.println("Wrong input3, try again: ");
			 			 id=Menu.intput();
			 		 }
			 			 
			 }
			 	 break;
			 	 
			 case 4:
			 	 while(true) {
			 		if(id>=9 && id<=11) {
		 				System.out.println(itemsList.get(id).getBasicInfo() + "\n" +itemsList.get(id).getDetails()); 
		 			 	 break;
		 			}
			 		else if(id==-1) {
			 			Menu.back1(id);
			 			break;
			 		}
			 		else  {
			 			 System.out.println("Wrong input4, try again: ");
			 			 id=Menu.intput();
			 			
			 		}	 
			 	 }
			 	 break;
			 	 
				 
			 }
			
			 
			 return id;
		 }	 
		 
		 public static void checkStatus() {
			for(int i=0; i<buyersList.size(); i++) { 
			 System.out.println("Buyer" +""+ i+1 + "\n" + "name=" + buyersList.get(i).getName() + "\n" + "bonus=" + buyersList.get(i).getBonus() + "\n" + "category=" + buyersList.get(i).getBuyerCategory() + "\n");
			}
		 }
		
		 public static int checkInt(int i) {
			 return i;
		 }
}
