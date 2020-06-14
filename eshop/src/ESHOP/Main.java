package ESHOP;
public class Main {

	public static void main(String[] args) {
	try {
		Eshop.addBuyer(new Buyer("Thanasis@gmail.com","Thanasis",70,Buyer.cat.BRONZE));
		Eshop.addBuyer(new Buyer("Mixalis@gmail.com","Mixalis",240,Buyer.cat.SILVER));
		Eshop.addBuyer(new Buyer("Mixalis@gmail.com","Mixalis",240,Buyer.cat.SILVER));
	} catch(SameBuyerAdded eb) {
		System.out.println("You have already added this buyer");
	}
	
	try {
		Eshop.addItem(new Pen("bic",0.75,null,20,0,"blue",1.0));
		Eshop.addItem(new Pen("parker",3.5,null,20,1,"red",1.1));
		Eshop.addItem(new Pen("pilot",1.5,null,20,2,"black",0.9));
		
		Eshop.addItem(new Pencil("Faber-Castell",1.0,null,20,3,0.8,Pencil.t.B));
		Eshop.addItem(new Pencil("Staedtler",0.45,null,20,4,0.7,Pencil.t.H));
		Eshop.addItem(new Pencil("Eberhard",0.99,null,20,5,0.7,Pencil.t.HB));
		
		Eshop.addItem(new Paper("inacopia",4.5,null,20,6,80,500));
		Eshop.addItem(new Paper("Fabriano",3.25,null,20,7,100,300));
		Eshop.addItem(new Paper("Paperano",3.25,null,20,8,120,200));
		
		Eshop.addItem(new Notebook("moleskine",9.5,"leather",5,9,10));
		Eshop.addItem(new Notebook("Azure",8.75,"includes locker",5,10,12));
		Eshop.addItem(new Notebook("Azure",8.75,"includes locker",5,11,8));
	} catch(SameItemAdded ei) {
		System.out.println("This ite already exist in the item list");
	}
	
		//
	
	
		 
		Menu.Credentials();
		
		
	}	

}
