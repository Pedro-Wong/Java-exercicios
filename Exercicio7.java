package com.pedro.aula17;

import java.util.Scanner;

public class Exercicio7 implements Interface {

	public void metodo() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int maior = Integer.MIN_VALUE;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o número");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
				System.out.println(maior);
			}
		}

	}

}
