/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.accesoADatos;

import bomberosgrupo47.entidades.Brigada;
import bomberosgrupo47.entidades.Cuartel;
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
public class BrigadaData {
    private Connection con=null;
    public BrigadaData(){
    con=Conexion.getConexion();
    }
    
    public void guardarBrigada(Brigada brigada){
//        `CodBrigada``NombreBr``Especialidad``Libre``NroCuartel`
    String sql="INSERT INTO brigada (NombreBr, Especialidad, Libre, NroCuartel)"
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombreBr());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3,brigada.isLibre());
            ps.setInt(4,brigada.getCuartel().getCodCuartel());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"brigada agregada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al agregar brigada");
        }
    }
}
