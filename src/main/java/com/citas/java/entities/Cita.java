package com.citas.java.entities;

import java.time.LocalDateTime;

public class Cita {
    protected Integer id;
    protected LocalDateTime fecha;
    protected Paciente Paciente;
    protected Consultorio consultorio;




    public Cita(Integer id, LocalDateTime fecha, com.citas.java.entities.Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        Paciente = paciente;
        this.consultorio = consultorio;
    }




    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
    }




    public LocalDateTime getFecha() {
        return fecha;
    }




    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }




    public Paciente getPaciente() {
        return Paciente;
    }




    public void setPaciente(Paciente paciente) {
        Paciente = paciente;
    }




    public Consultorio getConsultorio() {
        return consultorio;
    }




    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    

}



