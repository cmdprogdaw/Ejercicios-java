import java.util.Scanner;

public class CálculoPVPBucle {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el precio: ");
		float precio = teclado.nextFloat();
		
		System.out.println("Tipo de IVA: (0) 7% - (1) 10% - (2) 21%");
		int tipoIVA = teclado.nextInt();
		float iva = 0;
		
		if (tipoIVA == 0)
			iva = 0.07f;
		else if (tipoIVA == 1)
			iva = 0.1f;
		else if (tipoIVA == 2)
			iva = 0.21f;
		else
			System.out.println("El tipo de IVA no es correcto"); //Si el usuario no introduce el tipo de IVA correcto
		
		if (iva != 0) {        // otra opción (tipoIVA >= 0 && tipoIVA <= 2) { //para saber que el tipo de iva esta entre 0 y 2
			double totalIVA = precio * iva;
			double total = precio + totalIVA; 
		}
		
		teclado.close();
	}

}
