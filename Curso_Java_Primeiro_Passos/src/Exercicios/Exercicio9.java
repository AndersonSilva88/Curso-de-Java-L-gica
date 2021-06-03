package Exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int x = i * N;
			
			System.out.println(i + " X " + N + " = " + x);
		}
		
		sc.close();

	}

}
