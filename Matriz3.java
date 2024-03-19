package com.pedro.aula17;

import java.util.Scanner;
import java.util.Random;

public class Matriz3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Número de linhas:");
		int n1 = scan.nextInt();
		System.out.println("Número de colunas:");
		int n2 = scan.nextInt();
		System.out.println("Número da profundidade");
		int n3 = scan.nextInt();

		int[][][] matriz = new int[n1][n2][n3];
		int par = 0;
		int impar = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {
					matriz[i][j][k] = (int) (Math.random() * 10);
					System.out.print(matriz[i][j][k]);

					if (matriz[i][j][k] % 2 == 0) {
						par++;
					} else {
						impar++;
					}

				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("impar: " + impar);
		System.out.println("par:" + par);
	}
}
