import java.util.Scanner;
public class DiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Escribe el numero del mes : ");
        int mes = scanner.nextInt();
        int dias;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            dias=31;
            System.out.println("Este mes tiene 31 dias");
            break;
            case 4:
            case 6:
            case 9:
            dias=30;
            System.out.print("Este mes tiene 30 dias");
            break;
            case 2:
            dias=28;
            System.out.print("Este mes tiene 28 dias");
            break;
            
            /* case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días o 29 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                ;
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias ");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                */ 
            default:
                System.out.println("mes no valido");

        }
        scanner.close();
    }
}
