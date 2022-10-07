/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Conexion.conexion;

/**
 *
 * @author Juan
 */
public class libroDiario {
   
    private String empresa;
    private String f_inicio;
    private String f_fin;
    
    conexion conn;
    public libroDiario(){
    conn = new conexion();
    }
    public void aggLibro(){
         System.out.println(this.getEmpresa());
      System.out.println(this.getF_fin());
      System.out.println(this.getF_inicio());
        try {
            String stForm = String.format("insert into libroDiario(nombre_empresa,fecha_inicio,fecha_fin)"
                    + "values('"+this.getEmpresa()+"','"+this.getF_inicio()+"','"+this.getF_fin()+"');" );
            conn.ejecutaSentenciaSQL(stForm);
        } catch (Exception e) {
            System.out.println(e+"errG");
        }
    }
public void deleteLibro(int nLibro){
        try {
            String stForm = String.format("delete from libroDiario where id_libro = '"+nLibro+"';");
            conn.instUpdRegistros(stForm);
        } catch (Exception e) {
             System.out.println(e+"errG");
        }
    }
   

   

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
    }

    public String getF_fin() {
        return f_fin;
    }

    public void setF_fin(String f_fin) {
        this.f_fin = f_fin;
    }

}
