package com.pedro.aula17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número ");
		int f1 = scan.nextInt();

		int fatorial = 1;

		for (int i = f1; i > 0; i--) {
			fatorial *= i;
			
		}
		System.out.println(fatorial);
	}

}
