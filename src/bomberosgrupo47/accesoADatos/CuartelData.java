/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosgrupo47.accesoADatos;

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
public class CuartelData {
     private Connection con=null;
    public CuartelData(){
    con=Conexion.getConexion();
    }
    
    public void guardarCuartel(Cuartel cuartel){
//        NombreCuartel``Direccion``CoorX``CoorY``Telefono``Correo`
    String sql="INSERT INTO cuartel (NombreCuartel, Direccion, CoorX, CoorY, Telefono,Correo)"
                + "VALUES (? ,? ,? ,? ,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3,cuartel.getCoorX());
            ps.setInt(4,cuartel.getCoorY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                cuartel.setCodCuartel(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null,"Cuartel agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al agregar cuartel");
        }
    }
    public void modificarCuartel(Cuartel cuartel){
    String sql="UPDATE cuartel SET NombreCuartel=?, Direccion=?, CoorX=?, CoorY=?,Telefono=?,Correo=? WHERE CodCuartel=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3,cuartel.getCoorX());
            ps.setInt(4,cuartel.getCoorY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setInt(7,cuartel.getCodCuartel());
            int e= ps.executeUpdate();
            System.out.println(""+e);
            if (e==1) {
                JOptionPane.showMessageDialog(null,"Cuartel modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al modificar Cuartel"+ex);
        }
    }
    public Cuartel buscarCuartel (int id){
// SELECT * FROM `cuartel` WHERE 1   `CodCuartel``NombreCuartel``Direccion``CoorX``CoorY``Telefono``Correo`
        String sql = "SELECT NombreCuartel, Direccion, CoorX, CoorY,Telefono,Correo FROM cuartel WHERE  CodCuartel = ?" ;
        
        Cuartel cuartel=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                
                cuartel=new Cuartel();
               cuartel.setCodCuartel(id);
                cuartel.setNombreCuartel(rs.getString("NombreCuartel"));
                cuartel.setDireccion(rs.getString("Direccion"));
                cuartel.setCoorX(rs.getInt("CoorX"));
                cuartel.setCoorY(rs.getInt("CoorY"));
                cuartel.setTelefono(rs.getString("Telefono"));
               cuartel.setCorreo(rs.getString("Correo"));

            } else {
                            
                JOptionPane.showMessageDialog(null, "Cuartel no encontrado con ese ID");
                
            }
                ps.close();   
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
    
            return cuartel;
}
}
