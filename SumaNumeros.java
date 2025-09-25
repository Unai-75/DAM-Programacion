import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero = 0;
        while (numero >= 0) {
            suma = suma + numero;
            System.out.print("Introduce tu numero (negativo para finalizar)");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.print("La suma de todo los numero es " + suma);

            }

        }

        scanner.close();
    }
}
