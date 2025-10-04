public class ejercicioContinue {

    public static void main(String[] args) {
        for (int indice = 0; indice < 5; indice++) {
            if (indice == 2)
                continue;
            System.out.println(indice);
        }
    }
}
