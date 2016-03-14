/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.VO;

/**
 *
 * @author alexisruiz
 */
public class ClienteVO {
    private String documento, nombres, apellidos, fechaNaci,direccion,telefono, observacion;

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
    
    
}
