package Uni.Sistemas.Repositorio;

public interface ICrudDao <T>{
    // definir las firmas
    void create(T t);

    void update(T t);

    void delete(T t);

    T find(int t);

    T[] readAll();
}
