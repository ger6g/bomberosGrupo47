/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.accesoADatos;

import bomberosgrupo47.entidades.Bombero;
import bomberosgrupo47.entidades.Brigada;
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
    private BrigadaData brid=new BrigadaData();
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
    
    public void modificarBombero(Bombero bombero) {
//        UPDATE `bombero` SET `idBombero`='[value-1]',`dni`='[value-2]',`NombreApellido`='[value-3]'
//,`FechaNac`='[value-4]',`Celular`='[value-5]',`CodBrigada`='[value-6]' WHERE 1

       
        String sql = "UPDATE bombero SET NombreApellido=?, FechaNac=?, CodBrigada=?, dni=?,Celular=?"
                + "WHERE idBombero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, bombero.getNombreApellido());

            ps.setDate(2, bombero.getFechaNac());
            ps.setInt(3, bombero.getBrigada().getCodBrigada());
            ps.setInt(4, bombero.getDni());
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getIdBombero());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "bombero Modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
        }
    }
    public Bombero buscarBombero (int id){
//SELECT `dni``NombreApellido``FechaNac``Celular``CodBrigada` FROM `bombero` WHERE `idBombero`
        String sql = "SELECT NombreApellido, FechaNac, CodBrigada, dni,Celular FROM bombero WHERE  idBombero = ? ";
        
        Bombero bombero=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                
                bombero=new Bombero();
               bombero.setIdBombero(id);
                bombero.setNombreApellido(rs.getString("NombreApellido"));
                bombero.setFechaNac(rs.getDate("FechaNac"));
              //  bombero.setCodBrigada(rs.getInt("codBrigada"));
              Brigada brigada=brid.buscarBrigada(rs.getInt("codBrigada"));
              bombero.setBrigada(brigada);
               bombero.setDni(rs.getInt("dni"));
                bombero.setCelular(rs.getString("celular"));
                

            } else {
                            
                JOptionPane.showMessageDialog(null, "Bombero no encontrado con ese ID");
                
            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
        }
    
            return bombero;
} 
}
