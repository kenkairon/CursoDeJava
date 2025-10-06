
public class metodos {
    // Método para saludar a un usuario
    public static void saludar(String nombre) {
        System.out.println("¡Hola ," + nombre + "! Bienvenido a java");
    }

    public static void main(String[] args) {
        // llamamos al método saludar
        saludar("Carlos");
        saludar("Ana");
    }

}
