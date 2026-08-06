package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*
		 * EX01.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] numeros = new int[N];
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();	
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		
		
		
		sc.close();
		*/
		/*
		 * EX02.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double soma = 0.0;
		
		double[] numeros = new double[N];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			
			soma += numeros[i];
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for(int i=0; i<numeros.length; i++) {
			System.out.printf("%.1f ", numeros[i]);
		}
		
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", soma/numeros.length);
		
		sc.close();
		*/
		
		/*
		 * EX03.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		Pessoas[] pessoas = new Pessoas[N];
		
		String nome;
		int idade;
		double altura;
		double soma = 0.0;
		int contMenor = 0;
		String[] mnrs = new String[N];
		
		for(int i =0; i<pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			Pessoas pessoa = new Pessoas(nome, idade, altura);
			
			soma += pessoa.altura;
			
			if(pessoa.idade < 16) {
				contMenor++;
				mnrs[i] = pessoa.nome;
			}
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", soma/pessoas.length);
		double menores = (contMenor*100)/pessoas.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menores);
		
		for(int i=0; i<mnrs.length;i++) {
			if(!(mnrs[i] == null))
			System.out.println(mnrs[i]);
		}
		
		sc.close();
		*/
		
		/*
		 * EX04.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int cont = 0;
		int[] vect = new int[N];
		int[] pares = new int[N];
		
		for(int i=0; i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				cont++;
				pares[i] = vect[i];
			}
		}
		
		System.out.println();
		
		System.out.println("NUMEROS PARES:");
		
		for(int i = 0;i<pares.length;i++) {
			if(!(pares[i] == 0)) {
				System.out.print(pares[i] + " ");
			}	
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("QUANTIDADE DE PARES = " + cont);
		sc.close();
		*/
		
		/*
		 * EX05.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int N =sc.nextInt();
		
		double[] valores = new double[N];
		double maior = valores[0];
		int posicao = 0;
		
		for(int i=0;i<valores.length;i++) {
			System.out.print("Digite um numero: ");
			valores[i] = sc.nextDouble();
			
			if(valores[i] > maior) {
				maior = valores[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
		*/
		
		/*
		 * EX06.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i=0;i<c.length;i++) {
			c[i] = a[i]+b[i];
			System.out.println(c[i]);
		}
		
		sc.close();
		*/
		
		/*
		 * EX07.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		double[] valores = new double[N];
		double soma = 0.0;
		
		for(int i=0;i<valores.length;i++) {
			System.out.print("Digite um numero: ");
			valores[i] = sc.nextDouble();
			soma += valores[i];
		}
		
		System.out.println();
		double media = soma/valores.length;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i =0; i<valores.length;i++) {
			if(valores[i] < media) {
				System.out.println(valores[i]);
			}
		}
			
		sc.close();
		*/
		
		/*
		 * EX08.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		int[] elementos = new int[N];
		
		for(int i=0;i<elementos.length;i++) {
			System.out.print("Digite um numero: ");
			elementos[i] = sc.nextInt();
			
			if(elementos[i] % 2 == 0) {
				soma += elementos[i];
				cont++;
			}
		}
		
		if(cont != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", (double)soma/cont);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();
		*/
		
		/*
		 * EX09.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
		int velho = idades[0];
		int indiceProcurado = 0;
		
		for(int i=0; i<idades.length;i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			if(idades[i] > velho) {
				velho = idades[i];
				indiceProcurado = i;
			}
			
			
		}
		System.out.println("PESSOA MAIS VELHA: " + nomes[indiceProcurado]);
		
		sc.close();
		*/
		
		/*
		 * EX10.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[N];
		double[] ptri = new double[N];
		double[] stri = new double[N];
		
		for(int i=0; i<N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			nomes[i] = sc.nextLine();
			ptri[i] = sc.nextDouble();
			stri[i] = sc.nextDouble();
			
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i<nomes.length;i++) {
			if(((ptri[i] + stri[i])/2.0) >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N =sc.nextInt();

		double[] alturas = new double[N];
		char[] generos = new char[N];
		
		double menorAltura = Double.MAX_VALUE;
		double maiorAltura = alturas[0];
		int contHomens = 0;
		int contMulheres = 0;
		double alturaMulheres = 0.0;
		
		for(int i =0; i<N;i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);
			
			
			if(alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if(alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			
			if(generos[i] == 'M') {
				contHomens++;
			} else {
				contMulheres++;
				alturaMulheres += alturas[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", alturaMulheres/contMulheres);
		System.out.print("Numero de homens = " + contHomens);
		
		sc.close();
	}
}
