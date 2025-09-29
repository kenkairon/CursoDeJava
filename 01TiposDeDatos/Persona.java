public class Persona {
    String nombrePersona;
    int edadPersona;

    public Persona(String nombrePersona, int edadPersona) {
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombrePersona);
    }
}



