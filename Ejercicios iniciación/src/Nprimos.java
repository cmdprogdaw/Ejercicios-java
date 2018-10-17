import java.util.Scanner;

public class Nprimos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("¿Cuantos numeros primos desea generar? ");
		int n = in.nextInt();
		int candidato = 3;
		while(n > 0) {
			int divisor = candidato - 1;
			int resto;
			do {
				resto = candidato % divisor;
				divisor--;
			} while (divisor > 1 && resto > 0);
			if (resto != 0) {
				System.out.println(candidato + " es primo");
				n--;
			}
			candidato++;
		}
		
	}

}
