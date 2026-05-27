public class Main {
	public static void main(String[] args) {
		/*
		 * double b, B, h, area;
		 * 
		 * b = 6.0; B = 8.0; h = 5.0;
		 * 
		 * area = (b+B)/2.0*h;
		 * 
		 * System.out.println(area);
		 */

		/*
		 * int a,b; double resultado;
		 * 
		 * a=5; b=2;
		 * 
		 * resultado=(double)a/b;
		 * 
		 * System.out.println(resultado);
		 */

		/*
		 * double a; int b;
		 * 
		 * a = 5.0; b = (int) a;
		 * 
		 * System.out.println(b);
		 */
		
		double price = 4000.00;
		double discount;
		
		if(price < 200.00) {
			discount = price*0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);
	}
}
