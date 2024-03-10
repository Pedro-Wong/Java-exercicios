package com.pedro.aula17;

public class LoopFor {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i+=1) {
			System.out.println("Numero " + i );
			
		}
		System.out.println("-------");
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i: " + i + "j:" +j);
			
		}
	}

}
