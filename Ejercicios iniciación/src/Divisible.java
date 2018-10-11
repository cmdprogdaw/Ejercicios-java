import java.util.Random;

public class Divisible {

	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(749) + 5; //del 0 al 748, pero le sumas 5 y genera numeros entre 5 y 753 porque al 748 sumas los 5 y al 0 los 5
		int y = r.nextInt(749) +5;
		
		if (x % y == 0) {
			System.out.println(x + " es divisible entre " + y);
		}
		else {
			System.out.println(x + " no es divisible entre " + y);
		}
	}

}
