
public class DibujosConAsteristos {
	
	static void volcan (int h) {
		int espacios;
		int asteriscos = 2;
		int total = (int) Math.pow(2,h)/2;
		for(int i = 0; i < h; i++) {
			espacios = total - asteriscos/2; 
			for(int j = 0; j < espacios; j++) {
				
				System.out.print(" ");
				
			}
			for(int j=0; j < asteriscos; j++) {
				
				System.out.print("*");

			}
			asteriscos += asteriscos;
			System.out.println();
					
		}
	}
	
	static void mosaico (int f, int c) {
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))
					System.out.print("*");
				else
					System.out.print(" ");
//			System.out.println((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0));
			}
			System.out.println();
		}
	}

	static void tablero (int n, int m) {
		int escaque = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
					System.out.print("*"); System.out.print("*"); System.out.print("*");
				}
				else {
					System.out.print(" "); System.out.print(" ");System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
	  volcan(6);
	  mosaico(8, 8);
	  tablero (8, 8);
	}

}
