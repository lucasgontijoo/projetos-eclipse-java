/*import java.util.Scanner;
import java.util.Locale;*/

public class Program {
	public static void main(String[] args) {
		/*
		 * Exercicio 1 Scanner sc = new Scanner(System.in); int n; n = sc.nextInt();
		 * 
		 * if(n >= 0) { System.out.println("NAO NEGATIVO"); } else {
		 * System.out.println("NEGATIVO"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 2 Scanner sc = new Scanner(System.in); int n; n = sc.nextInt();
		 * 
		 * if(n % 2 == 0) { System.out.println("PAR"); } else {
		 * System.out.println("IMPAR"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 3 Scanner sc = new Scanner(System.in); int A, B; A = sc.nextInt();
		 * B = sc.nextInt();
		 * 
		 * if(A%B == 0) { System.out.println("Sao Multiplos"); } else if (B%A == 0) {
		 * System.out.println("Sao Multiplos"); } else {
		 * System.out.println("Nao sao Multiplos"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 4 Scanner sc = new Scanner(System.in); int inicio, termino; inicio
		 * = sc.nextInt(); termino = sc.nextInt();
		 * 
		 * if(inicio > termino) { int resultado = ((inicio-termino)-24)*-1;
		 * System.out.printf("O JOGO DUROU %d HORA(S)", resultado); } else if (inicio ==
		 * termino) { System.out.println("O JOGO DUROU 24 HORA(S)"); } else { int
		 * resultado = (inicio-termino)*-1; System.out.printf("O JOGO DUROU %d HORA(S)",
		 * resultado); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 5 Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); int cod, qtd; double total;
		 * 
		 * cod = sc.nextInt(); qtd = sc.nextInt();
		 * 
		 * if(cod == 1) { total = 4.00*qtd; } else if(cod == 2) { total = 4.50*qtd; }
		 * else if(cod == 3) { total = 5.00*qtd; } else if(cod == 4) { total = 2.00*qtd;
		 * } else { total = 1.50*qtd; }
		 * 
		 * System.out.printf("Total: R$ %.2f", total);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 6 Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); double n;
		 * 
		 * n=sc.nextDouble();
		 * 
		 * if(n>= 0 && n<=25) { System.out.println("Intervalo [0, 25]"); } else if (n>25
		 * && n<=50) { System.out.println("Intervalo (25, 50]"); } else if (n > 50 && n
		 * <=75) { System.out.println("Intervalo (50, 75]"); } else if (n > 75 && n <=
		 * 100) { System.out.println("Intervalo (75, 100]"); } else {
		 * System.out.println("Fora de intervalo"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 7 Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); double x, y;
		 * 
		 * x = sc.nextDouble(); y = sc.nextDouble();
		 * 
		 * if(x == 0.0 && y == 0.0) { System.out.println("Origem"); } else if (x == 0.0)
		 * { System.out.println("Eixo X"); } else if (y == 0.0) {
		 * System.out.println("Eixo Y"); } else if(x > 0 && y > 0) {
		 * System.out.println("Q1"); } else if(x > 0 && y < 0) {
		 * System.out.println("Q4"); } else if(x<0 && y>0) { System.out.println("Q2"); }
		 * else { System.out.println("Q3"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 8 Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); double salario, imposto = 0.00;
		 * 
		 * salario = sc.nextDouble();
		 * 
		 * if(salario>4500.00) { imposto += (salario-4500.00)*0.28; salario -=
		 * (salario-4500.00); }
		 * 
		 * if(salario >3000.00) { imposto += (salario-3000.00)*0.18; salario -=
		 * (salario-3000.00); }
		 * 
		 * if(salario>2000.00) { imposto += (salario-2000.00)*0.08; }
		 * 
		 * if(imposto == 0.00) { System.out.println("Isento"); } else {
		 * System.out.printf("R$ %.2f", imposto); }
		 * 
		 * sc.close();
		 */
	}
}