package com.pedro.aula17;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o expoente: ");
		int n2 = scan.nextInt();
		
		
		int resu = n1;
		
		for(int i = 1; i <= n2; i++) {
			resu *= n1;
		}
		System.out.println("O resultado é : " + resu);
	}

}
