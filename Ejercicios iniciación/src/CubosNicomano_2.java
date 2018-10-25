 //Solo te hace el cubo del numero que has introducido
	
import java.util.Scanner;

	public class CubosNicomano_2 {

		public static void main(String[] args) {
	   
		Scanner in = new Scanner (System.in);
		System.out.println("Introduzca un numero: ");
		int n = in.nextInt();
		int imparIni = n * (n - 1) + 1;
		int imparFin = (n * n) + n - 1;
		int cubo = (int) Math.pow (n, 3);
		System.out.print(n + "^3 = ");
		
		for( int i = imparIni; i <=imparFin; i += 2) {
			if(i != imparFin) {
			System.out.print(i + " + ");
			}
			else {
			System.out.print(i);

			}
			
		}
		System.out.print(" = " + cubo);
	}

}
