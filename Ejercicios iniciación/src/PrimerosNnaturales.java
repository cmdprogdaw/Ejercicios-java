//Sumar los primeros N numeros naturales
import java.util.Scanner;

public class PrimerosNnaturales {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Dame un numero mayor a 0: ");
		int n = in.nextInt();
		int valor = 0;
		
		if (n > 0) {
			for (int i=1; i <= n; i++) {
				System.out.println(n + "+" + n++);
			}
		}
		else {
			System.out.println("No es mayor a 0");
		}
		
		
	}

}
