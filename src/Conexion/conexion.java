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
    
    Connection conn = null;

    public conexion(){
        try{
         conn = DriverManager.getConnection( "jdbc:sqlite:bdProyect.s3db" );
         if ( conn != null ){
            System.out.println("Conexión exitosa!");
         }
      }
      catch ( Exception ex ) {
         System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
         System.out.println("Error en la conexión");
      }

    }
    
    public Connection ConnecrDB() throws ClassNotFoundException, SQLException{
        
            Class.forName("org.sqlite.JDBC");
           
         
        Connection con1 = DriverManager.getConnection("jdbc:sqlite:bdProyect.s3db");
        return con1;
        
        
        
    }
    
    public boolean ejecutaSentenciaSQL(String sentencia){
        try {
            PreparedStatement pst = conn.prepareStatement(sentencia);
            pst.execute();      
            return true;
        } catch (SQLException e) {
            System.out.println(e+"Error");  
            return false;
        }
    }
    
    public ResultSet consultaRegistros(String sentencia){
        try {
          PreparedStatement pst = conn.prepareStatement(sentencia);
          ResultSet rst = pst.executeQuery();
          return rst;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }   
    
    public void instUpdRegistros(String sentencia){
        try {
<<<<<<< HEAD
          PreparedStatement pst = conn.prepareStatement(sentencia);
=======
          PreparedStatement pst = con.prepareStatement(sentencia);
>>>>>>> 77b6aa922b1b6bfa22a49de6c6041481b1eee7bb
          pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }   
}
