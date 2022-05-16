package Ejercicio_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1, Creamos varias claes que heredan de Cycle();
        Cycle ciclo = new Cycle();
        Unicycle unicycle = new Unicycle();
        Bicycle bicilo = new Bicycle();
        Tricycle tricycle = new Tricycle();

        // Ejercicio 2, llamamos a la funcion wheels();
        ciclo.wheels();
        unicycle.wheels();
        bicilo.wheels();
        tricycle.wheels();

        // Ejercicio 3,
        ArrayList<Cycle> arrayCiclos = new ArrayList<Cycle>();
        arrayCiclos.add(ciclo);
        arrayCiclos.add(unicycle);
        arrayCiclos.add(bicilo);
        arrayCiclos.add(tricycle);

        for(Cycle c:arrayCiclos){
            // Da error en el metodo balance porque no lo tienen todos los cyclos
            // c.balance();

        }

        // Ejercicio 4
        // Hamster hamster = new Hamster();
        // Ratolí ratoli = new Ratolí();
        // Jerbu jerbu = new Jerbu();

        ArrayList<Rossegador> arrayRossegador= new ArrayList<Rossegador>();
        arrayRossegador.add(new Hamster());
        arrayRossegador.add(new Ratolí());
        arrayRossegador.add(new Jerbu());

        // Me pide que lo declare en Rossegador aunque este vacio.
        for(Rossegador r:arrayRossegador){
            r.ensumar();
            r.rossegar();
            r.correr();
        }


    }
}
