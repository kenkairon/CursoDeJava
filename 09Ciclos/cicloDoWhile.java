import java.util.Scanner;

class cicloDoWhile {
    public static void main(String[] args) {
        Scanner ingresoNum = new Scanner(System.in); // Crear Scanner solo una vez
        int numero;
        do {
            System.out.println("Ingresa un número positivo : ");
            numero = ingresoNum.nextInt();
        } while (numero <= 0);
        System.out.println("Felicitaciones se ingreso un numero positivo");
        ingresoNum.close();
    }

}