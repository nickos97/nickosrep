package ESHOP;
@SuppressWarnings("serial")
public class NoStockAvailable extends Exception {

	public NoStockAvailable(String error) {
		super(error);
	}
}
