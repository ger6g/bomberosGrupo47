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
public class Bombero {
//    `idBombero``dni``NombreApellido``FechaNac``Celular``CodBrigada`
    private int idBombero;
    private int dni;
    private String NombreApellido;
    private Date FechaNac;
    private String Celular;
    private Brigada brigada;

    public Bombero() {
    }

    public Bombero(int idBombero, int dni, String NombreApellido, Date FechaNac, String Celular, Brigada brigada) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.NombreApellido = NombreApellido;
        this.FechaNac = FechaNac;
        this.Celular = Celular;
        this.brigada = brigada;
    }

    public Bombero(int dni, String NombreApellido, Date FechaNac, String Celular, Brigada brigada) {
        this.dni = dni;
        this.NombreApellido = NombreApellido;
        this.FechaNac = FechaNac;
        this.Celular = Celular;
        this.brigada = brigada;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    @Override
    public String toString() {
        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", NombreApellido=" + NombreApellido + ", FechaNac=" + FechaNac + ", Celular=" + Celular + ", brigada=" + brigada + '}';
    }
    

    
    
}
