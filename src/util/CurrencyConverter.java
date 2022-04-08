package util;

public class CurrencyConverter {
	
	public static double priceDollar;
	public static double valueDollar;
	public static final double IOF = 0.06;
	
	public static double dollarToReal() {
		return priceDollar * valueDollar;
	}
	
	public static double tax() {
		return priceDollar * valueDollar * IOF;
	}
	
}
