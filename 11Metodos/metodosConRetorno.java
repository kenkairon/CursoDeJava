public class metodosConRetorno {
    // Método para sumar dos números
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        // Llamamos al método sumar
        int resultado = sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
