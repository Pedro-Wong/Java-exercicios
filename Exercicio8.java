package com.pedro.aula17;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		int media = 0;
		
		for(int i = 1; i<=1; i++) {
			for(int x = 1; x<=5; x++) {
				System.out.println("Digite o número:");
				int numero = scan.nextInt();
				soma += numero;	
			}
			media += soma/5;
		}
		System.out.println("soma " + soma);
		System.out.println("media " + media);
	}
		
}
