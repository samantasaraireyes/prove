package prueba2;
 import java.util.Scanner;
public class invertir {	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String texto;
	        String textoinvertido="";
	        System.out.println ("Ingresa texto: ");
	        texto=scanner.nextLine();
	        for (int i = texto.length()-1; i>=0; i--){
	            textoinvertido += texto.charAt(i);
	        }
	        System.out.println("El texto invertido es: "+ textoinvertido);
	    }
}