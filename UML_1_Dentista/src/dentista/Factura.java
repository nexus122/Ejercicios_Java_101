package dentista;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    // Atributos
    int numero;
    String description;
    Date fecha;
    private ArrayList<LineaTratamiento> lineas = new ArrayList<LineaTratamiento>();
    private Paciente paciente;

    // Metodos
    public float calculaImporteFactura(){
        float importe = 0; // Variable temporal que nos da el resultado
        for(LineaTratamiento lt:lineas){
            importe = importe + lt.calculaImporte();
        }
        return importe;
    }

}
