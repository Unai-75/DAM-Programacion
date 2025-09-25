//Calcula el promedio de tres numeros
import java.util.Scanner;
public class Promediotresnumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
        
        System.out.print("Introduce el primer numero: ");
		double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
		double num2 = scanner.nextDouble();
        
        System.out.print("Introduce el tercer numero: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2+ num3) / 3;
        System.out.printf("El promedio de los tres números es:  %.2f ", promedio);
    }
}