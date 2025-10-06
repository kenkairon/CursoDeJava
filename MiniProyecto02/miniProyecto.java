package MiniProyecto02;

import java.util.Scanner;

public class miniProyecto {

    // Variable global para acumular las prioridades
    static int totalPrioridad = 0;

    // Scanner global para usarlo en varios métodos
    static Scanner tecladoIngreso = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    verTareas();
                    break;
                case 3:
                    salir();
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 3);

        tecladoIngreso.close();
    }

    // -------------------------------
    // Métodos (Funciones) del programa
    // -------------------------------

    // Método para mostrar el menú principal
    public static void mostrarMenu() {
        System.out.println("\n== Gestor de Tareas ==");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas (pendiente)");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para leer la opción del usuario
    public static int leerOpcion() {
        int opcion = tecladoIngreso.nextInt();
        tecladoIngreso.nextLine(); // Limpiar buffer
        return opcion;
    }

    // Método para agregar una tarea
    public static void agregarTarea() {
        System.out.print("Nombre de la tarea: ");
        String nombre = tecladoIngreso.nextLine();

        System.out.print("Prioridad (1 a 5): ");
        int prioridad = tecladoIngreso.nextInt();
        tecladoIngreso.nextLine(); // Limpiar buffer

        if (prioridad >= 1 && prioridad <= 5) {
            totalPrioridad += prioridad;
            System.out.println("✅ Tarea '" + nombre + "' con prioridad " + prioridad + " agregada.");
            System.out.println("Total acumulado de prioridades: " + totalPrioridad);
        } else {
            System.out.println("❌ Prioridad no válida. Debe estar entre 1 y 5.");
        }
    }

    // Método para ver las tareas (a futuro)
    public static void verTareas() {
        System.out.println("📋 Funcionalidad aún no implementada (en desarrollo).");
    }

    // Método para salir del programa
    public static void salir() {
        System.out.println("👋 Hasta luego.");
    }
}
