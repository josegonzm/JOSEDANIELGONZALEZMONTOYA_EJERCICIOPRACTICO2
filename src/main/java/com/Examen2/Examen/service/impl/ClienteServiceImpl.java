
package com.Examen2.Examen.service.impl;

import com.Examen2.Examen.entities.Cliente;
import com.Examen2.Examen.service.IClienteService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
//Se crea la clase que implementa el IClienteService
@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Integer> implements IClienteService{
    public ClienteServiceImpl(CrudRepository<Cliente, Integer> repository) {
        super(repository);
    }
}
