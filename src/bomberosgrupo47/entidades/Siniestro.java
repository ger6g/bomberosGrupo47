/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.entidades;

import java.sql.Date;

/**
 *
 * @author hecto
 */
public class Siniestro {
//    `Codigo``tipo``FechaSiniestro``CoordX``CoordY``Detalles``FechaResol``Puntuacion``CodBrigada`
    private int Codigo;
    private String tipo;
    private Date FechaSiniestro;
    private int CoordX,CoordY;
    private String Detalles;
    private Date FechaResol;
    private int Puntuacion;
    private Brigada brigada;

    public Siniestro() {
    }

    public Siniestro(int Codigo, String tipo, Date FechaSiniestro, int CoordX, int CoordY, String Detalles, Date FechaResol, int Puntuacion, Brigada brigada) {
        this.Codigo = Codigo;
        this.tipo = tipo;
        this.FechaSiniestro = FechaSiniestro;
        this.CoordX = CoordX;
        this.CoordY = CoordY;
        this.Detalles = Detalles;
        this.FechaResol = FechaResol;
        this.Puntuacion = Puntuacion;
        this.brigada = brigada;
    }

    public Siniestro(String tipo, Date FechaSiniestro, int CoordX, int CoordY, String Detalles, Date FechaResol, int Puntuacion, Brigada brigada) {
        this.tipo = tipo;
        this.FechaSiniestro = FechaSiniestro;
        this.CoordX = CoordX;
        this.CoordY = CoordY;
        this.Detalles = Detalles;
        this.FechaResol = FechaResol;
        this.Puntuacion = Puntuacion;
        this.brigada = brigada;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaSiniestro() {
        return FechaSiniestro;
    }

    public void setFechaSiniestro(Date FechaSiniestro) {
        this.FechaSiniestro = FechaSiniestro;
    }

    public int getCoordX() {
        return CoordX;
    }

    public void setCoordX(int CoordX) {
        this.CoordX = CoordX;
    }

    public int getCoordY() {
        return CoordY;
    }

    public void setCoordY(int CoordY) {
        this.CoordY = CoordY;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public Date getFechaResol() {
        return FechaResol;
    }

    public void setFechaResol(Date FechaResol) {
        this.FechaResol = FechaResol;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "Codigo=" + Codigo + ", tipo=" + tipo + ", FechaSiniestro=" + FechaSiniestro + ", CoordX=" + CoordX + ", CoordY=" + CoordY + ", Detalles=" + Detalles + ", FechaResol=" + FechaResol + ", Puntuacion=" + Puntuacion + ", brigada=" + brigada + '}';
    }

    
}
