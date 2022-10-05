/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Conexion.conexion;
import Entidades.libroDiario;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan
 */
public class jpCrearLibro extends javax.swing.JPanel {
    /**
     * Creates new form jpCrearLibro
     */
      libroDiario libD ;
    public jpCrearLibro() {
        initComponents();   
         libD = new libroDiario();
                 
    }
frmPrincipal p = new frmPrincipal();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fInicio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        fFin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnGenerarAsiento = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(620, 380));
        setPreferredSize(new java.awt.Dimension(620, 380));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setBackground(new java.awt.Color(204, 204, 255));
        admin.setMaximumSize(new java.awt.Dimension(620, 380));
        admin.setMinimumSize(new java.awt.Dimension(620, 380));
        admin.setPreferredSize(new java.awt.Dimension(620, 380));
        admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        admin.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, 620, 120));

        jLabel1.setText("Nombre de la empresa");
        admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        admin.add(nameEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 214, -1));

        jLabel2.setText("Fecha de operación");
        admin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));
        admin.add(fInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, -1));

        jLabel3.setText("Inicio:");
        admin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        admin.add(fFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, -1));

        jLabel4.setText("Fin:");
        admin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        btnGenerarAsiento.setText("Generar Asiento");
        btnGenerarAsiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenerarAsientoMousePressed(evt);
            }
        });
        btnGenerarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarAsientoActionPerformed(evt);
            }
        });
        admin.add(btnGenerarAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        btnEliminar.setText("Eliminar libro");
        admin.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        btnAgregar.setText("Agregar Libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        admin.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, -1, 348));

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnGenerarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarAsientoActionPerformed
        

    }//GEN-LAST:event_btnGenerarAsientoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
       
        String fechaI = ((JTextField)this.fInicio.getDateEditor().getUiComponent()).getText();
        String fechaF = ((JTextField)this.fFin.getDateEditor().getUiComponent()).getText();
        libD.setEmpresa(this.nameEmpresa.getText().trim());
        libD.setF_fin(fechaF);
        libD.setF_inicio(fechaI);
       

        libD.aggLibro();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarAsientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarAsientoMousePressed
       
        p.mostrarlibro();
    }//GEN-LAST:event_btnGenerarAsientoMousePressed
    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarAsiento;
    private com.toedter.calendar.JDateChooser fFin;
    private com.toedter.calendar.JDateChooser fInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameEmpresa;
    // End of variables declaration//GEN-END:variables
}