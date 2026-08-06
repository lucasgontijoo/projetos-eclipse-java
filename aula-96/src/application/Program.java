package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] alturas = new double[N];
		
		double soma= 0.0;
		double media=0.0;
		
		for(int i = 0; i<alturas.length; i++) {
			alturas[i] = sc.nextDouble();
			
			soma+=alturas[i];
		}
		
		media=soma/N;
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", media);
		
		sc.close();
	}
	
}
