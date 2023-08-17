
package com.Examen2.Examen.service.impl;

import com.Examen2.Examen.entities.Rol;
import com.Examen2.Examen.service.IRolService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
//Se crea la clase que implementa el IRolService
@Service
public class RolServiceImpl extends BaseServiceImpl<Rol, Integer> implements IRolService{
    
    public RolServiceImpl(CrudRepository<Rol, Integer> repository) {
        super(repository);
    }
    
}
