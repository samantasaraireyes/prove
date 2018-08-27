package tarea;
import java.util.Scanner;
public class While {
public static void main(String[] args) {
	int arr[] = new int[5];
	Scanner scanner = new Scanner(System.in);
	System.out.print("Ingrese el valor: ");
	int v = scanner.nextInt();
	int i=0;
	while ( v!=0 && i<5 )
	    arr[i++] = v;
	System.out.println("Ingrese el siguiente valor: ");
	v = scanner.nextInt();
	for( int j=0; j<i; j++)
	{
		System.out.println(arr[j]);
	}
}
}