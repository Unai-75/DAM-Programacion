//Crea un programa que calcule el área de un rectangulo dado su radio
import java.util.Scanner;
public class AreaRectangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);


		System.out.print("Introduce la base del rectangulo: ");
		double base=scanner.nextDouble();

        System.out.print("Introduce la altura del rectangulo: ");
		double altura=scanner.nextDouble();


		double area=base*altura;
		//System.out.println("El área del rectangulo es: " + area);
        System.out.printf("El area del rectángulo con base %.1f y altura %.1f es %.2f ", base, altura, area);
        scanner.close();
	}
}