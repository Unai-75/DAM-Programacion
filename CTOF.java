//Un programa que pasa de Celsius a Fahrenheit
//Utilizando la formula necesaria
import java.util.Scanner;
public class CTOF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);


		System.out.print("¿Cuantos grados celsius hace?: ");
		double celsius=scanner.nextDouble();


		double fahrenheit=celsius * 1.8 + 32;
		System.out.println("El resultado es: " + fahrenheit + "F");
	}
}