package com.pedro.aula17;
import java.util.Scanner;


public class Exercicio implements Interface{

		public void metodo(){
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite a nota: ");
			int nota = scan.nextInt();
			boolean condicao = true;
			
			while(condicao) {
				if(nota < 0 || nota > 10) {
					System.out.println("Nota inválida, digite uma nota válida:  ");
					nota = scan.nextInt();
				}else {
					System.out.println("Nota válida: " + nota);
					System.out.println("Fim do programa.");
					condicao = false;
				}	
			}	
		
	}
		
		
		
	
}
