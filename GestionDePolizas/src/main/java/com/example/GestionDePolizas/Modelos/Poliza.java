package com.example.GestionDePolizas.Modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "polizas")
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoSeguro;  // Ejemplo: Auto, Vida, Hogar
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private String aseguradoNombre; // Nombre del asegurado
    private String estado; // Estado de la póliza: Activa, Cancelada, Expirada
    private Boolean renovable; // Si la póliza es renovable automáticamente
    private LocalDate fechaUltimoPago; // Fecha del último pago realizado

    public Poliza() {
    }

    public Poliza(Long id, String tipoSeguro, LocalDate fechaInicio, LocalDate fechaVencimiento, String aseguradoNombre, String estado, Boolean renovable, LocalDate fechaUltimoPago) {
        this.id = id;
        this.tipoSeguro = tipoSeguro;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.aseguradoNombre = aseguradoNombre;
        this.estado = estado;
        this.renovable = renovable;
        this.fechaUltimoPago = fechaUltimoPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getAseguradoNombre() {
        return aseguradoNombre;
    }

    public void setAseguradoNombre(String aseguradoNombre) {
        this.aseguradoNombre = aseguradoNombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getRenovable() {
        return renovable;
    }

    public void setRenovable(Boolean renovable) {
        this.renovable = renovable;
    }

    public LocalDate getFechaUltimoPago() {
        return fechaUltimoPago;
    }

    public void setFechaUltimoPago(LocalDate fechaUltimoPago) {
        this.fechaUltimoPago = fechaUltimoPago;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "id=" + id +
                ", tipoSeguro='" + tipoSeguro + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaVencimiento=" + fechaVencimiento +
                ", aseguradoNombre='" + aseguradoNombre + '\'' +
                ", estado='" + estado + '\'' +
                ", renovable=" + renovable +
                ", fechaUltimoPago=" + fechaUltimoPago +
                '}';
    }
}
