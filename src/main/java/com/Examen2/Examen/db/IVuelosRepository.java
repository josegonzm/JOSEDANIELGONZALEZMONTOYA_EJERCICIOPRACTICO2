
package com.Examen2.Examen.db;

import com.Examen2.Examen.entities.Vuelos;
import org.springframework.data.repository.CrudRepository;
//Aqui se implementa el CrudRepository para vuelos
public interface IVuelosRepository extends CrudRepository<Vuelos, Integer>{
    
}
