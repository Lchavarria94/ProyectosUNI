package Upc.Sistemas.Controller;

import Upc.Sistemas.Entity.ESalario;
import Upc.Sistemas.Model.MSalario;

public class CSalario {
    
    //Variable de instancia
    MSalario model;
   
    //Constructor
    public CSalario() {
        model = new MSalario();
    }
    //Metodo del negocio
    public void CalculaSalario(ESalario x){
        model.ProcesarDatos(x);
    }
    
}
