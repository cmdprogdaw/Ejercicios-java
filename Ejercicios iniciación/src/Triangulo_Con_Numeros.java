//Anidando bucles y con los digitos /0, ...., 9) se pueden escribir triangulos interesting 
public class Triangulo_Con_Numeros {

	public static void main(String[] args) {
		
		
		for(int i = 1 ; i <= 10 ; i++ ) {
			int n = 1 % 10;
			int espacios = 10 - i;
			int digitos = i + i - 1;
			
			for (int j = 0; j < espacios; j++) {
				System.out.println(" ");
			}
			//ggg
			for (i = n; i == n; i++) {
				System.out.println(n);
			}
			
			
			System.out.println();
		}
	
		
	}

}
