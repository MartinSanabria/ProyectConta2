/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.xml.sax.Attributes;

/**
 *
 * @author blackbird
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    
    
    public frmPrincipal() {
        initComponents();
     
        
        this.setTitle("Servicio Perfecto");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
//       setIconImage(new ImageIcon(getClass().getResource("img/logo.png")).getImage());
//        Image icon= new Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    public void ShowPanel(JPanel p){
        p.setSize(620, 380);
        p.setLocation(0, 0);
        
        this.content.removeAll();
        this.content.add(p, BorderLayout.CENTER);
        this.content.revalidate();
        this.content.repaint();
    }
    void setColor(JPanel panel) {
        panel.setBackground(new Color(164,177,207));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(84,106,158));
    }
    
    //metodo para llamar jpanel libro diario
    public void mostrarlibro(){
        jpLibroDiario panelLibro = new jpLibroDiario();
        this.ShowPanel(panelLibro);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jpBground = new javax.swing.JPanel();
        jpbtns = new javax.swing.JPanel();
        jpcontenido = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btndiario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnmayor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btncatalogo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jpBground.setBackground(new java.awt.Color(255, 255, 255));
        jpBground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpbtns.setBackground(new java.awt.Color(49, 68, 111));

        javax.swing.GroupLayout jpbtnsLayout = new javax.swing.GroupLayout(jpbtns);
        jpbtns.setLayout(jpbtnsLayout);
        jpbtnsLayout.setHorizontalGroup(
            jpbtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jpbtnsLayout.setVerticalGroup(
            jpbtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpBground.add(jpbtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 40));

        jpcontenido.setBackground(new java.awt.Color(233, 222, 228));
        jpcontenido.setPreferredSize(new java.awt.Dimension(620, 380));

        Menu.setBackground(new java.awt.Color(84, 106, 158));
        Menu.setPreferredSize(new java.awt.Dimension(120, 420));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndiario.setBackground(new java.awt.Color(84, 106, 158));
        btndiario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btndiario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndiario.setMaximumSize(new java.awt.Dimension(120, 60));
        btndiario.setMinimumSize(new java.awt.Dimension(120, 60));
        btndiario.setPreferredSize(new java.awt.Dimension(120, 60));
        btndiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndiarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndiarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btndiarioMousePressed(evt);
            }
        });
        btndiario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LIBRO DIARIO");
        btndiario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        Menu.add(btndiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        btnmayor.setBackground(new java.awt.Color(84, 106, 158));
        btnmayor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnmayor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmayor.setMaximumSize(new java.awt.Dimension(120, 60));
        btnmayor.setMinimumSize(new java.awt.Dimension(120, 60));
        btnmayor.setPreferredSize(new java.awt.Dimension(120, 60));
        btnmayor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmayorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmayorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnmayorMousePressed(evt);
            }
        });
        btnmayor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIBRO MAYOR");
        btnmayor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        Menu.add(btnmayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 50));

        btncatalogo.setBackground(new java.awt.Color(84, 106, 158));
        btncatalogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btncatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncatalogo.setMaximumSize(new java.awt.Dimension(120, 60));
        btncatalogo.setMinimumSize(new java.awt.Dimension(120, 60));
        btncatalogo.setPreferredSize(new java.awt.Dimension(120, 60));
        btncatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncatalogoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncatalogoMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DE CUENTAS");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CATÁLOGO");

        javax.swing.GroupLayout btncatalogoLayout = new javax.swing.GroupLayout(btncatalogo);
        btncatalogo.setLayout(btncatalogoLayout);
        btncatalogoLayout.setHorizontalGroup(
            btncatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncatalogoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(btncatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        btncatalogoLayout.setVerticalGroup(
            btncatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncatalogoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btncatalogoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(btncatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 50));

        content.setBackground(new java.awt.Color(204, 204, 255));
        content.setMaximumSize(new java.awt.Dimension(620, 380));
        content.setPreferredSize(new java.awt.Dimension(620, 380));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpcontenidoLayout = new javax.swing.GroupLayout(jpcontenido);
        jpcontenido.setLayout(jpcontenidoLayout);
        jpcontenidoLayout.setHorizontalGroup(
            jpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcontenidoLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpcontenidoLayout.setVerticalGroup(
            jpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcontenidoLayout.createSequentialGroup()
                .addGroup(jpcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpBground.add(jpcontenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 740, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndiarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndiarioMouseEntered
        if (btndiario.getBackground().getRGB() == -15574355)
        setColor(btndiario);
    }//GEN-LAST:event_btndiarioMouseEntered

    private void btndiarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndiarioMouseExited
        if (this.btndiario.getBackground().getRGB() != -15574355)
        resetColor(btndiario);
          
    }//GEN-LAST:event_btndiarioMouseExited

    private void btndiarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndiarioMousePressed
        setColor(btndiario);
        resetColor(this.btndiario);
        // Abrir sección
        jpCrearLibro panelLibroDiario = new jpCrearLibro();
        this.ShowPanel(panelLibroDiario);        
    }//GEN-LAST:event_btndiarioMousePressed
   
    private void btnmayorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmayorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmayorMouseEntered

    private void btnmayorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmayorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmayorMouseExited

    private void btnmayorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmayorMousePressed
     setColor(btnmayor);
        resetColor(this.btnmayor);
        // Abrir sección
        jpLibroMayor panelLibroMayor = new jpLibroMayor();
        this.ShowPanel(panelLibroMayor);
    }//GEN-LAST:event_btnmayorMousePressed

    private void btncatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncatalogoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btncatalogoMouseEntered

    private void btncatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncatalogoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btncatalogoMouseExited

    private void btncatalogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncatalogoMousePressed
        // TODO add your handling code here:
        
       setColor(btncatalogo);
        resetColor(this.btncatalogo);
        // Abrir sección
        jpCatalogo panelCatalogo = new jpCatalogo();
        this.ShowPanel(panelCatalogo);
     
    }//GEN-LAST:event_btncatalogoMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btncatalogo;
    private javax.swing.JPanel btndiario;
    private javax.swing.JPanel btnmayor;
    private javax.swing.JPanel content;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jpBground;
    private javax.swing.JPanel jpbtns;
    private javax.swing.JPanel jpcontenido;
    // End of variables declaration//GEN-END:variables
}
