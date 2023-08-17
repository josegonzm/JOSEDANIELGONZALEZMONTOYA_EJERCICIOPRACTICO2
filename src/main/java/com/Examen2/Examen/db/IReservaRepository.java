
package com.Examen2.Examen.db;

import com.Examen2.Examen.entities.Reserva;
import org.springframework.data.repository.CrudRepository;
//Aqui se implementa el CrudRepository para reserva
public interface IReservaRepository extends CrudRepository<Reserva, Integer>{
    
}
