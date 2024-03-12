package com.pedro.aula17;
import java.util.Scanner;


public class Exercicio2 implements Interface{

	public void metodo() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu usuário");
		String nomeUsuario = scan.next();
		System.out.println("Digite a sua senha");
		String senha = scan.next();
		
		boolean condicao = true;
		
		while(condicao) {
			if(senha.equalsIgnoreCase(nomeUsuario)) {
				System.out.println("Senha não pode ser igual nome de usuario, digite uma nova senha: ");
				senha = scan.next();
			}else {
				System.out.println("Senha OK");
				condicao = false;
			}
		}
		

	}

}
