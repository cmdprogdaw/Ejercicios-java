import java.util.Scanner;

//Dados tres numeros que son la longitud de tres segmentos ver si se puede construir un triangulo 
public class Triangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce las longitudes de tres segmentos: ");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("Se puede formar un triangulo");
		}
		else {
			System.out.println("Pa tu casa");
			
			
			//ggg
			in.close();
		}
	}

} 