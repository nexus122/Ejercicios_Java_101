package dentista;

public class Main {
    public static void main(String[] args) {
        ej1();
        ej2();
    }
    public static void ej1(){
        System.out.println("Ejercicio 1 -> a) ");
        System.out.println("La relación entre Factura y Linea de tratamientoTratamiento y RegistroPacientes y Paciente es igual pero inversa.");
        System.out.println("Una Factura puede tener 1 o mas lineas de tratamiento.");
        System.out.println("Un RegistroPacientes puede tener 1 o mas de 1 paciente.");

        System.out.println("Ejercicio 1 -> b) ");
        System.out.println("El paciente deberia poder ver los tratamientos que ha recivido a traves de las facturas.");

        System.out.println("Ejercicio 1 -> c) ");
        System.out.println("Si la clase LineaTratamiento tiene el siguiente constructor: public LineaTratamiento (String concepto) seria correcto crear un objeto de la clase Caries de la siguiente manera, si esta no tiene implementado ningun constructor? ¿Porque?");
        System.out.println("Caries c = new Caries ('Empaste molar')");
        System.out.println("No seria correcto pues el constructor lo tiene el metodo factura y no el metdoo caries, para hacerlo habria que extender la clase LineaTratamiento a la clase Caries y de esta manera heredar el atributo, si no estan emparentadas se podria constuir un constructor y enviar el atributo, pero no 'hardcodearlo.'");

        System.out.println("Ejercicio 1 -> d) ");
        System.out.println("El paciente puede no tener ninguna factura, porque la relación es de 0 a * pero si existe una factura obligatoriamente tiene que existir una linea de tratamiento.");
    }
    public static void ej2(){
        Caries c = new Caries ("Empaste molar");
        System.out.println("Caries c: "+ c);
    }
}
