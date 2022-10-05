/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Conexion.conexion;
import java.sql.Date;

/**
 *
 * @author fjose
 */
public class Asiento {
    private int id;
    private int codigo;
    private Date fecha;
    private String cuenta;
    private String concepto;
    private double debe;
    private double haber;
    private int id_libro;
    conexion conn;
    public Asiento (){
        conn = new conexion();
    }
    
     public void instAsiento(){
        try {
            String stForm = String.format("INSERT INTO asiento (id,codigo,cuenta,concepto,debe,haber,id_libro)"
                    + "values('%s','%s','%s','%s','%s','%s','%s');"
                    ,this.getId(),this.getCodigo(),this.getFecha(),this.getCuenta(),
                    this.getConcepto(),this.getDebe(),this.getHaber());
            conn.instUpdRegistros(stForm);
        } catch (Exception e) {
        }
    }
     
     public void deletAsiento(){
        try {
            String stForm = String.format("DELETE FROM asiento where id = '"
                    +this.getId()+"' and id_libro ='"+this.getId_libro()+"' )");
            conn.instUpdRegistros(stForm);
        } catch (Exception e) {
        }
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the debe
     */
    public double getDebe() {
        return debe;
    }

    /**
     * @param debe the debe to set
     */
    public void setDebe(double debe) {
        this.debe = debe;
    }

    /**
     * @return the haber
     */
    public double getHaber() {
        return haber;
    }

    /**
     * @param haber the haber to set
     */
    public void setHaber(double haber) {
        this.haber = haber;
    }

    /**
     * @return the id_libro
     */
    public int getId_libro() {
        return id_libro;
    }

    /**
     * @param id_libro the id_libro to set
     */
    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
