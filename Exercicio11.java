package com.pedro.aula17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Número 1: ");
		int n1 = scan.nextInt();
		System.out.println("Número 2: ");
		int n2 = scan.nextInt();

		int conv = 0;
		if (n1 > 0 && n2 > 0) {
			if (n1 < n2) {
				for (; n1 < n2 - 1;) {
					n1 += 1;
					conv += n1;
					System.out.println(n1);
				}
			} else {
				for (; n1 > n2 + 1;) {
					n1 -= 1;
					conv += n1;
					System.out.println(n1);			
				}
			}
		}else {
			
			if(n1 < n2) {
				for(;n1 < n2 - 1;) {
					n1 += 1;
					conv += n1;
					System.out.println(n1);
				}
			}else {
				for(;n1 > n2 + 1;) {
					n1 -= 1;
					conv += n1;
					System.out.println(n1);
				}
			}
		}
		
		System.out.println("A soma do intervalo é " + conv);
	}
}



