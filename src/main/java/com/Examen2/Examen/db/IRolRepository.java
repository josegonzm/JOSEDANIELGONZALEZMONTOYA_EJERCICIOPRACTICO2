
package com.Examen2.Examen.db;

import com.Examen2.Examen.entities.Rol;
import org.springframework.data.repository.CrudRepository;
//Aqui se implementa el CrudRepository para rol
public interface IRolRepository extends CrudRepository<Rol, Integer>{
    
}
