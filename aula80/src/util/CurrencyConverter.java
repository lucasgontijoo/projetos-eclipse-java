package util;

public class CurrencyConverter {
	public static double dollarToReal(double dollarPrice, double dollars) {
		return (dollarPrice * dollars) + (0.06*(dollarPrice * dollars));
	}
}
