import java.util.Scanner;

public class CubosNicomano {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int impar = -1;
		int n;
		System.out.println("Numero de cubos a calcular");
		n = in.nextInt();

		for (int i = 1; i <= n; i++) { //cuenta el numero de linea/impares que tenemos que sumar
			impar = impar + 2;
			int suma = impar;
			for (int j = 2; j <= i; j++) {
				impar = impar + 2;
				suma = suma + impar;
			}
		System.out.println(i + "^3 = " + suma);
		}

	}
}

//Otra forma
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Numero entero: ");
//		int n = in.nextInt();
//		int sgteImpar = 1;
//		for (int i=1; i<=n; i++) {
//			int acumulador = 0;
//			for (int j=1; j<=i; j++) {
//				acumulador += sgteImpar;
//				sgteImpar += 2;
//			}
//			System.out.println(i + "^3 = " + acumulador);
//		}
//
//	}
//
//}

//Otra forma con la linea de la suma de los impares
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	System.out.println("Numero entero: ");
//	int n = in.nextInt();
//	int sgteImpar = 1;
//	for (int i=1; i<=n; i++) {
//		int acumulador = 0;
//		for (int j=1; j<=i; j++) {
//			System.out.println(sgteImpar + ((j !
//			acumulador += sgteImpar;
//			sgteImpar += 2;
//		}
//		System.out.println(i + "^3 = " + acumulador);
//	}
//
//}
//
//}
	
// Solo te hace el cubo del numero que has introducido
//	public static void main(String[] args) {
//	   
//		Scanner in = new Scanner (System.in);
//		System.out.println("Introduzca un numero: ");
//		int n = in.nextInt();
//		int imparIni = n * (n - 1) + 1;
//		int imparFin = (n * n) + n - 1;
//		int cubo = (int) Math.pow (n, 3);
//		System.out.print(n + "^3 = ");
//		
//		for( int i = imparIni; i <=imparFin; i += 2) {
//			if(i != imparFin) {
//			System.out.print(i + " + ");
//			}
//			else {
//			System.out.print(i);
//
//			}
//			
//		}
//		System.out.print(" = " + cubo);
//	}
//
//}

