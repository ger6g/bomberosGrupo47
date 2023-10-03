/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.accesoADatos;

import bomberosgrupo47.entidades.Bombero;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class BomberoData {
    private Connection con=null;
    public BomberoData(){
    con=Conexion.getConexion();
    }
    
    public void guardarBombero(Bombero bombero){
//        dni`, `NombreApellido`, `FechaNac`, `Celular`, `CodBrigada
    String sql="INSERT INTO bombero (dni, NombreApellido, FechaNac, Celular, CodBrigada)"
                + "VALUES (? ,? ,? ,? ,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
//          ps.setDate(3,Date.valueOf(bombero.getFechaNac()));
            ps.setDate(3,bombero.getFechaNac());
            ps.setString(4, bombero.getCelular());
            ps.setInt(5, bombero.getBrigada().getCodBrigada());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Bombero agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error 404");
        }
    }
}
