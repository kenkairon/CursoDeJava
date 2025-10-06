## Scope de una variable y visibilidad

En la programación, el término "scope" o "ámbito" se refiere a la porción de 
código dentro de la cual una variable, función o constante es visible y accesible
En esencia, define donde y como se puede utilizar una determinada entidad dentro 
de un programa.
Cada variable en Java vive dentro de un bloque de código: eso se llama alcance
o "scope"

## variables locales

Son las que se declaran de un método y solo se pueden usar dentro de ese métod
si intentas usar nombre en otro método, te da error. Solo "vive" adentro de saludar()

```java

public static void saludar(){
    String nombre = "Tatiana";
    System.out.println("Hola " + nombre);
}
```

## variable de bloque 

También tienen un alcance limitado solo el bloque donde se declaran por bloque entendemos
- if
- for 
- while
- do while
- switch

```java
for(int i = 0; i < 3; i++>){
    System.out.println(i);
}

    System.out.println(i); // Error ya no existe 

```
