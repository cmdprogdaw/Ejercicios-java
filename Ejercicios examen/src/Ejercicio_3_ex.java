
public class Ejercicio_3_ex {

	/*
	 * 1 punto
	 * 
	 * En codingbat.com se propone el problema siguiente (Array-3/fix45):
	 * 
	 * Retornar un array de n�meros enteros que contenga exactamente los mismos
	 * n�meros que un array dado, pero reorganizados de forma que cada a cada 4
	 * le sigua un 5. Los 4 conservar�n su posici�n original, condici�n que no
	 * han de cumplir el resto de n�meros.
	 * 
	 * El array original cumplir� las condiciones siguientes: 
	 * 	- Contiene la misma cantidad de 4 que de 5.
	 *  - Cada 4 ir� seguido de un n�mero distinto de 4.
	 *  - Los 5 pueden aparecer en cualquier posici�n.
	 * 
	 * A continuaci�n se propone una soluci�n a este problema en la que se utiliza
	 * un bucle 'for' interno para buscar un valor 5 cada vez que se encuentra un
	 * valor 4 que no est� seguido de un valor 5. La b�squeda solo est� interesada
	 * en los valores 5 que no est�n precedidos de un valor 4 y en buscar a partir
	 * de la posici�n en la que acabo la b�squeda anterior (la primera b�squeda
	 * comenzar� en la posici�n 0). Una vez encontrado el valor 5 adecuado, se procede
	 * a su intercambio con la posici�n que le sigue al valor 4 que no est� seguido 
	 * del valor 5.
	 * 
	 * Se pide sustituir el bucle 'for' interno por un bucle 'while' en el que la condici�n de
	 * bucle no utilice el operador l�gico ! (no confundir con el operador de
	 * comparaci�n !=)
	 */
	
	public static int [] fix45(int [] nums) {
		int j = 0;
		for (int i=0; i<nums.length-1; i++)
			if (nums[i] == 4 && nums[i+1] != 5) {
				while(nums[j] != 5 || (j != 0 && nums[j - 1] == 4)){
					j++;
				nums[j] = nums[i + 1];
				nums[i + 1] = 5;	
				}
					
//				for (; !(nums[j] == 5 && (j == 0 || nums[j - 1] != 4)); j++);
//				nums[j] = nums[i + 1];
//				nums[i + 1] = 5;
			}
		return nums;
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el m�todo main las sentencias necesarias para poner a prueba
	 * el m�todo 'fix45' mostrando por pantalla el resultado de su ejecuci�n. 
	 */
	
	public static void mostrarVector(int [] vector) {
		System.out.print("[");
		for (int i=0; i<vector.length; i++)
			System.out.print("'" + vector[i] + "'" + (i == vector.length - 1 ? "" : ", "));
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int [] vector = {5, 4, 9, 4, 9, 5};
		mostrarVector(vector);
		fix45(vector);
		mostrarVector(vector);
	}
}
