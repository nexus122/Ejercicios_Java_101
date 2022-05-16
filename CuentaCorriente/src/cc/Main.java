package cc;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente c1 = new CuentaCorriente("Pepe", 1000);
        CuentaCorriente c2 = new CuentaCorriente("Jose", 1001);
        CuentaCorriente c3 = new CuentaCorriente("Andres", 1002);
        c1.ingresar(1000);
        c2.ingresar(500);
        c3.ingresar(250);

        if(c1.igualar_saldo(c2))
            System.out.println("Ha sido posible igualar saldos c1 y c2");
        else
            System.out.println("No ha sido posible igualar saldos c1 y c2");

        if(c2.igualar_saldo(c3))
            System.out.println("No ha sido posible igualar saldos cuenta c2 y c3");
        else
            System.out.println("No ha sido posible igualar saldos c2 y c3");

        if(c1.mismo_saldo(c2,c3))
            System.out.println("Los saldos son iguales");
        else
            System.out.println("Las 3 cuentas no tienen el mismo saldo");

        System.out.println("Saldo cuenta 1: "+ c1.getSaldo());
        System.out.println("Saldo cuenta 2: "+ c2.getSaldo());
        System.out.println("Saldo cuenta 3: "+ c3.getSaldo());

    }


}