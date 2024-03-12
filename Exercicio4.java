package com.pedro.aula17;
import java.util.Scanner;

public class Exercicio4 implements Interface {

	public void metodo() {
		Scanner scan = new Scanner(System.in);
		
		/*
		int populacao1 = 80000;
		int populacao2 = 200000;
		*/
		
		int store1  = 0;
		boolean validacao = true;
		double popAA = 0;
		double popBB = 0;
		double taxaA = 0;
		double taxaB = 0;
		
		/*
		System.out.println("Digite a população A");
		double popA = scan.nextDouble();
		System.out.println("Digite a população B");
		double popB = scan.nextDouble();
		System.out.println("Digite a taxa de A");
		double taxaA = scan.nextDouble();
		System.out.println("Digite a taxa de B");
		double taxaB = scan.nextDouble();
		*/
		
		
		
		do {
			System.out.println("Digite a popA");
			popAA = scan.nextDouble();
			
			if(popAA < 0) {
				System.out.println("Número da populacao menor que zero");
			}else {
				validacao = false;
			}
			
			
		}while(validacao);
		
		
		 
		validacao = true;
		
		do {
			System.out.println("Digite a população B : ");
			popBB = scan.nextInt();
			
			if(popBB < 0) {
				System.out.println("Número da populacao B menor que zero");
				
			}else {
				validacao = false;
			}
		}while(validacao);
		
		validacao = true;
		
		do {
			System.out.println("Digite a taxa de A");
			taxaA = scan.nextDouble();
			if(taxaA < 0) {
				System.out.println("Taxa de crescimento de A menor que zero");
			}else {
				validacao = false;
			}
		}while(validacao);
		
		validacao = true;
		
		do {
			System.out.println("Digite a taxa de B");
			taxaB = scan.nextDouble();
			
			if(taxaB < 0) {
				System.out.println("Taxa de crescimento de B menor que zero");
			}else {
				validacao = false;
			}
		}while(validacao);
		
		
		while(popAA < popBB) {
			popAA += (popAA/100) * taxaA;
			popBB += (popBB/100) * taxaB;
			store1++;
		}
		System.out.println("populaçao A: " + popAA);
		System.out.println("populaçao B: " + popBB);
		System.out.println("Anos: " + store1);
		
	}
}
