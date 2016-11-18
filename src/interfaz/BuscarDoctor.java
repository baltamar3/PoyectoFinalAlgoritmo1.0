package interfaz;

import clases.Doctor;
import clases.Helper;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CUC
 */
public class BuscarDoctor extends javax.swing.JDialog {

    String rutaD;
    ObjectOutputStream salida;
    Doctor d;

    public BuscarDoctor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rutaD = "src/datos/doctores.txt";

        JTextField[] camposD = {txtNombre, txtIdentificacion, txtApellido, txtEdad, txtTelefono, txtConsultorio};
        JButton botonesH[] = {cmdBuscar};
        JButton botonesD[] = {cmdModificar, cmdGuardar, cmdEliminar};

        Helper.deshabilitarCampos(camposD);
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtIdentificacionBuscar = new javax.swing.JTextField();
        cmdBuscar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmdModificar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        txtConsultorio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR DOCTOR");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Identificación:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtIdentificacionBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionBuscarKeyTyped(evt);
            }
        });
        jPanel4.add(txtIdentificacionBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 150, -1));

        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478291605_Search-Male-User.png"))); // NOI18N
        cmdBuscar.setToolTipText("Buscar Paciente");
        cmdBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478291605_Search-Male-User.png"))); // NOI18N
        cmdBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478291708_Search-Male-User.png"))); // NOI18N
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 120, 30));

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/return.png"))); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 950, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292243_Edit-Male-User.png"))); // NOI18N
        cmdModificar.setToolTipText("Modificar paciente");
        cmdModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292243_Edit-Male-User.png"))); // NOI18N
        cmdModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292247_Edit-Male-User.png"))); // NOI18N
        cmdModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdModificarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 40));

        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292513_Remove-Male-User.png"))); // NOI18N
        cmdEliminar.setToolTipText("Eliminar Paciente");
        cmdEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292513_Remove-Male-User.png"))); // NOI18N
        cmdEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292515_Remove-Male-User.png"))); // NOI18N
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 110, 40));

        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292402_Accept-Male-User.png"))); // NOI18N
        cmdGuardar.setToolTipText("Guardar Paciente");
        cmdGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292402_Accept-Male-User.png"))); // NOI18N
        cmdGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/1478292404_Accept-Male-User.png"))); // NOI18N
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 950, 82));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Doctor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Identificación:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));

        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIdentificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 180, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Nombre:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 20));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel5.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 180, -1));

        cmbSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Indeterminado" }));
        cmbSexo.setEnabled(false);
        jPanel5.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 180, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Sexo:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 90, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Edad:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEdad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel5.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, -1));

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Infectologia", "Neumologia", "Nutriologia", "Oftalmologia", "Pediatria", "Psiquiatria", "Reumatologia" }));
        cmbEspecialidad.setEnabled(false);
        jPanel5.add(cmbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 180, -1));

        txtConsultorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsultorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultorioKeyTyped(evt);
            }
        });
        jPanel5.add(txtConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 180, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Consultorio:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Especialidad Clinica:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 950, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctores.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String identificacion;

        if (txtIdentificacionBuscar.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor, ingrese la identificacion del doctor que desea buscar", 1);
            txtIdentificacionBuscar.requestFocusInWindow();
        } else {
            identificacion = txtIdentificacionBuscar.getText().trim();
            if (Helper.buscarDoctorIdentificacion(identificacion, rutaD) == false) {
                Helper.mensaje(this, "doctor Inexistente", 1);
                txtIdentificacionBuscar.requestFocusInWindow();
                txtIdentificacionBuscar.selectAll();
            } else if (Helper.buscarDoctorIdentificacion(identificacion, rutaD)) {
                d = Helper.traerDoctorIdentificacion(identificacion, rutaD);
                txtNombre.setText(d.getNombre());
                txtIdentificacion.setText(d.getIdentificacion());
                txtApellido.setText(d.getApellido());
                txtEdad.setText(d.getEdad());
                txtTelefono.setText(d.getTelefono());
                cmbSexo.setSelectedItem(d.getSexo());
                cmbEspecialidad.setSelectedItem(d.getEspecialidad());
                txtConsultorio.setText(d.getConsultorio());

                JButton botonesH[] = {cmdModificar, cmdEliminar, cmdCancelar};
                JButton botonesD[] = {cmdGuardar};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);

            }
        }

    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
        JTextField[] camposH = {txtNombre, txtApellido, txtEdad, txtTelefono, txtConsultorio};
        Helper.habilitarCampos(camposH);
        cmbSexo.setEnabled(true);
        cmbEspecialidad.setEnabled(true);

        JButton botonesH[] = {cmdGuardar, cmdCancelar};
        JButton botonesD[] = {cmdModificar, cmdEliminar, cmdBuscar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdModificarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String identificacion, nombre, apellido, telefono, edad, sexo, especialidad, consultorio;
        LinkedList<Doctor> doctoresModificados;

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
        } else if (Helper.buscarDoctorIdentificacion(txtIdentificacion.getText(), rutaD)) {
            Doctor d;
            d = Helper.traerDoctorIdentificacion(txtIdentificacion.getText(), rutaD);
            if (d.getConsultorio().equals(txtConsultorio.getText()) || Helper.validarConsultorioMedico(txtConsultorio.getText(), rutaD) == false) {
                identificacion = txtIdentificacion.getText().trim();
                nombre = txtNombre.getText().trim();
                apellido = txtApellido.getText().trim();
                edad = txtEdad.getText().trim();
                telefono = txtTelefono.getText().trim();
                sexo = cmbSexo.getSelectedItem().toString().trim();
                consultorio = txtConsultorio.getText().trim();
                especialidad = cmbEspecialidad.getSelectedItem().toString().trim();

                doctoresModificados = Helper.modificarDoctor(identificacion, rutaD, nombre, apellido, edad, telefono, sexo, especialidad, consultorio);
                try {
                    salida = new ObjectOutputStream(new FileOutputStream(rutaD));
                } catch (IOException ex) {
                    Logger.getLogger(BuscarDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
                Helper.volcado(salida, doctoresModificados);

                txtIdentificacion.setText("");
                txtIdentificacionBuscar.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtEdad.setText("");
                txtTelefono.setText("");
                txtConsultorio.setText("");
                cmbSexo.setSelectedIndex(0);
                cmbSexo.setEnabled(false);
                cmbEspecialidad.setSelectedIndex(0);
                cmbEspecialidad.setEnabled(false);

                JButton botonesH[] = {cmdBuscar};
                JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar};
                JTextField[] camposD = {txtNombre, txtApellido, txtEdad, txtTelefono, txtConsultorio, txtIdentificacion};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
                Helper.deshabilitarCampos(camposD);
                Helper.mensaje(this, "Doctor actualizado exotosamente", "INFORMACION");
            } else {
                Helper.mensaje(this, "El consultorio ingresado se encuentra uso", 3);
                txtConsultorio.requestFocusInWindow();
                txtConsultorio.selectAll();
            }

        }


    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int op, i;
        String identificacion;
        identificacion = txtIdentificacion.getText();
        LinkedList<Doctor> doctores = Helper.traerDatos(rutaD);

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            i = Helper.traerIndexDoctorIdentificacion(identificacion, rutaD);
            doctores.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(rutaD));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BuscarDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BuscarDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, doctores);

            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtConsultorio.setText("");
            cmbSexo.setSelectedIndex(0);
            cmbEspecialidad.setSelectedIndex(0);
            cmbSexo.setEnabled(false);
            cmbEspecialidad.setEnabled(false);
            txtIdentificacionBuscar.setText("");
            txtIdentificacionBuscar.requestFocusInWindow();

            Helper.mensaje(this, "Doctor eliminado exitosamente", 1);

            JButton botonesH[] = {cmdBuscar};
            JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void txtConsultorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultorioKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtConsultorioKeyTyped

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtIdentificacionBuscar.setText("");
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtConsultorio.setText("");
        cmbSexo.setSelectedIndex(0);
        cmbEspecialidad.setSelectedIndex(0);
        cmbSexo.setEnabled(false);
        cmbEspecialidad.setEnabled(false);

        JButton botonesH[] = {cmdBuscar};
        JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar};
        JTextField[] camposD = {txtNombre, txtApellido, txtEdad, txtTelefono, txtConsultorio, txtIdentificacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        Helper.deshabilitarCampos(camposD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtIdentificacionBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionBuscarKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionBuscarKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(BuscarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarDoctor dialog = new BuscarDoctor(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtIdentificacionBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
