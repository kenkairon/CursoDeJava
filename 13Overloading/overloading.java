public class overloading {

    // Método para sumar dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: método para sumar tres enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: método para sumar números decimales
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Llamadas a los métodos sobrecargados
        System.out.println("Suma de 2 enteros: " + sumar(5, 3));
        System.out.println("Suma de 3 enteros: " + sumar(5, 3, 2));
        System.out.println("Suma de decimales: " + sumar(4.5, 2.3));
    }
}
