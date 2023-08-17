
package com.Examen2.Examen.service.impl;

import com.Examen2.Examen.entities.Vuelos;
import com.Examen2.Examen.service.IVuelosService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VuelosServiceImpl extends BaseServiceImpl<Vuelos, Integer> implements IVuelosService{
    
    public VuelosServiceImpl(CrudRepository<Vuelos, Integer> repository) {
        super(repository);
    }
    
}
