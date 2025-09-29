import java.util.Scanner;

public class entradaDatos {
    public static void main(String[] args) {
        Scanner EntradaTeclado = new Scanner(System.in); // Crea Objeto de Scanner

        // Leer String
        System.out.print("Ingresa tu nombre: ");
        String nombre = EntradaTeclado.nextLine();

        // Leer un int
        System.out.print("Ingresa tu Edad: ");
        int edad = EntradaTeclado.nextInt();

        // Leer un double
        System.out.print("Ingresa tu Altura (eje: 1,75) ");
        String alturaTexto = EntradaTeclado.next();
        double altura = Double.parseDouble(alturaTexto.replace(",", "."));

        System.out.println("\nResumen :");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        EntradaTeclado.close(); // Siempre es práctica cerrar el Scanner
    }
}