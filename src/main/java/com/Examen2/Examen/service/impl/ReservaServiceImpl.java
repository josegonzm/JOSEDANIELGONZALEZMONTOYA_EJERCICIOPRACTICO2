
package com.Examen2.Examen.service.impl;

import com.Examen2.Examen.entities.Reserva;
import com.Examen2.Examen.service.IReservaService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
//Se crea la clase que implementa el IReservaService
@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Integer> implements IReservaService{
    
    public ReservaServiceImpl(CrudRepository<Reserva, Integer> repository) {
        super(repository);
    }
    
}
