package practica3;
import java.util.Scanner;

public class practica3ed {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner (System.in);
	        String cadena;
	        boolean salir = false;
	        while(!salir){
	            System.out.println("Introduce una cadena");
	            cadena=teclado.nextLine();
	            System.out.println("Tamaño de la cadena es: "+cadena.length());
	            if(cadena.length()==0){
	                salir=true;
	            }

	        }
	        System.out.println("hola");

	}

}
