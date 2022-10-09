/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Conexion.conexion;
import Entidades.Asiento;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blackbird
 */
public class jpLibroDiario extends javax.swing.JPanel {

    /**
     * Creates new form jpLibroDiario
     */
    public jpLibroDiario() {
        initComponents();
    }

    int lib;
    int id;
    DefaultTableModel modelo = new DefaultTableModel();
    conexion conectO;
    Asiento asiento;

    public jpLibroDiario(int libro) {
        initComponents();
        this.mostrarAsiento();
        this.lib = libro;
        asiento = new Asiento();
        conectO = new conexion();
        this.cargarAsiento();
        this.validaAsiento();
        this.limpiarCampos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTDebe = new javax.swing.JTextField();
        jTComentario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTHaber = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        jTCuenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtDebeTotal = new javax.swing.JTextField();
        jtHaberTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTidAsiento = new javax.swing.JSpinner();
        cierraLibro = new javax.swing.JButton();

        admin.setBackground(new java.awt.Color(204, 204, 255));
        admin.setMaximumSize(new java.awt.Dimension(6200, 3800));
        admin.setPreferredSize(new java.awt.Dimension(797, 421));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable (int row, int col){
                return false;
            }
        };
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Eliminar asiento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar asiento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha:");

        jLabel2.setText("Cuenta:");

        jLabel3.setText("Debe:");

        jLabel4.setText("Haber:");

        jLabel5.setText("Comentario:");

        jDate.setDateFormatString("dd/MM/yyyy");

        jTCuenta.setEditable(false);

        jScrollPane2.setEnabled(false);
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane2MousePressed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setText("N° Asiento:");

        jTCodigo.setEditable(false);

        jLabel7.setText("Codigo:");

        jtDebeTotal.setEditable(false);

        jtHaberTotal.setEditable(false);

        jButton3.setText("Terminar asiento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTidAsiento.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cierraLibro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cierraLibro.setText("Cerrar libro");
        cierraLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierraLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminLayout.createSequentialGroup()
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addGroup(adminLayout.createSequentialGroup()
                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(adminLayout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(50, 50, 50)
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton3))
                                            .addGroup(adminLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminLayout.createSequentialGroup()
                                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addGap(8, 8, 8)))
                                                .addGap(41, 41, 41)
                                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(adminLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(adminLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(adminLayout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(adminLayout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addComponent(jLabel6)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(jTidAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(cierraLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtDebeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtHaberTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTidAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(58, 58, 58)
                                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)))
                            .addComponent(jTComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDebeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtHaberTotal)
                    .addComponent(cierraLibro))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 71, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String fecha = ((JTextField) this.jDate.getDateEditor().getUiComponent()).getText();
        int id = Integer.parseInt(this.jTidAsiento.getValue().toString());
        int codigo = Integer.parseInt(this.jTCodigo.getText());
        String cuenta = this.jTCuenta.getText();
        double debe = Double.parseDouble(this.jTDebe.getText());
        double haber = Double.parseDouble(this.jTHaber.getText());
        String concepto = this.jTComentario.getText();

        if (debe >= 0 && haber >= 0 && fecha.getBytes().length > 9) {
            asiento.setId(id);
            asiento.setCodigo(codigo);
            asiento.setCuenta(cuenta);
            asiento.setConcepto(concepto);
            asiento.setDebe(debe);
            asiento.setHaber(haber);
            asiento.setFecha(fecha);
            asiento.setId_libro(this.lib);
            asiento.instAsiento();
            this.cargarAsiento();
            this.jDate.setEnabled(false);
            this.jTidAsiento.setEnabled(false);
            this.limpiarCampos();
            this.cierraLibro.setEnabled(false);
            this.validaAsiento();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jScrollPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MousePressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = this.jTable2.getSelectedRow();
        this.jTCodigo.setText((String) this.jTable2.getValueAt(index, 0));
        this.jTCuenta.setText((String) this.jTable2.getValueAt(index, 1));
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.asiento.deletAsiento(this.id, this.lib);
        this.cargarAsiento();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = this.jTable1.getSelectedRow();
        this.id = Integer.parseInt(this.jTable1.getValueAt(index, 0).toString());
        System.out.print(this.id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if (this.validaAsiento() == false){
              JOptionPane.showMessageDialog(null, "Incosistencia de asiento, Favor ingresar partes faltantes para igualar",
               "accion", JOptionPane.INFORMATION_MESSAGE);
        }else{
         this.habilitaNewAsiento();
         this.cierraLibro.setEnabled(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cierraLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierraLibroActionPerformed
        // TODO add your handling code here:
        frmAsiento asi = (frmAsiento) SwingUtilities.getWindowAncestor(this);
       
             asi.dispose();
    
    }//GEN-LAST:event_cierraLibroActionPerformed

    public void cargarAsiento() {
        try {
            modelo.setColumnCount(0);
            modelo.setRowCount(0);

            this.jTable1.setModel(modelo);
            ResultSet rst = conectO.consultaRegistros("select id,fecha,codigo,cuenta,concepto,debe,haber from asiento"
                    + " where id_libro = " + this.lib + ";");
            modelo.addColumn("id");
            modelo.addColumn("Fecha");
            modelo.addColumn("codigo");
            modelo.addColumn("cuenta");
            modelo.addColumn("concepto");
            modelo.addColumn("debe");
            modelo.addColumn("haber");
            while (rst.next()) {

                Object[] data = {rst.getInt("id"), rst.getString("fecha"),
                    rst.getInt("codigo"), rst.getString("cuenta"), rst.getString("concepto"),
                     rst.getDouble("debe"), rst.getDouble("haber")};
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
    }
    public void habilitaNewAsiento(){
    this.jTidAsiento.setValue(0);
    this.jDate.setCalendar(null);
    this.jDate.setEnabled(true);
    this.jTidAsiento.setEnabled(true);
    }
    public void limpiarCampos() {
        
        this.jTCodigo.setText(null);
        this.jTCuenta.setText(null);
        this.jTDebe.setText("0");
        this.jTHaber.setText("0");
        this.jTComentario.setText(null);
    }

    public boolean validaAsiento() {
        int indice = this.jTable1.getRowCount() - 1;
        double debe = 0, haber = 0;
        for (int i = 0; i <= indice; i++) {
            debe += Double.parseDouble(this.jTable1.getValueAt(i, 5).toString());;
            haber += Double.parseDouble(this.jTable1.getValueAt(i, 6).toString());;
        }
        this.jtDebeTotal.setText(Double.toString(debe));
        this.jtHaberTotal.setText(Double.toString(haber));
        if (debe != haber) {
           this.jtDebeTotal.setForeground(new Color(255, 0, 0));
           this.jtHaberTotal.setForeground(new Color(255, 0, 0));
            return false;
            
        } else {
             this.jtDebeTotal.setForeground(new Color(0,153,0));
           this.jtHaberTotal.setForeground(new Color(0,153,0));
            return true;

        }
    }

    public void mostrarAsiento() {
        String filePath = "src\\Catalogo.txt";
        File cuentas = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(cuentas));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setColumnIdentifiers(columnsName);

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al cargar el catalogo<");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin;
    private javax.swing.JButton cierraLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTComentario;
    private javax.swing.JTextField jTCuenta;
    private javax.swing.JTextField jTDebe;
    private javax.swing.JTextField jTHaber;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JSpinner jTidAsiento;
    private javax.swing.JTextField jtDebeTotal;
    private javax.swing.JTextField jtHaberTotal;
    // End of variables declaration//GEN-END:variables
}
