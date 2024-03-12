package com.pedro.aula17;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		
		System.out.println("Digite o primeiro");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo");
		int numero2 = scan.nextInt();

		int n3 = 0;
		
		for(int i = 0; i < 15; i++) {
			n3 = numero1 + numero2; 
			numero1 = numero2; 
			numero2 = n3; 
				
			System.out.println(n3);
		}

	}

}
