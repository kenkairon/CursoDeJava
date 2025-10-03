import java.util.Scanner;

public class ejemploOperadorTernario {

    public static void main(String[] args) {
        // se crea una instancia
        Scanner ingresoTeclado = new Scanner(System.in);
        // leer la Edad
        System.out.print("ingrese la Edad");
        int edad = ingresoTeclado.nextInt();

        String estado = (edad >= 18) ? "Adulto" : "Menor";
        System.out.println(estado); // Adulto

        ingresoTeclado.close();
    }

}
