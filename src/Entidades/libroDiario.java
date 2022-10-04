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
    private int  id_libro;
    private String empresa;
    private String f_inicio;
    private String f_fin;
    conexion conn;
    public libroDiario(){
    conn = new conexion();
    }
    public void aggLibro(){
        try {
            String stForm = String.format("insert into libroDIario(nombre_empresa,fecha_inicio,fecha_fin)"
                    + "values('%s','%s','%s','%s');", this.getEmpresa(), this.getF_inicio(), this.getF_fin());
            conn.ejecutaSentenciaSQL(stForm);
        } catch (Exception e) {
        }
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_liro(int id_liro) {
        this.id_libro = id_liro;
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
