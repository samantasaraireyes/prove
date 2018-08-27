package forr;
import java.util.Scanner;
public class DiasDeLaSmana {
	public static void main(String[] args)
	{
		String dias[] = { "Lunes.", "Martes.", "Miercoles.", "Jueves.", "Viernes.", "Sabado.", "Domingo." };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese día de la semana (número): ");
		int ndedia = scanner.nextInt();
		if( ndedia<= dias.length )
		{
			System.out.println( dias[ndedia-1]);
		}
			else
			{
				System.out.println("Dia incorrecto...");	
		}
	}
}