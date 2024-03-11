package com.citas.java.entities;

public class Paciente extends Usuario {

    private String correoElectronico;
    private Integer celular;
    private String fechaNacimiento;
    private Double altura;
    private Double peso;
    private String tipoSangre;
    private String factorRH;



    public Paciente(int id, String nombres, String apellidos, String tipoIdentificacion, Integer numeroIdentificacion,
            String correoElectronico, Integer celular, String fechaNacimiento, Double altura, Double peso,
            String tipoSangre, String factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }



    public String getCorreoElectronico() {
        return correoElectronico;
    }



    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }



    public Integer getCelular() {
        return celular;
    }



    public void setCelular(Integer celular) {
        this.celular = celular;
    }



    public String getFechaNacimiento() {
        return fechaNacimiento;
    }



    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public Double getAltura() {
        return altura;
    }



    public void setAltura(Double altura) {
        this.altura = altura;
    }



    public Double getPeso() {
        return peso;
    }



    public void setPeso(Double peso) {
        this.peso = peso;
    }



    public String getTipoSangre() {
        return tipoSangre;
    }



    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }



    public String getFactorRH() {
        return factorRH;
    }



    public void setFactorRH(String factorRH) {
        this.factorRH = factorRH;
    }
    

    

}



