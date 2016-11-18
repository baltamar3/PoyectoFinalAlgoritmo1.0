package interfaz;

import clases.Doctor;
import clases.Helper;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author baltamar
 */
public class AgregarDoctor extends javax.swing.JDialog {

    String rutaD;
    ObjectOutputStream salida;
    LinkedList<Doctor> doctores;

    public AgregarDoctor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        rutaD = "src/datos/doctores.txt";

        try {
            doctores = Helper.traerDatos(rutaD);
            salida = new ObjectOutputStream(new FileOutputStream(rutaD));
        } catch (IOException ex) {
            Logger.getLogger(AgregarDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        Helper.volcado(salida, doctores);
        Helper.llenarTablaDoctores(tblDoctores, rutaD);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtConsultorio = new javax.swing.JTextField();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        chbAceptarTerminos = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdCopiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR DOCTOR");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identificación:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        txtIdentificacion.setSelectedTextColor(new java.awt.Color(51, 255, 0));
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Especialidad Clinica:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 51));
        jLabel11.setText("*");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Consultorio:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtConsultorio.setSelectedTextColor(new java.awt.Color(51, 255, 0));
        txtConsultorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultorioKeyTyped(evt);
            }
        });
        jPanel2.add(txtConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, -1));

        cmbEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Infectologia", "Neumologia", "Nutriologia", "Oftalmologia", "Pediatria", "Psiquiatria", "Reumatologia" }));
        jPanel2.add(cmbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 200, -1));

        cmbSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Indeterminado" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, -1));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Edad:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        chbAceptarTerminos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chbAceptarTerminos.setForeground(new java.awt.Color(255, 255, 255));
        chbAceptarTerminos.setText("Acepto terminos y condiciones");
        chbAceptarTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAceptarTerminosActionPerformed(evt);
            }
        });
        jPanel2.add(chbAceptarTerminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 440, 290));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setBackground(new java.awt.Color(0, 102, 102));
        cmdGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.setEnabled(false);
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        cmdLimpiar.setBackground(new java.awt.Color(0, 102, 102));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        cmdSalir.setBackground(new java.awt.Color(0, 102, 102));
        cmdSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdSalir.setForeground(new java.awt.Color(255, 255, 255));
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 40));

        cmdCopiar.setBackground(new java.awt.Color(0, 102, 102));
        cmdCopiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdCopiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCopiar.setText("Copiar Identificación");
        cmdCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCopiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 190, 290));

        tblDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Identificación", "Nombre", "Apellido", "Edad", "Telefono", "Sexo", "Especialidad", "Consultorio"
            }
        ));
        jScrollPane1.setViewportView(tblDoctores);
        if (tblDoctores.getColumnModel().getColumnCount() > 0) {
            tblDoctores.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblDoctores.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 720, 210));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gota.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 240, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String identificacion, nombre, apellido, edad, telefono, sexo, especialidad, consultorio;

        if (txtIdentificacion.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo IDENTIFICACION", 3);
            txtIdentificacion.requestFocusInWindow();
        } else if (txtNombre.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo NOMBRE", 3);
            txtNombre.requestFocusInWindow();
        } else if (txtApellido.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo APELLIDO", 3);
            txtApellido.requestFocusInWindow();
        } else if (txtEdad.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo EDAD", 3);
            txtEdad.requestFocusInWindow();
        } else if (txtTelefono.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo TELEFONO", 3);
            txtTelefono.requestFocusInWindow();
        } else if (txtConsultorio.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo CONSULTORIO", 3);
            txtConsultorio.requestFocusInWindow();
        } else if (Helper.buscarDoctorIdentificacion(txtIdentificacion.getText().trim(), rutaD)) {
            Helper.mensaje(this, "La identificacion ingresada ya se encuentra registrada en la base de datos", 3);
            txtIdentificacion.requestFocusInWindow();
            txtIdentificacion.selectAll();
        } else if (Helper.validarConsultorioMedico(txtConsultorio.getText().trim(), rutaD)) {
            Helper.mensaje(this, "El consultorio ingresado se encuentra uso", 3);
            txtConsultorio.requestFocusInWindow();
            txtConsultorio.selectAll();
        } else {
            identificacion = txtIdentificacion.getText().trim();
            nombre = txtNombre.getText().trim();
            apellido = txtApellido.getText().trim();
            edad = txtEdad.getText().trim();
            telefono = txtTelefono.getText().trim();
            sexo = cmbSexo.getSelectedItem().toString();
            especialidad = cmbEspecialidad.getSelectedItem().toString();
            consultorio = txtConsultorio.getText().trim();

            Doctor d = new Doctor(identificacion, nombre, apellido, edad, telefono, sexo, especialidad, consultorio);

            try {
                d.guardar(salida);
            } catch (IOException ex) {
                Logger.getLogger(AgregarDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.llenarTablaDoctores(tblDoctores, rutaD);
            Helper.mensaje(this, "Doctor agregado exitosamente", 1);
            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtEdad.setText("");
            txtConsultorio.setText("");
            cmbSexo.setSelectedIndex(0);
            cmbEspecialidad.setSelectedIndex(0);
        }

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtConsultorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultorioKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtConsultorioKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void cmdCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCopiarActionPerformed
        int i;
        Doctor d;
        LinkedList<Doctor> doctor = Helper.traerDatos(rutaD);
        i = tblDoctores.getSelectedRow();
        if (i >= 0) {
            d = doctor.get(i);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection data = new StringSelection(d.getIdentificacion());
            clipboard.setContents(data, data);
            Helper.mensaje(this, "Identificación del doctor copiada", 1);
        } else {
            Helper.mensaje(this, "Por favor antes seleccione al doctor que desea copiar su identificación", 3);
        }

    }//GEN-LAST:event_cmdCopiarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtIdentificacion.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtConsultorio.setText("");
        cmbEspecialidad.setSelectedItem(0);
        cmbSexo.setSelectedItem(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void chbAceptarTerminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAceptarTerminosActionPerformed
        if (chbAceptarTerminos.isSelected()) {
            cmdGuardar.setEnabled(true);
        } else {
            cmdGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_chbAceptarTerminosActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarDoctor dialog = new AgregarDoctor(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox chbAceptarTerminos;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton cmdCopiar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
