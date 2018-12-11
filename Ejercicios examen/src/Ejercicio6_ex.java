import java.util.Random;

public class Ejercicio6_ex {
	 /*  2,5 puntos
	 * 
	 * Escribe en el m�todo 'main' un programa que cree un vector de n�meros enteros de un
	 * tama�o aleatorio comprendido entre 100 y 500. Una vez creado lo llenar� llenar� con
	 * n�meros aleatorios comprendidos entre 0 y 1000000. Despu�s de llenar el vector 
	 * mostrar� la m�nima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posici�n [i] (excepto
	 * la primera) menos el valor almacenado en la posici�n [i-1].
	 */
		
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(401) + 100;
		int [] vector = new int [n];
		for (int i = 0; i < n; i++) {
			vector[i] = r.nextInt(1000001);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			int diferencia = vector[i] - vector [i -1];
			if (diferencia < min) {
				min = diferencia;
			}
		}
		System.out.println("Difencia minima " + min);
	}
}
