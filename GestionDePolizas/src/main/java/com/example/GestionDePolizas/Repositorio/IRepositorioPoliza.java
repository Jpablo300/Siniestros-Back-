package com.example.GestionDePolizas.Repositorio;

import com.example.GestionDePolizas.Modelos.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioPoliza  extends JpaRepository<Poliza, Long> {

}
