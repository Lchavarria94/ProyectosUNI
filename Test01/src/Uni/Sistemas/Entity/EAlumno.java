package Uni.Sistemas.Entity;

public class EAlumno {
    //Variables
    private int id;
    private String nombre;
    private String curso;
    private double par;
    private double fin;
    private double pc;
    private double promedio;
    private String estado;
    //Constructor
    public EAlumno() {
    }
    public EAlumno(int id, String nombre, String curso, double par, double fin, double pc, double promedio, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.par = par;
        this.fin = fin;
        this.pc = pc;
        this.promedio = promedio;
        this.estado = estado;
    }
    
    //Metodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPar() {
        return par;
    }

    public void setPar(double par) {
        this.par = par;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    public double getPc() {
        return pc;
    }

    public void setPc(double pc) {
        this.pc = pc;
    }

    public double getPromedio(double x, double y,double z) {
        return (x+y+z)/3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado(double prom) {
        if (prom < 10) {
            estado = "DESAPROBADO!";
        }
        else if (prom>=10 & prom<=11) {
            estado = "SUSTITUTORIO!";
        }
        else if (prom>11) {
            estado = "APROBADO";
        }
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
