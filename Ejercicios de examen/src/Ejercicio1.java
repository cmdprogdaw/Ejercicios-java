//Cruz con asteriscos
import java.util.Scanner;

public class Ejercicio1 {

	static int obtenerFC(String fc) { //metodo
		Scanner in = new Scanner (System.in);
		int x;
		do { 
			System.out.println("Numero de " + fc + ": ");
			x = in.nextInt(); 
			if (x < 3 || x % 2 == 0)
				System.out.println("Numero de " + fc + " incorrecto, vuelve a escribirlo");
		} while (x < 3 || x % 2 == 0);
//		} while (n >= 3 && n % 2 == 1)
		return x;
	}
	
	public static void main(String[] args) {
		
		int n = obtenerFC("filas"); //invocacion al metodo .      int n = obtenerFC()+ 10 le suma diez a la que a lo que le retorna 
		int m = obtenerFC("columnas");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == n /2 || j == m / 2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		do { 
//			System.out.println("Numero de columnas: ");
//			m = in.nextInt(); 
//			if (m < 3 || m % 2 == 0)
//				System.out.println("Numero de columnas incorrecto, vuelve a escribirlo");
//		} while (m < 3 || m % 2 == 0);
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++)
//				System.out.print((i == n /2 || j == m / 2) ? "*" : " ");
//			System.out.println();
//		
//		
//		}
		
		
		
		/*for (int i = 0; i < n; i++) {
			
			if (i == n  / 2) {
				for (int j = 0; j < m; j++)
					System.out.print("*");
			}
			else {
				for (int j = 0; j < m; j++)
					if ( j == m / 2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
		
			}
			
			System.out.println();
		}
		
		*/

	}

}
