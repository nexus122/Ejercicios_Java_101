package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1:
        Vehicle coche1 = new Vehicle();
        coche1.iniciar();

        // Ejercicio 2:
        coche1.parar(); // o Vehicle.parar();
        coche1.accelerar();

        // Ejercicio 3
            Vehicle coche2 = new Vehicle();

        // Ejercicio 4

        // Ejercicio 5
        int a = 1; boolean b = true;
        Gat gato1 = new Gat();
        gato1.correr();
        gato1.correr(a);
        gato1.correr(a,b);

        // Ejercicio 6
        Amphibian frog1 = new Frog();
        frog1.moure();
        frog1.respirar();
        frog1.menjar();


        // Ejercicio 7
        //frog1.saltar(); // Da error porque hemos generalizado perdiendo lo que hace rana a la rana.

        // Ejercicio 8
        // Si se cambia se acepta o no el metodo saltar.

    }
}
