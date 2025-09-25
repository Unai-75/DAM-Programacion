//Comporobamos si eres mayor o menor de edad utilizando el año de nacimiento
import java.time.LocalDate;
import java.util.Scanner;
public class Mayordeedad {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print ("¿Cual es tu año de nacimiento?: ");
		int anho= scanner.nextInt();

		int anhoActual = LocalDate.now().getYear();

		if (anhoActual-anho>=18) {
			System.out.println ("Eres mayor de edad");
			
		}
		else {
		System.out.println ("Eres menor de edad");
		}
	}
}