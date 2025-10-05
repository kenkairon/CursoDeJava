package MIniProyecto01;

import java.util.Scanner;

public class miniProyecto {
    public static void main(String[] args) {

        Scanner tecladoIngreso = new Scanner(System.in);
        int opcion;
        int totalPrioridad = 0;

        do {
            System.out.println("== Gestor de Tareas ==");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas (pendiente)");
            System.out.println("3. Salir");
            System.out.println("Elige una opción :");
            opcion = tecladoIngreso.nextInt();
            tecladoIngreso.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = tecladoIngreso.nextLine();

                    System.out.print("Prioridad (1 a 5): ");
                    int prioridad = tecladoIngreso.nextInt();
                    tecladoIngreso.nextLine();

                    if (prioridad >= 1 && prioridad <= 5) {
                        totalPrioridad += prioridad;
                        System.out.println("Tarea '" + nombre + "' con prioridad " + prioridad + " agregada.");
                        System.out.println("Total acumulada de prioridades: " + totalPrioridad);
                    } else {
                        System.out.println("Prioridad no válida. ");
                    }
                    break;
                case 2:
                    System.out.println("Funcionalidad aún no implementada");
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción invalida. Intenta de nuevo.");
            }

        } while (opcion != 3);
        tecladoIngreso.close();
    }
}
