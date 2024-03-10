package com.pedro.aula17;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Exercicio e1 = new Exercicio();
		Exercicio2 e2 = new Exercicio2();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Exercicios em JAVA");
		System.out.println("----------------------------------------------------------");
		
		boolean validation = true;
		int numeroExercicio = 0;
		int count = 0;
		
		
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
			
			default: System.out.println("Número de exercicio não é válido");
		}
	}

}
