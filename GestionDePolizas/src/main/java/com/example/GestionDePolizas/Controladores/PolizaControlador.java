package com.example.GestionDePolizas.Controladores;

import com.example.GestionDePolizas.Modelos.Poliza;
import com.example.GestionDePolizas.Servicios.PolizaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/poliza")
public class PolizaControlador {


    @Autowired
    PolizaServicio polizaServicio;


    @PostMapping
    public ResponseEntity<?>guardar(@RequestBody Poliza datos){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(polizaServicio.registrarPoliza(datos));
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
                    .body(polizaServicio.buscarPoliza());
        }catch (Exception error){

            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
