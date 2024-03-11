package com.citas.java.interfaces;

import java.time.LocalDateTime;

public interface IAgendable {
// dfinir comportamiento que otras clases deben implemntar 

public void agendarCita(LocalDateTime fecha);
public void cancelarCita();
public void reagendarCita(LocalDateTime fecha);



}
