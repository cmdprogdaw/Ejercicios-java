import java.util.Scanner;

public class PrecioconIVA {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		float precio = in.nextFloat();
		System.out.println("Tipo de iva: (0) 7% - (1) 10% - (2) 21%");
		int tipoIVA = in.nextInt();
		
//		float iva = tipoIVA == 0 ? 0.07f : tipoIVA == 1 ? 0.1f : tipoIVA == 2 ? 0.21F : 0;
//		if (iva == 0)
//			System.out.println("El tipo de IVA no es correcto");
//		else {
//			double totalIVA = precio * iva;
//			double total = precio + totalIVA;
//			System.out.println("Total IVA: " + totalIVA);
//			System.out.println("Total: " + total);
//		}
		
		float iva = 0;
		
		if (tipoIVA == 0)
			iva = 0.07f;
		else if (tipoIVA == 1)
			iva = 0.1f;
		else if (tipoIVA == 2)
			iva = 0.21f;
		else
			System.out.println("El tipo de IVA no es correcto"); //Si el usuario no introduce el tipo de IVA correcto
		
		if (iva != 0) {        // otra opción (tipoIVA >= 0 && tipoIVA <= 2) para saber que el tipo de iva esta entre 0 y 2
			double totalIVA = precio * iva;
			double total = precio + totalIVA;
			System.out.println("Total IVA: " + totalIVA);
			System.out.println("Total: " + total);
		}
		
		in.close();
	}

}
