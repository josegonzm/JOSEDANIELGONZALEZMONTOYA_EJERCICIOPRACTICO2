
package com.Examen2.Examen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "Reserva")
public class Reserva implements Serializable{
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id")
    private int id_vuelo;
    @ManyToOne
    @JoinColumn(name = "id")
    private int id_cliente;
    private Date fecha_reserva;
    
}
