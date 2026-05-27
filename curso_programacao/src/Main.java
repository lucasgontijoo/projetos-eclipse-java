/*import java.util.Locale;*/
/*import java.util.Scanner;*/

public class Main {
	public static void main(String[] args) {
		/*
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products:");
		 * System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		 * System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		 * 
		 * System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age,
		 * code, gender);
		 * 
		 * System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		 * System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * System.out.printf("US decimal point: %.3f", measure);
		 */

		/*
		 * Scanner sc = new Scanner(System.in); String x; x = sc.next();
		 * 
		 * System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int x; x = sc.nextInt();
		 * 
		 * System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); double x;
		 * x = sc.nextDouble();
		 * 
		 * System.out.printf("Você digitou: %.2f%n", x);
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in); char x; x = sc.next().charAt(0);
		 * 
		 * System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); String x;
		 * int y; double z;
		 * 
		 * x = sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 * 
		 * System.out.println("Dados digitados:"); System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x; String s1, s2, s3;
		 * 
		 * x = sc.nextInt(); sc.nextLine(); s1 = sc.nextLine(); s2 = sc.nextLine(); s3 =
		 * sc.nextLine();
		 * 
		 * System.out.println("DADOS DIGITADOS:"); System.out.println(x);
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 * 
		 * sc.close();
		 */

		/*
		 * double x = 3.0; double y = 4.0; double z = -5.0; double A, B, C;
		 * 
		 * A = Math.sqrt(x); B = Math.sqrt(y); C = Math.sqrt(25.0);
		 * System.out.println("Raiz quadrada de " + x + " = " + A);
		 * System.out.println("Raiz quadrada de " + y + " = " + B);
		 * System.out.println("Raiz quadrada de 25 = " + C);
		 * 
		 * A = Math.pow(x, y); B = Math.pow(x, 2.0); C = Math.pow(5.0, 2.0);
		 * System.out.println(x + " elevado a " + y + " = " + A); System.out.println(x +
		 * " elevado ao quadrado = " + B); System.out.println("5 elevado ao quadrado = "
		 * + C);
		 * 
		 * A = Math.abs(y); B = Math.abs(z); System.out.println("Valor absoluto de " + y
		 * + " = " + A); System.out.println("Valor absoluto de " + z + " = " + B);
		 */

		/*
		 * int hora; Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Quantas horas?"); hora = sc.nextInt();
		 * 
		 * if (hora < 12) { System.out.println("Bom dia"); } else if (hora < 18) {
		 * System.out.println("Boa tarde"); } else { System.out.println("Boa noite"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); int
		 * minutos; double valor = 50.00;
		 * 
		 * minutos = sc.nextInt();
		 * 
		 * if(minutos<=100) { System.out.printf("Valor a pagar: R$ %.2f", valor); } else
		 * { valor += (minutos-100)*2.00; System.out.printf("Valor a pagar: R$ %.2f",
		 * valor); }
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int x = sc.nextInt(); String dia; switch
		 * (x) { case 1: dia = "domingo"; break; case 2: dia = "segunda"; break; case 3:
		 * dia = "terca"; break; case 4: dia = "quarta"; break; case 5: dia = "quinta";
		 * break; case 6: dia = "sexta"; break; case 7: dia = "sabado"; break; default:
		 * dia = "valor invalido"; break; } System.out.println("Dia da semana: " + dia);
		 * sc.close();
		 */
		
		double preco = 34.5;
		double desconto;
		
		desconto = (preco < 20.0) ? preco*0.1 : preco*0.05;
		
		System.out.println(desconto);
	}
}
