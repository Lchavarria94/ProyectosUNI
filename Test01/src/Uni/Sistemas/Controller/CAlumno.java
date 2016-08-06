package Uni.Sistemas.Controller;

import Uni.Sistemas.Entity.EAlumno;
import Uni.Sistemas.Model.AlumnoDaoMemory;

public class CAlumno {
    //variable de instancia
    AlumnoDaoMemory dao;
    //Constructor
    public CAlumno() {
        dao = new AlumnoDaoMemory();
    }
    //metodos de negocio
    public void AlumnoAdicionar(EAlumno p) {
        dao.create(p);
    }

    public void AlumnoActualizar(EAlumno p) {
        dao.update(p);
    }

    public void AlumnoEliminar(EAlumno p) {
        dao.delete(p);
    }

    public EAlumno[] AlumnoListar() {
        return dao.readAll();
    }

    public EAlumno AlumnoBuscar(int id) {
        return dao.find(id);
    }
            
       
}
