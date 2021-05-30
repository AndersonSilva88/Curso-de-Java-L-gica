package Variaveis;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Voce Digitou: " + x);
		System.out.println("-------------------");
		System.out.println("Digite um numero: ");
		int i;
		i =sc.nextInt();
		System.out.println("voce digitou numero: " + i);
		System.out.println("-------------------");
		System.out.println("Digite um numero flutuante ");
		double b;
		b = sc.nextDouble();
		System.out.println("voce digitou: " + b);
		//exemplo com virgula
		
		
		sc.close();
	}

}
