import java.util.Random;

public class Prueba3 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int [][] matriz; //2 dimensiones en java los valores de ellas no pueden ser fijas
		matriz = new int[7][5]; //primer corchete filas y segundo columnas
		//recorremos la matriz de arriba a abajo y de izquierda a derecha
		for (int i = 0; i<7; i++) {
			for (int j = 0; j<5; j++) 
				matriz[i][j] = r.nextInt(100); //valores del 0 al 99
		}
		for (int i = 0; i<7; i++) {
			for (int j = 0; j<5; j++) 
				System.out.print(String.format("%2d ",matriz[i][j])); 
			/*Para fornatear la salida por pantalla:
			El % se llama especificador de formato y se sustiye en el formato final el resultado de formatear la cadena;
			La d dice que tegno que suministrar un numero entero ; 
			El 2 dice que cuando yo pase a cadena ese numero entero va a ser como max de 2 digitos y por defecto cuando
			  el num tenga menos de 2 que rellene con espacios en blanco si pones un espacio al final*/ 
			System.out.println();
		}
	}

}
