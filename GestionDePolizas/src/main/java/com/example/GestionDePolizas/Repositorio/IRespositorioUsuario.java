package com.example.GestionDePolizas.Repositorio;

import com.example.GestionDePolizas.Modelos.Poliza;
import com.example.GestionDePolizas.Modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRespositorioUsuario  extends JpaRepository<Usuario, Long>{

}


