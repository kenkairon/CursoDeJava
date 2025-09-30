import java.util.Scanner;

public class condicionalesVarios {
    public static void main(String[] args) {
        Scanner ingresoTeclado = new Scanner(System.in);

        System.out.print("ingrese nota : ");
        int nota = ingresoTeclado.nextInt();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        ingresoTeclado.close();
    }
}
