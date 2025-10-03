import java.util.Scanner;

public class ejercicioSwitchCase {
    public static void main(String[] args) {
        // Instancia del Scanner
        Scanner ingresoDia = new Scanner(System.in);

        // Pedir día
        System.out.print("Ingrese un número del 1 al 7 para saber el día de la semana: ");
        int dia = ingresoDia.nextInt();

        // Switch con días de la semana
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Debe ser entre 1 y 7.");
                break;
        }

        ingresoDia.close();
    }
}
