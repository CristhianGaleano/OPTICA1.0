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
public class HistoriaVO {
    
   private String  detalleAccidentes,parientePatologico,detalleHistoricoFamiliar,fechaHistoria,
           examenFisico,detalleEnfermedades;
   private boolean alcoholico,fumador, accidentes;

    public void setAlcoholico(Boolean alcoholico) {
        this.alcoholico = alcoholico;
    }

    public void setFumador(Boolean fumador) {
        this.fumador = fumador;
    }

    public void setAccidentes(Boolean accidentes) {
        this.accidentes = accidentes;
    }

    public void setDetalleAccidentes(String detalleAccidentes) {
        this.detalleAccidentes = detalleAccidentes;
    }

    public void setParientePatologico(String parientePatologico) {
        this.parientePatologico = parientePatologico;
    }

    public void setDetalleHistoricoFamiliar(String detalleHistoricoFamiliar) {
        this.detalleHistoricoFamiliar = detalleHistoricoFamiliar;
    }

    public void setFechaHistoria(String fechaHistoria) {
        this.fechaHistoria = fechaHistoria;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public void setDetalleEnfermedades(String detalleEnfermedades) {
        this.detalleEnfermedades = detalleEnfermedades;
    }

    public Boolean getAlcoholico() {
        return alcoholico;
    }

    public Boolean getFumador() {
        return fumador;
    }

    public Boolean getAccidentes() {
        return accidentes;
    }

    public String getDetalleAccidentes() {
        return detalleAccidentes;
    }

    public String getParientePatologico() {
        return parientePatologico;
    }

    public String getDetalleHistoricoFamiliar() {
        return detalleHistoricoFamiliar;
    }

    public String getFechaHistoria() {
        return fechaHistoria;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public String getDetalleEnfermedades() {
        return detalleEnfermedades;
    }
    
}
