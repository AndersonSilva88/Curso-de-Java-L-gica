package Variaveis;

//import java.util.Locale;

public class Variaveis {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		int x = 32;
		System.out.println(x);
		
		double i = 10.35784;
		System.out.println(i);
		//com virgula
		System.out.printf("%.2f%n", i);
		//com ponto
		//Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", i);
		System.out.println("RESULTADO = "+i+" METROS ");
		System.out.printf("RESULTADO = %.2f METROS%n", i);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
