package Upc.Sistemas.Model;

import Upc.Sistemas.Entity.ESalario;
import Upc.Sistemas.Util.Constantes;

public class MSalario {
    //Constructor
    public MSalario() {
    }
    //Metodos
    public void ProcesarDatos( ESalario sa ){
        //Variables
        double honorarios = sa.getDias()*sa.getHoras()*sa.getPago();
        double impuesto = honorarios*Constantes.ir;
        double retencion;
        double total;
        if (impuesto > 1500) {
            retencion = impuesto*Constantes.ret;
            total = honorarios - impuesto - retencion;
        }
        else{
            retencion = 0;
            total = honorarios - impuesto;
        }  
        //Encapsular valores
        sa.setHonorarios(honorarios);
        sa.setImpuesto(impuesto);
        sa.setRetencion(retencion);
        sa.setTotal(total);
    }    
}
