package com.pedro.aula17;
import java.util.Random;
public class Matriz1 {

	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		int maior = 0;
		int max = 0;
		for(int i = 0; i < matriz.length;i++) {
			for(int j = 0;j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random()*10)+1;
				System.out.println(matriz[i][j]);
				if(matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
			System.out.println("");
		}
		
		System.out.println("Maior de todos " + max);
	}

}
