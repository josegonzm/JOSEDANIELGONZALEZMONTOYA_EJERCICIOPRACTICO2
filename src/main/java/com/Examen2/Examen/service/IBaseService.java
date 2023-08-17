
package com.Examen2.Examen.service;
import java.util.List;
import java.util.Optional;
//Se crea la interfaz para la base del service
public interface IBaseService<T,Y> {
    List<T> getAll();
    
    T save(T item);
    
    void delete(T item);
    
    Optional<T> getById(Y id);
}
