import java.util.Random;
import java.util.Scanner;

/*Programa que cree un vector de n�meros enteros de un tama�o especificado por el usuario,
mayor que 1 y menor o igual que 50. El vector se llenar� con n�meros aleatorios
comprendidos entre -100 y 100 sin repetir ninguno. A continuaci�n se crear� un segundo
vector que contenga los elementos del anterior almacenados en orden inverso.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n;
		do {
			System.out.print("Dime la longitud del vector (entre 1 y 50): ");
			n = in.nextInt();
			if (n < 2 || n > 50)
				System.out.println("Tama�o incorrecto, introduce otro comprendido entre 1 y 50");
		}while(n < 2 || n > 50);
		
		int [] vector = new int [n];
		Random r = new Random();
		
		for(int i = 0; i < n; i++) {
			vector[i] = r.nextInt(201) - 100;
		}
		int [] vectoralreves = new int [vector.length];
		for(int i = 0; i < n; i++) {
			vectoralreves[vector.length - i - 1] = vector [i];
		}
		for(int i = 0; i < n; i++) {
			System.out.print(vector [i] + "  ");
		}
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.print(vector [i] + "  ");
		}
	}
}


