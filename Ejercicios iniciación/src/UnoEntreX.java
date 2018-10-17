
public class UnoEntreX {

	public static void main(String[] args) {
		
		float fx; 
//		for (float x=-5; x<=5; x++) solucion mejor
		for (int x=-5; x<=5; x++) {
//			fx = 1 / x;           es una division entre numeros enteros y al estar en int daria solo algo entero
//			fx = 1 / (float)x;    solucion
			fx = 1f / x;        //solucion
			System.out.println("f(" + x + ") = " + fx); //concatena; this is a cadena
		}
	}

}
