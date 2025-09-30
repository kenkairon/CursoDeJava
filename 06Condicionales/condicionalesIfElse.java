import java.util.Scanner;

public class condicionalesIfElse {
    public static void main(String[] args) {
        Scanner ingresoTeclado = new Scanner(System.in);

        System.out.print("ingresa la edad : ");
        int edad = ingresoTeclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres Mayor de edad");
        } else {
            System.out.println("Eres Menor de edad");
        }

        ingresoTeclado.close();
    }
}
