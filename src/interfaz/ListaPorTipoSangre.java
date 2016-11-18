/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;

/**
 *
 * @author baltamar
 */
public class ListaPorTipoSangre extends javax.swing.JDialog {

    String ruta;

    /**
     * Creates new form ListaPorTipoSangre
     */
    public ListaPorTipoSangre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        ruta = "src/datos/pacientes.txt";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaPacientes = new javax.swing.JTable();
        cmbTipoSangre = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PACIENTES POR TIPO DE SANGRE");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PACIENTES POR TIPO DE SANGRE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        tblTablaPacientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblTablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Identificacion", "Nombre", "Apellido", "Edad", "Telefono", "Sexo", "Alergia", "T.Sangre", "Enfermedad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaPacientes.setToolTipText("");
        tblTablaPacientes.setOpaque(false);
        jScrollPane2.setViewportView(tblTablaPacientes);
        if (tblTablaPacientes.getColumnModel().getColumnCount() > 0) {
            tblTablaPacientes.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblTablaPacientes.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblTablaPacientes.getColumnModel().getColumn(8).setResizable(false);
            tblTablaPacientes.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 900, 230));

        cmbTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbTipoSangre.setForeground(new java.awt.Color(0, 102, 102));
        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        cmbTipoSangre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoSangreItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gota.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 220, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoSangreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoSangreItemStateChanged
        String tipoSangre;
        tipoSangre = cmbTipoSangre.getSelectedItem().toString();
        Helper.listadoPorTipoSangre(tblTablaPacientes, ruta, tipoSangre);
    }//GEN-LAST:event_cmbTipoSangreItemStateChanged

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
            java.util.logging.Logger.getLogger(ListaPorTipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPorTipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPorTipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPorTipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaPorTipoSangre dialog = new ListaPorTipoSangre(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaPacientes;
    // End of variables declaration//GEN-END:variables
}