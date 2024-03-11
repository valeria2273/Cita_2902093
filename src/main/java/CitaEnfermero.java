
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.citas.java.entities.Cita;
import com.citas.java.entities.Consultorio;
import com.citas.java.entities.Enfermero;
import com.citas.java.entities.Paciente;
import com.citas.java.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable {

    private String procedimiento;
    private Enfermero enfermero;

    
    public CitaEnfermero (Integer id, 
                         LocalDateTime fecha,
                         Consultorio consultorio,
                         String procedimiento,
                         Paciente paciente,
                         Enfermero enfermero) {
         super(id, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero; 
    }

    




    public String getProcedimiento() {
        return procedimiento;
    }


    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }


    public Enfermero getEnfermero() {
        return enfermero;
    }


    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.fecha = fecha;
    }


    @Override
    public void cancelarCita() {
        System.out.println("Cita Cancelada");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        super.fecha = fecha;
    }}
