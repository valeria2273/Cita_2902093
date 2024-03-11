package com.citas.java.entities;

public class Medico extends Usuario {
    
    
    private Integer registroMedico;
    private String especialidad;
    

    public Medico(int id, String nombres, String apellidos, String tipoIdentificacion, Integer numeroIdentificacion,
            Integer registroMedico, String especialidad) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    public Integer getRegistroMedico() {
        return registroMedico;
    }


    public void setRegistroMedico(Integer registroMedico) {
        this.registroMedico = registroMedico;
    }


    public String getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    

    
}



