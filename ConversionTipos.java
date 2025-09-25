//Convertimos un tipo de valor a double a int
import java.util.Scanner;

public class ConversionTipos {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Escribe el numero necesario");
    double num = scanner.nextDouble();
    
    int entero;
    entero = (int) num; // Conversión explicita (cast)
    //System.out.println("El valor convertido a int es: " + entero);
    System.out.printf("El valor %f convertido a int es %d, num, entero");
    }
}