import java.util.Arrays;
import java.util.Random;

public class Ejercicio4_ex {
	/* 
	 * 1 punto
	 * 
	 * Define, despu�s de este comentario, un m�todo llamado 'arrayAleatorioOrdenado' que
	 * reciba en un par�metro formal un n�mero entero que determinar� la dimensi�n de un
	 * vector de n�meros enteros que tendr� que crear y rellenar con n�meros aleatorios
	 * comprendidos entre 975 y 13579 y ordenados de menor a mayor a partir de la posici�n 0.
	 * Finalmente retornar� el array.
	 */
	
	public static int[] arrayAleatorioOrdenado (int n) {
		int [] vector = new int[n];
		Random r = new Random();
		for (int i=0; i<n; i++)
			vector[i] = r.nextInt(13579 - 975 + 1) + 975;
		Arrays.sort(vector);
		return vector;
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el m�todo main las sentencias necesarias para poner a prueba el m�todo
	 * 'arrayAleatorioOrdenado' mostrando por pantalla el resultado de su ejecuci�n. 
	 */
	
	public static void main(String[] args) {
		
	}


}
