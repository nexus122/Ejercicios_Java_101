package dentista;

import java.util.ArrayList;

public class Paciente {
    private String nif;
    private String nombre;
    private String direccion;

    private ArrayList<Factura> facturas = new ArrayList<Factura>();

    public String getNif() {
        return nif;
    }
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    @Override
    public String toString() {
        return "Paciente [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", facturas=" + facturas
                + "]";
    }
}
