import java.util.Random;

public class CompararNúmeros {

	public static void main(String[] args) {
		Random r = new Random(); //para que genere números aleatorios
		int numero1 = r.nextInt(1000); //para que genere aleatorios números del 0 al 999
		int numero2 = r.nextInt(1000);
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);

		//condicional compuesta
		if (numero1 > numero2) 
			System.out.println(numero1 + "es mayor que" + numero2);
			
		else
			System.out.println(numero2 + "es mayor que" + numero1);
		
		
	}

}
