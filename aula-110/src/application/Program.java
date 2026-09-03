package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int negativos = 0;
		int cont = 0;
		
	int[][] mat = new int [num][num];	
	int[] vet = new int [num];
	
	for(int i = 0; i<num; i++) {
		for(int j = 0; j<num; j++) {
			mat[i][j] = sc.nextInt();
			
			if(i == j) {
				vet[cont] = mat[i][j];
				cont++;
			}
			
			if(mat[i][j] < 0) {
				negativos++;
			}
		}
	}
	
	System.out.println("Main diagonal: ");
	for(int el: vet) {
		System.out.print(el + " ");
	}
	System.out.println("\nNegative numbers = " + negativos);

		sc.close();
	}

}
