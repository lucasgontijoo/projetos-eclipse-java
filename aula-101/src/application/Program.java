package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluguel;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("Número de exstudantes: ");
		int N = sc.nextInt();
				
		for(int i = 0; i<N; i++) {
			sc.nextLine();
			
			Aluguel quarto = new Aluguel();
			
			System.out.println("\nReserva #" + (i+1) + ": ");
			
			System.out.print("Nome: ");
			quarto.nome = sc.nextLine();
			
			System.out.print("Email: ");
			quarto.email = sc.nextLine();
			
			System.out.print("Quarto: ");
			quarto.quarto = sc.nextInt();
			
			
			quartos[quarto.quarto] = quarto;
		}
		
		System.out.println();
		System.out.println("Reservas:");
		for(int i = 0; i<quartos.length; i++) {
			if(!(quartos[i] == null)) {
				System.out.println(quartos[i].quarto + ": " + quartos[i].nome + ", " + quartos[i].email);
			}
		}
		
		sc.close();
	}
}
