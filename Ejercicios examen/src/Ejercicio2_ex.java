
public class Ejercicio2_ex {

	/* 
	 * 1 punto
	 * 
	 * Define, despu�s de este comentario, un m�todo llamado 'stringToArray' que
	 * reciba a trav�s de un par�metro formal un objeto de tipo String y retorne
	 * un vector de caracteres de la misma longitud que la cadena recibida que 
	 * contenga los mismos caracteres que �sta y en el mismo orden. 
	 */

	// no es necesario, ya existe algo asi en ,a clase String
	
	public static char [] stringToArray(String cadena) {
		char [] vector = new char [cadena.length()];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = cadena.charAt(i);
		}
		return vector;
	}

	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el m�todo main las sentencias necesarias para poner a prueba
	 * el m�todo 'stringToArray' mostrando por pantalla el resultado de su ejecuci�n. 
	 */

	public static void main(String[] args) {
		char [] vector = stringToArray("hola");
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

}


