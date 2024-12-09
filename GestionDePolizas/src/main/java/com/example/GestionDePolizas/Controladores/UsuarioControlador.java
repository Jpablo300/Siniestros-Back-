package com.example.GestionDePolizas.Controladores;

import com.example.GestionDePolizas.Modelos.Usuario;
import com.example.GestionDePolizas.Servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio usuarioServicio;


    @PostMapping

    public ResponseEntity<?>guardar(@RequestBody Usuario datos){

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.registrarUsuario(datos));
        }catch (Exception error){

            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping

    public ResponseEntity<?>buscarTodo(){

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.buscarUsuario());
        }catch (Exception error){

            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
        }

}
