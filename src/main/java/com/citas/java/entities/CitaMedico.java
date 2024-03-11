package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable {

    private Medico medico;
    private String motivo;
    private EstadoCita estado;

    public CitaMedico(Integer id, LocalDateTime fecha, com.citas.java.entities.Paciente paciente,
            Consultorio consultorio, Medico m, String motivo, EstadoCita estado) {
        super(id, fecha, paciente, consultorio);

        this.medico = m ;
        this.motivo = motivo;
        this.estado = estado;



    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        this.estado = EstadoCita.AGENDADA;
    }

    @Override
    public void cancelarCita() {
        
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }


}
