import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	/*Programa que cree un vector de n�meros enteros de un tama�o especificado por el usuario,
	mayor o igual que 10 y menor o igual que 1.000.000. El vector se llenar� con n�meros
	aleatorios comprendidos entre -100 y 100. A continuaci�n mostrar� la suma de los n�meros
	almacenados. Teniendo en cuenta que hay quien piensa que el n�mero 13 es el n�mero de
	la mala suerte, si se encuentra almacenado en alguna posici�n del vector, no se sumar� ni
	este n�mero ni los que se encuentren almacenados en las 13 posiciones siguientes (o las
	que haya hasta el final del vector si estas son menos de 13) si la suma de todos ellos es
	distinta de 7.*/
	
	public static void main(String[] args) {
//		Scanner in = new Scanner (System.in);
//		int n;
//		do {
//			System.out.print("Dime la longitud del vector (entre 10 y 1.000.000): ");
//			n = in.nextInt();
//			if (n < 10 || n > 1000000)
//				System.out.println("Tama�o incorrecto, introduce otro comprendido entre 10 y 1.000.000");
//		}while(n < 10 || n > 1000000);
//
//		int [] vector = new int[n];
//		Random r = new Random();
//		for (int i = 0; i<n; i++) {
//			vector [i] = r.nextInt(201) - 100;
	
		
		int [] vector = {
				-7,41,23,13,2,9,70,-4,5,5,
				-4,-2,10,11,21,31,-31,40,50
	     };
				
		int suma = 0;
		int parcial;
		for (int i = 0; i<vector.length ;i++) {
			if (vector[i] != 13)
				suma += vector[i];
			else {
				parcial = vector[i];
				for (int j=i+1; j<vector.length && j<=i+13;j++) {
					parcial += vector[i];
				}
				if (parcial == 7)
					suma += parcial;
				i+=13;
			}	
		}
		System.out.println("Suma: " + suma);
	}
}
