import java.util.Scanner;

public class Inversión {

	//main + ctrl espacio te sale public ....
	public static void main(String[] args) {
		
		/*  datos de entrada: capital en el banco y porcentaje mensual
			datos de salida: resultado de inversion   */
		
		Scanner teclado = new Scanner (System.in); //para introducir un numero y que te lo lea
		float capital;
//		float retribucion;
		
		//sout + ctrl espacio
		System.out.println("Introduce el capital: ");
		capital = teclado.nextFloat(); //para introducir un numero y que te lo lea
		
//		retribucion = capital * .02f; //hace lo mismo que lo de abajo / el 0 se puede omitir en 0.02
		/* retribucion = (float) (capital * 1.02); 
		dices que te da igual que no sea double (de otra manera habria que cambiar los float de arriba por double  */
		
//		System.out.println("Retribución: " + retribucion); //le suma el valor del "rertibucion = capital * 1.02f" de antes
		
		//conversion de tipo implicita 
		/*antes se extrae de la memoria de la variable y se convierte a cadena de caracteres, una vez convertido se concatena 
		concatenacion coger un trozo de texto y unirlo a otro */
		
		//hay que formatear la salida para que salgan 2 decimales y salga el resultado con , (no lo va a contar aun xd)
		
		System.out.println("Retribución: " + capital * .02f); //otra manera sin usar los que tienen // en el margen (izq del todo)
		teclado.close(); //para que no salga advertencia en teclado 
		}

}
