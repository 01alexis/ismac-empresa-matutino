package com.distribuida.entities;
//CORECCION 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.stereotype.Component;
 
@Component
@Entity
@Table(name = "departamento")
public class Departamento {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private int idDepartamento;
    @Column(name = "NombreDpto")
    private String nombreDpto;
    @Column(name = "NumeroDpto")
    private int numeroDpto;
    @Column(name = "DniDirector")
    private String dniDirector;
    @Column(name = "FechaIngresoDirector")
    private String fechaIngresoDirector;
 
    public Departamento() {}

    public Departamento(int idDepartamento, String nombreDpto, int numeroDpto, String dniDirector, String fechaIngresoDirector) {
        this.idDepartamento = idDepartamento;
        this.nombreDpto = nombreDpto;
        this.numeroDpto = numeroDpto;
        this.dniDirector = dniDirector;
        this.fechaIngresoDirector = fechaIngresoDirector;
    }
 
    // Getters y setters
    public int getIdDepartamento() {
        return idDepartamento;
    }
 
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
 
    public String getNombreDpto() {
        return nombreDpto;
    }
 
    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }
 
    public int getNumeroDpto() {
        return numeroDpto;
    }
 
    public void setNumeroDpto(int numeroDpto) {
        this.numeroDpto = numeroDpto;
    }
 
    public String getDniDirector() {
        return dniDirector;
    }
 
    public void setDniDirector(String dniDirector) {
        this.dniDirector = dniDirector;
    }
 
    public String getFechaIngresoDirector() {
        return fechaIngresoDirector;
    }
 
    public void setFechaIngresoDirector(String fechaIngresoDirector) {
        this.fechaIngresoDirector = fechaIngresoDirector;
    }
 
    @Override
    public String toString() {
        return "Departamento [idDepartamento=" + idDepartamento + ", nombreDpto=" + nombreDpto + ", numeroDpto="
                + numeroDpto + ", dniDirector=" + dniDirector + ", fechaIngresoDirector=" + fechaIngresoDirector + "]";
    }
 
}