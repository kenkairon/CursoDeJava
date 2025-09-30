package MiniProyecto;

import java.util.Scanner;

public class miniProyecto {
    public static void main(String[] args) {
        Scanner ingresoTeclado = new Scanner(System.in);
        int totalPrioridad = 0;

        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tarea (pendiente)");
        System.out.println("3. Salir");

        System.out.print("Selecciona una opción: ");
        int opcion = ingresoTeclado.nextInt();
        ingresoTeclado.nextLine(); // Limpiar

        // validamos en esté entre 1 y 3
        if (opcion >= 1 && opcion <= 3) {
            if (opcion == 1) {
                System.out.print("Nombre de la Tarea : ");
                String nombreTarea = ingresoTeclado.nextLine();

                System.out.print("Prioridad (1 al 5) : ");
                int prioridad = ingresoTeclado.nextInt();

                // operación aritmética: suma de prioridades
                totalPrioridad += prioridad;

                // validación básica con operador lógico
                boolean esValida = prioridad >= 1 && prioridad <= 5;
                System.out.println("¿Prioridad es Valida? " + esValida);

                System.out.println("Tarea Agrupada " + nombreTarea + ("prioridad " + prioridad));
                System.out.println("Suma total de las prioridades " + totalPrioridad);

            } else if (opcion == 2){
                System.out.println("Función 'ver tareas' aún no esta implementada");
            } else{
                System.out.println("Hasta luego......");
            }
        } else{
          System.out.println("opción no valida");
        }
        ingresoTeclado.close();
    }

}
