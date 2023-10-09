/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.accesoADatos;

import bomberosgrupo47.entidades.Siniestro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class SiniestroData {
      private Connection con=null;
    public SiniestroData(){
    con=Conexion.getConexion();
    }

    public void guardarSiniestro(Siniestro siniestro){
//     `siniestro``Codigo``tipo``FechaSiniestro``CoordX``CoordY``Detalles``FechaResol``Puntuacion``CodBrigada`
// INSERT INTO `siniestro`( `tipo`, `FechaSiniestro`, `CoordX`, `CoordY`, `Detalles`, `FechaResol`, `Puntuacion`, `CodBrigada`) 
    String sql="INSERT INTO siniestro (tipo,FechaSiniestro,CoordX, CoordY, Detalles,FechaResol,Puntuacion,CodBrigada)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,siniestro.getTipo());
            ps.setDate(2,siniestro.getFechaSiniestro());
            ps.setInt(3,siniestro.getCoordX());
            ps.setInt(4,siniestro.getCoordY());
            ps.setString(5, siniestro.getDetalles());
            ps.setDate(6,siniestro.getFechaResol());
            ps.setInt(7,siniestro.getPuntuacion());
            ps.setInt(8,siniestro.getBrigada().getCodBrigada());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                
                siniestro.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Siniestro agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al agregar Siniestro"+ex);
        }
        
    }
    
    
}
