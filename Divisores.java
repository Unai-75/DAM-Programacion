import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el numero: ");
         int numero = scanner.nextInt();
        System.out.println("Divisores de "+numero+":");
        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0){    
                System.out.println(i + "");

            }
        }
    }
}