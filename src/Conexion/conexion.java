/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Juan
 */
public class conexion {
    
    String conexionBD = "jdbc:sqlite:bdProyect.s3db";
    Connection con = null;
    
    public void Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(conexionBD);
          
        } catch (Exception e) {
            System.out.println(e);

        }
        
    }
    
    
    public Connection ConnecrDB() throws ClassNotFoundException, SQLException{
        
            Class.forName("org.sqlite.JDBC");
           
         
        Connection con1 = DriverManager.getConnection("jdbc:sqlite:BD.s3db");
        return con1;
        
        
        
    }
    
    public boolean ejecutaSentenciaSQL(String sentencia){
        try {
            PreparedStatement pst = con.prepareStatement(sentencia);
            pst.execute();      
            return true;
        } catch (SQLException e) {
            System.out.println(e+"Error");  
            return false;
        }
    }
    
    public ResultSet consultaRegistros(String sentencia){
        try {
          PreparedStatement pst = con.prepareStatement(sentencia);
          ResultSet rst = pst.executeQuery();
          return rst;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
