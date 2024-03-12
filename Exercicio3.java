package com.pedro.aula17;

import java.util.Scanner;

public class Exercicio3 implements Interface {

	public void metodo() {
		 Scanner scan = new Scanner(System.in);
		 boolean validacao = false;
		 int idade, salario;
		 String name, sexo, estado;
		 
		 do {
			 System.out.println("Digite seu nome: ");
			 name = scan.next();
			 
			 if(name.length() >= 3) {
				 validacao = true;
				 
			 }else {
				 System.out.println("Nome menor que 3 caracteres, digite um nome válido"); 
			 }
		 }while(!validacao);
		 
		 validacao = false;
		 
		 do {
			 System.out.println("Informe a idade: ");
			 idade = scan.nextInt();
			 
			 if(idade >= 0 && idade <= 150) {
				 validacao = true;
			 }else {
				 System.out.println("Idade inválida, digite novamente");
			 }
		}while(!validacao);
		 
		validacao = false; 
		
		do {
			System.out.println("Digite seu salário ");
			salario = scan.nextInt();
			if(salario > 0) {
				validacao = true;
			}else {
				System.out.println("Salario menor que zero, digite um número positivo");
			}
		}while(!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Digite seu sexo: f ou m");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				validacao = true;
			}else {
				System.out.println("Digite um sexo válido");
			}
		}while(!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Digite o estado civil:");
			estado = scan.next();
			if(estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("c") || estado.equalsIgnoreCase("v") || estado.equalsIgnoreCase("d")) {
				validacao = true;
			}else {
				System.out.println("Estado civil inválido, digite novamente: ");
			}
		}while(!validacao);
		 
	}
}
