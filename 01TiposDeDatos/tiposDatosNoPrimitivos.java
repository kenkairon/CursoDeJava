public class tiposDatosNoPrimitivos {
    public static void main(String[] args) {
        String nombre = "java";
        String lenguaje = new String("python");
        int[] numeros = {10,20,30};
        String[] palabras = new String[3];
        palabras[0] = "Hola";
        System.out.println(nombre.length()); // Imprime la longitud de "java" (4)
        System.out.println(numeros[1]); // Imprime el numero en la posicion 1 de 0 1 2

        Persona persona1 = new Persona("Ana", 25);
        persona1.saludar();
    }
}






