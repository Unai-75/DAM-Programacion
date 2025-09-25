import java.util.Scanner;
import java.time.LocalDate;

public class EdadCien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce tu año de nacimiento");
        int anho=scanner.nextInt();
              int actual= LocalDate.now().getYear();

        
            int edad= actual - anho; 
         System.out.printf("Tu edad es: %d\n", actual -anho);
         
        		if (edad<100) {
			System.out.printf("Te quedan para tener 100: %d\n", 100-edad);
    } else if(edad == 100) {
        System.out.println("¡Felicidades este año cumples 100 años!");
    } else { 
        System.out.println ("¡Felicidades tienes 100 años!");
    }
    scanner.close();
        }

    }


	


