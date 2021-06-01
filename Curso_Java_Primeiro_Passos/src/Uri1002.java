import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a, n, x, area;
		a = sc.nextDouble();
		
		n = 3.14159;
		x = Math.pow(a, 2);
		
		area = n * x;
		
		System.out.printf("A=%.4f%n",area);
		
		sc.close();

	}

}
