package com.pedro.aula17;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número1");
		int n1 = scan.nextInt();
		
		System.out.println("Número2");
		int n2 = scan.nextInt();
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		int soma = 0;
		
		if(n2 > n1) {
			for(int i = n1; i <= n2; i++) {
				if(n2 < max) {
					max = n2;
				}
				if(n1 > min) {
					min = n1;
				}
				
				soma += i; 
				
				
				
			}
			System.out.println(min + " menor");
			System.out.println(max + " maior");
			System.out.println(soma + " soma");
		}else {
			for(int i = n1; i >= n2; i--) {     // n2 < n1  5 e 1
				if(n1 < max) {
					max = n1;
				}
				if(n2 > min) {
					min = n2;
				}
				soma += i;
				
			}
			System.out.println(min + " menor");
			System.out.println(max + " maior");
			System.out.println(soma + " soma");
		}
		
		
		
		
		
		
		

	}

}
