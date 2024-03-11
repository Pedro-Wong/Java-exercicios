package com.pedro.aula17;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int keep = 0;
		int keep2 = 0;
		
		for(int i =0; i < 10; i++) {
			System.out.println("Digite o " + (i+1)+ " número");
			int res = scan.nextInt();
			
			if(res % 2 == 0) {
				keep += 1;
			}
			
			if(res % 2 != 0) {
				keep2 += 1;	
			}
		}
		System.out.println("Há "+ keep + " números pares");
		System.out.println("Há "+ keep2 + " números ímpares");

	}

}
