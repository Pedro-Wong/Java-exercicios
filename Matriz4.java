package com.pedro.aula17;

import java.util.Random;
import java.io.Console;
import java.util.Scanner;

public class Matriz4 implements Interface {

	public  void metodo() {
		String[][] agenda = new String[30][24];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < agenda.length; i++) {
			for (int j = 0; j < agenda[i].length; j++) {
				agenda[i][j] = " Sem compromisso agendado ";
			}
		}

		boolean condicao = true;
		boolean condicao0 = true;
		int data = 0;
		int hora = 0;

		System.out.println("Agenda pessoal");
		System.out.println("-------------------");

		while (condicao0) {
			data = 0;
			hora = 0;
			System.out.println("Voce deseja consultar ou agendar um novo compromisso? [C] ou [A]");
			String letra = scan.next();

			if (letra.equalsIgnoreCase("a")) {
				condicao = true;
				while (condicao) {
					System.out.println("Digite a data:");
					data = scan.nextInt();

					if (data <= 0 || data > 31) {
						System.out.println("Data inválida");

					} else {
						condicao = false;
					}

				}

				condicao = true;
				while (condicao) {
					System.out.println("Digite a hora da atividade: ");
					hora = scan.nextInt();

					if (hora <= 0 || hora > 24) {
						System.out.println("Hora inválida");
					} else {
						condicao = false;
					}
				}

				System.out.println("Digite seu planejamento para o dia " + data + " no horário de " + hora + " hora");
				scan.nextLine();
				agenda[data][hora] = scan.nextLine();

			} else if (letra.equalsIgnoreCase("c")) {
				condicao = true;
				while (condicao) {
					scan.nextLine();
					System.out.println("Digite a data:");
					data = scan.nextInt();

					if (data <= 0 || data > 31) {
						System.out.println("Data inválida");

					} else {
						condicao = false;
					}

				}

				condicao = true;
				while (condicao) {
					scan.nextLine();
					System.out.println("Digite a hora da atividade: ");
					hora = scan.nextInt();

					if (hora <= 0 || hora > 24) {
						System.out.println("Hora inválida");
					} else {
						condicao = false;
					}
				}
				System.out.println(
						"O compromisso do dia  " + data + " às " + hora + " hora " + " é: " + agenda[data][hora]);
				System.out.println(" ");
			}
		}
	}
}
