import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float precio;
		float factor;
		String iva;
		float pvp;
		System.out.println("Introduce el precio del producto: "); 
		precio = teclado.nextFloat();
		System.out.println("El precio introducido es: " + precio + " euros");
		
	}

}
