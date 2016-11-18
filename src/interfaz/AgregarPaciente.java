package interfaz;

import clases.Helper;
import clases.Paciente;
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
 * @author baltamar3
 */
public class AgregarPaciente extends javax.swing.JDialog {

    String rutaP;
    ObjectOutputStream salida;
    LinkedList<Paciente> pacientes;

    public AgregarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        rutaP = "src/datos/pacientes.txt";

        try {
            pacientes = Helper.traerDatos(rutaP);
            salida = new ObjectOutputStream(new FileOutputStream(rutaP));
        } catch (IOException ex) {
            Logger.getLogger(AgregarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Helper.volcado(salida, pacientes);
        Helper.llenarTablaPacientes(tblTablaPacientes, rutaP);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbAlergico = new javax.swing.ButtonGroup();
        rbEnfermedad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbAlergicoSi = new javax.swing.JRadioButton();
        rbAlergicoNo = new javax.swing.JRadioButton();
        txtTipoDeAlergia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoSangre = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        rbEnfermoSi = new javax.swing.JRadioButton();
        rbEnfermoNo = new javax.swing.JRadioButton();
        txtTipoDeEnfermedad = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdCopiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaPacientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR PACIENTE");

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
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alergico:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        rbAlergico.add(rbAlergicoSi);
        rbAlergicoSi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAlergicoSi.setForeground(new java.awt.Color(255, 255, 255));
        rbAlergicoSi.setText("Sí");
        rbAlergicoSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAlergicoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergicoSiActionPerformed(evt);
            }
        });
        jPanel2.add(rbAlergicoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));

        rbAlergico.add(rbAlergicoNo);
        rbAlergicoNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAlergicoNo.setForeground(new java.awt.Color(255, 255, 255));
        rbAlergicoNo.setSelected(true);
        rbAlergicoNo.setText("No");
        rbAlergicoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergicoNoActionPerformed(evt);
            }
        });
        jPanel2.add(rbAlergicoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 20));

        txtTipoDeAlergia.setText("Ninguna");
        txtTipoDeAlergia.setEnabled(false);
        jPanel2.add(txtTipoDeAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de sangre:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 90, 20));

        cmbTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jPanel2.add(cmbTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¿Sufre alguna enfermead?");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        rbEnfermedad.add(rbEnfermoSi);
        rbEnfermoSi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbEnfermoSi.setForeground(new java.awt.Color(255, 255, 255));
        rbEnfermoSi.setText("Sí");
        rbEnfermoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermoSiActionPerformed(evt);
            }
        });
        jPanel2.add(rbEnfermoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, 20));

        rbEnfermedad.add(rbEnfermoNo);
        rbEnfermoNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbEnfermoNo.setForeground(new java.awt.Color(255, 255, 255));
        rbEnfermoNo.setSelected(true);
        rbEnfermoNo.setText("No");
        rbEnfermoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermoNoActionPerformed(evt);
            }
        });
        jPanel2.add(rbEnfermoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 20));

        txtTipoDeEnfermedad.setText("Ninguna");
        txtTipoDeEnfermedad.setEnabled(false);
        jPanel2.add(txtTipoDeEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 220, -1));

        cmbSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Indeterminado" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Edad:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 910, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setBackground(new java.awt.Color(0, 102, 102));
        cmdGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.setBorder(null);
        cmdGuardar.setOpaque(false);
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 40));

        cmdLimpiar.setBackground(new java.awt.Color(0, 102, 102));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.setBorder(null);
        cmdLimpiar.setOpaque(false);
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, 40));

        cmdSalir.setBackground(new java.awt.Color(0, 102, 102));
        cmdSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdSalir.setForeground(new java.awt.Color(255, 255, 255));
        cmdSalir.setText("Salir");
        cmdSalir.setBorder(null);
        cmdSalir.setOpaque(false);
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 130, 40));

        cmdCopiar.setBackground(new java.awt.Color(0, 102, 102));
        cmdCopiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdCopiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCopiar.setText("Copiar Identificación");
        cmdCopiar.setBorder(null);
        cmdCopiar.setOpaque(false);
        cmdCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCopiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 910, 90));

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
            tblTablaPacientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblTablaPacientes.getColumnModel().getColumn(4).setPreferredWidth(25);
            tblTablaPacientes.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gota.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 230, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        
        
        if (rbAlergicoSi.isEnabled()){
            rbAlergicoNo.isEnabled();
            txtTipoDeAlergia.setEnabled(false);
            txtTipoDeAlergia.setText("Ninguna");
        }
        if (rbEnfermoSi.isEnabled()){
            rbEnfermoNo.isEnabled();
            txtTipoDeEnfermedad.setEnabled(false);
            txtTipoDeEnfermedad.setText("Ninguna");
        }
        
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtEdad.setText("");
        cmbTipoSangre.setSelectedIndex(0);
        rbAlergicoNo.setSelected(true);
        rbEnfermoNo.setSelected(true);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String identificacion, nombre, apellido, telefono, edad, sexo, alergia, tipoSangre, enfermedad;

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
        } else if (txtTipoDeAlergia.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo ALERGIA o desactivelo en su defecto", 3);
            txtTipoDeAlergia.requestFocusInWindow();
        } else if (txtTipoDeEnfermedad.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor Ingrese el campo ENFERMEDAD o desactivelo en su defecto", 3);
            txtTipoDeEnfermedad.requestFocusInWindow();
        } else if (Helper.buscarPacienteIdentificacion(txtIdentificacion.getText(), rutaP) == false) {
            identificacion = txtIdentificacion.getText().trim();
            nombre = txtNombre.getText().trim();
            apellido = txtApellido.getText().trim();
            edad = txtEdad.getText().trim();
            telefono = txtTelefono.getText().trim();
            sexo = cmbSexo.getSelectedItem().toString();
            alergia = txtTipoDeAlergia.getText().trim();
            tipoSangre = cmbTipoSangre.getSelectedItem().toString();
            enfermedad = txtTipoDeEnfermedad.getText().trim();

            Paciente p = new Paciente(identificacion, nombre, apellido, edad, telefono, sexo, alergia, tipoSangre, enfermedad);

            try {
                p.guardar(salida);
            } catch (IOException ex) {
                Logger.getLogger(AgregarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

            Helper.llenarTablaPacientes(tblTablaPacientes, rutaP);
            Helper.mensaje(this, "Paciente agregado exitosamente", 1);
            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtEdad.setText("");
            txtTipoDeEnfermedad.setEnabled(false);
            txtTipoDeAlergia.setEnabled(false);
            txtTipoDeEnfermedad.setText("Ninguna");
            txtTipoDeAlergia.setText("Ninguna");
            cmbTipoSangre.setSelectedIndex(0);
            cmbSexo.setSelectedIndex(0);
            rbAlergicoNo.setSelected(true);
            rbEnfermoNo.setSelected(true);

        } else {
            Helper.mensaje(this, "La identificacion ingresada ya se encuentra registrada en la base de datos", 3);
            txtIdentificacion.requestFocusInWindow();
            txtIdentificacion.selectAll();
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void rbEnfermoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermoNoActionPerformed
        txtTipoDeEnfermedad.setEnabled(false);
        txtTipoDeEnfermedad.setText("Ninguna");
    }//GEN-LAST:event_rbEnfermoNoActionPerformed

    private void rbEnfermoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermoSiActionPerformed
        txtTipoDeEnfermedad.setEnabled(true);
        txtTipoDeEnfermedad.setText("");
        txtTipoDeEnfermedad.selectAll();
        txtTipoDeEnfermedad.requestFocusInWindow();
    }//GEN-LAST:event_rbEnfermoSiActionPerformed

    private void rbAlergicoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergicoNoActionPerformed
        txtTipoDeAlergia.setEnabled(false);
        txtTipoDeAlergia.setText("Ninguna");
    }//GEN-LAST:event_rbAlergicoNoActionPerformed

    private void rbAlergicoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergicoSiActionPerformed
        txtTipoDeAlergia.setEnabled(true);
        txtTipoDeAlergia.setText("");
        txtTipoDeAlergia.selectAll();
        txtTipoDeAlergia.requestFocusInWindow();
    }//GEN-LAST:event_rbAlergicoSiActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void cmdCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCopiarActionPerformed
        int i;
        Paciente p;
        LinkedList<Paciente> paciente = Helper.traerDatos(rutaP);
        i = tblTablaPacientes.getSelectedRow();
        if(i>=0){
            p = paciente.get(i);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection data = new StringSelection(p.getIdentificacion());
            clipboard.setContents(data, data);
            Helper.mensaje(this, "Identificación del paciente copiada", 1);
        }else{
            Helper.mensaje(this, "Por favor antes seleccione al paciente que desea copiar su identificación", 3);
        }

    }//GEN-LAST:event_cmdCopiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* SetxtApellido look and feel */
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
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPaciente dialog = new AgregarPaciente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTipoSangre;
    private javax.swing.JButton cmdCopiar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup rbAlergico;
    private javax.swing.JRadioButton rbAlergicoNo;
    private javax.swing.JRadioButton rbAlergicoSi;
    private javax.swing.ButtonGroup rbEnfermedad;
    private javax.swing.JRadioButton rbEnfermoNo;
    private javax.swing.JRadioButton rbEnfermoSi;
    private javax.swing.JTable tblTablaPacientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDeAlergia;
    private javax.swing.JTextField txtTipoDeEnfermedad;
    // End of variables declaration//GEN-END:variables
}
