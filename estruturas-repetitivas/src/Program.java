import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * double largura = sc.nextDouble(); double comprimento = sc.nextDouble();
		 * double metroQuadrado = sc.nextDouble();
		 * 
		 * double area = largura * comprimento; double preco = area * metroQuadrado;
		 * 
		 * System.out.printf("AREA = %.2f%n", area); System.out.printf("PRECO = %.2f%n",
		 * preco);
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int x, soma = 0; x = sc.nextInt();
		 * 
		 * while(x != 0) { soma += x;
		 * 
		 * x = sc.nextInt(); }
		 * 
		 * System.out.println(soma);
		 * 
		 * sc.close();
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int n; n = sc.nextInt();
		 * 
		 * int soma = 0;
		 * 
		 * for(int i = 0; i<n; i++) { int valor = sc.nextInt(); soma += valor; }
		 * 
		 * System.out.println(soma);
		 * 
		 * sc.close();
		 */
		
		/*
		for(int i =4;i>=0;i--) {
			System.out.println("Valor de i: " + i);
		}
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0*C/5.0+32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}
}
