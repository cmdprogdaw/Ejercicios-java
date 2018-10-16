import java.util.Random;
import java.util.Scanner;

public class Divisible2 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	
	System.out.println("¿comprobar si un número es divisible entre otro? (s/n)");
	String respuesta = in.next();
	while (respuesta.equals("s".toLowerCase())) { //toLowerCase es para que te lo lea como mayuscula o minuscula
		System.out.println("introduce un número: "); 
		int x = in.nextInt();
		System.out.println("introduce otro número: ");
		int y = in.nextInt();
		
		if(x%y==0) {
			System.out.println(x + " es divisible por " + y);
		}
		else {
			System.out.println(x + " no es divisible por " + y);
			System.out.println("¿comprobar si un número es divisible entre otro? (s/n)");
			respuesta = in.next();
		}
		
		

	}
	
		
	}



}
