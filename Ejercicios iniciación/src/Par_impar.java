import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		System.out.println("Introduzca un número: ");
		numero = teclado.nextInt(); 
		
		if (numero %2 == 0) {
			System.out.println(numero + " es par");
		}
		else {
			System.out.println(numero + " es impar");
		}
		teclado.close();
	}

}
