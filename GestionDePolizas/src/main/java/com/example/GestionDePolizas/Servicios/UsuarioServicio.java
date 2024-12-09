package com.example.GestionDePolizas.Servicios;

import com.example.GestionDePolizas.Modelos.Poliza;
import com.example.GestionDePolizas.Modelos.Usuario;
import com.example.GestionDePolizas.Repositorio.IRespositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    @Autowired
    IRespositorioUsuario IRepositorioUsuario;

    public Usuario registrarUsuario(Usuario datosUsuario) throws Exception {
        try {
            return IRepositorioUsuario.save(datosUsuario);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public  Usuario buscarUsuario(){return  null;}
}

