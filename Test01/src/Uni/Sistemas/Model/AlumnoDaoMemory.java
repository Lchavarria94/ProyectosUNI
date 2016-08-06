package Uni.Sistemas.Model;

import Uni.Sistemas.Entity.EAlumno;
import Uni.Sistemas.Repositorio.ICrudDao;

public class AlumnoDaoMemory implements ICrudDao<EAlumno>{

     // variables
    EAlumno lista[];
    static int cont, n;

    //constructor
    
    public AlumnoDaoMemory() {
        lista = new EAlumno[100];
        cont = 0;
        n = 0;    
    }

    @Override
    public void create(EAlumno t) {
        cont++;
        t.setId(cont);
        lista[n] = t;
        n++;
    }

    @Override
    public void update(EAlumno t) {
        int index = 0;
        for (EAlumno x : lista) {
            if (x.getId() == t.getId()) {
                lista[index] = t; //actualiza producto
                break;
            }
            index++;
        }
    }

           
    @Override
    public void delete(EAlumno t) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getId() == t.getId()) {
                for (int j = i; j < n; j++) {
                    lista[j] = lista[j + 1];
                }//elimina
                n--;
                break;
            }
        }
    }

    @Override
    public EAlumno find(int t) {
        for (EAlumno x : lista) {
            if (x.getId() == t) {
                return x;
            }
        }
        return null;
    }

    @Override
    public EAlumno[] readAll() {
        EAlumno[] aux;
        if (n == 100) {
            aux = lista;
        } else {
            aux = new EAlumno[n];
            System.arraycopy(lista, 0, aux, 0, n);
        }
        return aux;
    }

}
