
package com.Examen2.Examen.db;

import com.Examen2.Examen.entities.Prereservas;
import org.springframework.data.repository.CrudRepository;
//Aqui se implementa el CrudRepository para prereservas
public interface IPrereservasRepository extends CrudRepository<Prereservas, Integer>{
    
}
