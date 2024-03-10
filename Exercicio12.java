package com.pedro.aula17;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean validacao = true;
		int tabuada = 0;
		int multiplicacao = 0;
		
		do {
			System.out.println("Digite qual tabuada deseja ver");
			tabuada = scan.nextInt();
			
			if(tabuada >= 1 && tabuada <= 10) {
				validacao = false;
			}else {
				System.out.println("Número inválido para tabuada");
			}
		}while(validacao);
		
		for(int i = 1; i <= 10; i++) {
			multiplicacao = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + multiplicacao);
		}
	}

}
