package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Product[] produtos = new Product[N];
		Product produto = new Product();
		double soma = 0.0, media = 0.0;

		for (int i = 0; i < produtos.length; i++) {
			produto.nome = sc.next();
			produto.preco = sc.nextDouble();

			produtos[i] = produto;
			soma += produto.preco;
		}

		media = soma / N;
		System.out.printf("AVERAGE PRICE = %.2f%n", media);

		sc.close();
		;

	}
}
