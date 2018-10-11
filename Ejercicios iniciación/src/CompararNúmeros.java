import java.util.Random;

public class CompararNúmeros {

	public static void main(String[] args) {
		Random r = new Random(); //para que genere números aleatorios
		int numero1 = r.nextInt(1000); //para que genere aleatorios números del 0 al 999
		int numero2 = r.nextInt(1000);
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);

		//condicional compuesta
		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}
		else {
			if (numero1 < numero2) {
				System.out.println(numero1 + " es menor que " + numero2);
			}
			else {
				System.out.println(numero2 + " es igual que " + numero1);
			}	
		}
		
		/* otra opción, esta ejecuta las tres condicionales porque son "if"
		if (numero1 > numero2) {
			System.out.println(numero1 + "es mayor que" + numero2);
		}
		
		if (numero1 < numero2) {
			System.out.println(numero1 + "es menor que" + numero2);
		}
		
		if (numero1 == numero2) {
			System.out.println(numero1 + "es igual que" + numero2);
		}
		*/
	}
}