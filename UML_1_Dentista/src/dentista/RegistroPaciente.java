package dentista;

import java.util.ArrayList;

public class RegistroPaciente {
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    // Metodos
    public float importeFacturas(String nif){
        float importe = 0;
        for(Paciente p:pacientes){
            if(p.getNif().equals(nif)){
                ArrayList<Factura> facturas = p.getFacturas();
                for(Factura f:facturas){
                    importe = importe + f.calculaImporteFactura();
                }
                break;
            }
        }
        return importe;
    }

}
