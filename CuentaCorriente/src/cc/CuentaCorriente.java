package cc;

public class CuentaCorriente {
    private String name;
    private double saldo;
    private double descubierto; // Limite que puedes llegar a tener -> Se interpreta como descubierto

    public CuentaCorriente(String name, int money) {
        this.name = name;

    }

    public void ingresar(double ingreso){
        if(ingreso>0)
                saldo += ingreso;
    }

    public boolean retirar(double retiro){
        boolean ret = false;
        if(retiro>0 && (this.saldo-retiro)>this.descubierto) {
            saldo -= retiro;
            ret = true;
        }
        return ret;
    }

    public boolean igualar_saldo(CuentaCorriente c){
        double saldo1 = this.saldo;
        double saldo2 = c.saldo;

        double saldo_medio = (saldo1+saldo2)/2;
        boolean es_posible;
        if(saldo1 > saldo2){
            es_posible = this.retirar(saldo1 - saldo_medio);
            if(es_posible) c.ingresar(saldo1 - saldo_medio);
        } else{
            es_posible = c.retirar(saldo2 - saldo_medio);
            if(es_posible) this.ingresar(saldo2 - saldo_medio);
        }
        return es_posible;
    }

    public boolean mismo_saldo(CuentaCorriente c2, CuentaCorriente c3){
        // Obtenemos el saldo de las tres cuentas utilizando el metodo que he mos creado antes .getSaldo();
        double saldo1 = this.saldo;
        double saldo2 = c2.getSaldo();
        double saldo3 = c3.getSaldo();

        // Solo devolvemos true si los tres son iguales
        return saldo1 == saldo2 && saldo2 == saldo3;
    }

    public double getSaldo() {
        return this.saldo;
    }



}
