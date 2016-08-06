
package Upc.Sistemas.Entity;

public class ESalario {
    //Atributos
    private String trabajador;
    private double horas;
    private int dias;
    private double pago;
    private double honorarios;
    private double impuesto;
    private double retencion;
    private double total;

    //Constructor
    public ESalario() {
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
        public double getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    } 
}
