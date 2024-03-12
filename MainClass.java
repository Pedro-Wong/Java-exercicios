package com.pedro.aula17;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Exercicio e1 = new Exercicio();
		Exercicio2 e2 = new Exercicio2();
		Exercicio3 e3 = new Exercicio3();
		Exercicio4 e4 = new Exercicio4();
		Exercicio6 e6 = new Exercicio6();
		
		Scanner scan = new Scanner(System.in);
		boolean validacao2 = true;
		
		do {
			boolean validation = true;
			int numeroExercicio = 0;
			int count = 0;
			
			
			System.out.println("Exercicios em JAVA");
			System.out.println("----------------------------------------------------------");
			
			for(int i = 0; i < 15;i++) {
				 System.out.println("Exercicio " + (i+1));
				 count += 1;
			}
			
			System.out.println("----------------------------------------------------------");
		
		
			
	
			do {
				
				System.out.println("Digite qual exercicio deseja ver:");
				numeroExercicio = scan.nextInt();
				
				if(numeroExercicio > 0 && numeroExercicio <= count) {
					validation = false;
				}else {
					System.out.println("Numero de exercicio inválido ");
					
				}
				
			}while(validation);
			
			
			System.out.println( " ");
			
			switch(numeroExercicio) {
				case 1:
					System.out.println("Exercicio 1");
					System.out.println("----------------------------------------------------------");
					e1.metodo(); 
					break;
				case 2: 
					System.out.println("Exercicio 2");
					System.out.println("----------------------------------------------------------");
					e2.metodo();
					break;
				case 3:
					System.out.println("Exercicio 3");
					System.out.println("----------------------------------------------------------");
					e3.metodo();
					break;
				case 4:
					System.out.println("Exercicio 4");
					System.out.println("----------------------------------------------------------");
					e4.metodo();
					break;
				case 6:
					System.out.println("Exercicio 6");
					System.out.println("----------------------------------------------------------");
					e6.metodo();
					break;
				
				default: System.out.println("Número de exercicio não é válido");
			} 
			
			System.out.println("Deseja continuar a ver os exercicíos? S / N");
			String vali = scan.next();
			
			if(vali.equalsIgnoreCase("n")) {
				System.out.println("fim de execução");
				validacao2 = false;
			}else if(vali.equalsIgnoreCase("s")) {
				validacao2 = true;
			}else {
				System.out.println("Informação inserida diferente de S ou N");
			}
			
		}while(validacao2);
	}

}
