
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
	
	
	static void tablero (int f, int c, int l) {
		int ctxt = c * l;
		int ftxt = f * l;
		for (int i = 0; i < ftxt; i++) {
			for (int j = 0; j < ctxt; j++) {
				int ctab = j / l;
				int ftab = i / l;
				if ((ftab % 2 == 0 && ctab % 2 != 0) || (ftab % 2 != 0 && ctab % 2 == 0)) {
					System.out.print("*"); 
				}
				else {
					System.out.print(" "); 
				}
				
			}
			System.out.println();
		}
	}
	
//	static void tablero (int f, int c, int l) {
//		for (int i = 0; i < f; i++) {
//			for (int j = 0; j < l; j++) {
//				for (int z = 0; z < c; z++) {
//					for (int r = 0; r < l; r++) {
//						if ((i % 2 == 0 && z % 2 != 0) || (i % 2 != 0 && z % 2 == 0)) {
//							System.out.print("*"); 
//						}
//						else {
//							System.out.print(" "); 
//						}
//					}
//					
//				}
//				System.out.println();
//			}
//
//		}
//	}
	
	
	
	
//	static void tablero (int n, int m) {
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 3; j++) {
//				for (int z = 0; z < m; z++) {
//					if ((i % 2 == 0 && z % 2 != 0) || (i % 2 != 0 && z % 2 == 0)) {
//						System.out.print("***"); 
//					}
//					else {
//						System.out.print("   "); 
//					}
//				}
//				System.out.println();
//			}
//			
//		}
//	}
	
	
	public static void main(String[] args) {
	  volcan(6);
	  mosaico(8, 8);
	  tablero (8, 8, 3);
	}

}
