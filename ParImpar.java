//Un programa que nos dice si el numero es par o impar
import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Escribe el numero necesario: ");
    int numero=scanner.nextInt();
//Ponemos esto para si sale el numero 0 ponga que el numero es 0
    if (numero==0){
        System.out.println("El número es 0");
    }

   else if (numero % 2 == 0){
            System.out.println("El numero es par.");
    }else{
        System.out.println("El numero es impar.");
        }
    }

}
    