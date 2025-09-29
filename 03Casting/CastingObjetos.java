class Animal{
    void hacerSonido(){
        System.out.println("Sonido generico de Animal");
    }
}

class Perro extends Animal{
    void hacerSonido(){
        System.out.println("Guau Guau");
    }
    void moverCola(){
        System.out.println("Mover la Cola");
    }
}


public class CastingObjetos{
    public static void main(String[] args){
        // Upcasting (implícito) : Perro -> Animal
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); //LLama al método sobrescrito de Perro

        // Dowscasting (Explícito): Animal -> Perro
        Perro miPerro = (Perro) miAnimal;
        miPerro.moverCola(); //ahora accedemos a métodos específicos de Perro

    }
}

