package com.pedro.aula17;
import java.util.Random;
public class Matriz2 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [10][10];
		
		
		for(int i = 0; i < matriz.length;i++ ) {
			for(int j=0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random()*9);
				System.out.print(matriz[i][j]);
				
			}
			System.out.println("");
		}
		System.out.println("");
		int max = 10;
		int min = 0;
		
		for(int y = 0; y < matriz[5].length; y++) {
			if(matriz[5][y] > min) {
					min = matriz[5][y];
			}
			if(matriz[5][y] < max) {
				max = matriz[5][y];
			}
			System.out.println(matriz[5][y]);
		}
		System.out.println("maior número da linha 5 " + min);
		System.out.println("menor número da linha 5 " + max);
	}

}
