package com.example.GestionDePolizas.Servicios;

import com.example.GestionDePolizas.Modelos.Poliza;
import com.example.GestionDePolizas.Repositorio.IRepositorioPoliza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PolizaServicio {
    @Autowired
    IRepositorioPoliza IRepositoriopoliza;

    public Poliza registrarPoliza(Poliza datosPoliza) throws  Exception{
        try{
            return  IRepositoriopoliza.save(datosPoliza);
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    public  Poliza buscarPoliza(){return  null;}
}
