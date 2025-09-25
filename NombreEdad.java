import java.util.Scanner;

public class NombreEdad {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad = scanner.nextInt();

		System.out.println("Hola " + nombre.toUpperCase() + ", Tienes " + edad + " años");

		//System.out.printf("Nombre: %s", nombre);
	}
}