
public class Prueba {

	public static void main(String[] args) {
		int [] x = {47, 31, 2, 5};  //int x [];
		
		for (int e: x)
			System.out.println(e * 4);
		
//		for(int i = 0; i < x.length; i++) {
//			System.out.println(x [i] * 4);
//		}
		
		System.out.println();
		for(int i = x.length - 1; i >= 0; i--) {
			System.out.println(x [i] * 4);
		}
	}

}
