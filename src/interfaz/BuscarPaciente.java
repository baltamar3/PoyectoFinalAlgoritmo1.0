package interfaz;

import clases.Helper;
import clases.Paciente;
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
public class BuscarPaciente extends javax.swing.JDialog {

    String rutaP;
    String identificacionBuscar;
    ObjectOutputStream salida;
    Paciente p;

    public BuscarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rutaP = "src/datos/pacientes.txt";

        JTextField[] camposD = {txtNombre, txtIdentificacion, txtApellido, txtEdad, txtTelefono, txtTipoDeAlergia, txtTipoDeEnfermedad};
        JButton botonesH[] = {cmdBuscar};
        JButton botonesD[] = {cmdModificar, cmdGuardar, cmdEliminar};

        Helper.deshabilitarCampos(camposD);
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbAlergia = new javax.swing.ButtonGroup();
        rbEnfermedad = new javax.swing.ButtonGroup();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR PACIENTE");

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
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 120, 30));

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosBotones/return.png"))); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 120, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 900, 80));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 900, 82));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Identificación:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIdentificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel5.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Nombre:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel5.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Alergico:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        rbAlergia.add(rbAlergicoSi);
        rbAlergicoSi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAlergicoSi.setText("si");
        rbAlergicoSi.setEnabled(false);
        rbAlergicoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergicoSiActionPerformed(evt);
            }
        });
        jPanel5.add(rbAlergicoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 20));

        rbAlergia.add(rbAlergicoNo);
        rbAlergicoNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAlergicoNo.setText("No");
        rbAlergicoNo.setEnabled(false);
        rbAlergicoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlergicoNoActionPerformed(evt);
            }
        });
        jPanel5.add(rbAlergicoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 20));

        txtTipoDeAlergia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTipoDeAlergia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtTipoDeAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tipo de sangre:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 90, 20));

        cmbTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        cmbTipoSangre.setEnabled(false);
        jPanel5.add(cmbTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("¿Sufre alguna enfermedad?");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        rbEnfermedad.add(rbEnfermoSi);
        rbEnfermoSi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbEnfermoSi.setText("si");
        rbEnfermoSi.setEnabled(false);
        rbEnfermoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermoSiActionPerformed(evt);
            }
        });
        jPanel5.add(rbEnfermoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, 20));

        rbEnfermedad.add(rbEnfermoNo);
        rbEnfermoNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbEnfermoNo.setText("No");
        rbEnfermoNo.setEnabled(false);
        rbEnfermoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermoNoActionPerformed(evt);
            }
        });
        jPanel5.add(rbEnfermoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, 20));

        txtTipoDeEnfermedad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTipoDeEnfermedad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel5.add(txtTipoDeEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 220, -1));

        cmbSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Indeterminado" }));
        cmbSexo.setEnabled(false);
        jPanel5.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Sexo:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Edad:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEdad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel5.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 900, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medico-y-paciente1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed

        if (txtIdentificacionBuscar.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor, ingrese la identificacion del paciente que desea buscar", 1);
            txtIdentificacionBuscar.requestFocusInWindow();
        } else {
            identificacionBuscar = txtIdentificacionBuscar.getText().trim();
            if (Helper.buscarPacienteIdentificacion(identificacionBuscar, rutaP) == false) {
                Helper.mensaje(this, "Paciente Inexistente", 1);
                txtIdentificacionBuscar.requestFocusInWindow();
                txtIdentificacionBuscar.selectAll();
            } else if (Helper.buscarPacienteIdentificacion(identificacionBuscar, rutaP)) {
                p = Helper.traerPacienteIdentificacion(identificacionBuscar, rutaP);
                txtNombre.setText(p.getNombre());
                txtIdentificacion.setText(p.getIdentificacion());
                txtApellido.setText(p.getApellido());
                txtEdad.setText(p.getEdad());
                txtTelefono.setText(p.getTelefono());
                txtTipoDeEnfermedad.setText(p.getEnfermedad());
                txtTipoDeAlergia.setText(p.getAlergia());
                cmbSexo.setSelectedItem(p.getSexo());
                cmbTipoSangre.setSelectedItem(p.getTipoSangre());

                JButton botonesH[] = {cmdModificar, cmdEliminar, cmdCancelar};
                JButton botonesD[] = {cmdGuardar};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);

            }
        }


    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed

        if (Helper.buscarPacienteIdentificacion(identificacionBuscar, rutaP)) {
            p = Helper.traerPacienteIdentificacion(identificacionBuscar, rutaP);
            if (p.getAlergia().equalsIgnoreCase("Ninguna")) {
                rbAlergicoNo.setSelected(true);
                txtTipoDeAlergia.setText(p.getAlergia());
                txtTipoDeAlergia.setEnabled(false);
            } else if (!p.getAlergia().equalsIgnoreCase("Ninguna")) {
                rbAlergicoSi.setSelected(true);
                txtTipoDeAlergia.setText(p.getAlergia());
                txtTipoDeAlergia.setEnabled(true);
            }
            if (p.getEnfermedad().equalsIgnoreCase("Ninguna")) {
                rbEnfermoNo.setSelected(true);
                txtTipoDeEnfermedad.setText(p.getEnfermedad());
                txtTipoDeEnfermedad.setEnabled(false);
            } else if (!p.getEnfermedad().equalsIgnoreCase("Ninguna")) {
                rbEnfermoSi.setSelected(true);
                txtTipoDeEnfermedad.setText(p.getEnfermedad());
                txtTipoDeEnfermedad.setEnabled(true);
            }
        }

        cmbSexo.setEnabled(true);
        cmbTipoSangre.setEnabled(true);
        rbAlergicoSi.setEnabled(true);
        rbAlergicoNo.setEnabled(true);
        rbEnfermoSi.setEnabled(true);
        rbEnfermoNo.setEnabled(true);
        JTextField[] camposH = {txtNombre, txtApellido, txtEdad, txtTelefono};
        Helper.habilitarCampos(camposH);
        JButton botonesH[] = {cmdGuardar, cmdCancelar};
        JButton botonesD[] = {cmdModificar, cmdEliminar, cmdBuscar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdModificarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String identificacion, nombre, apellido, telefono, edad, sexo, alergia, tipoSangre, enfermedad;
        LinkedList<Paciente> pacientesMificados;

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
        } else {
            identificacion = txtIdentificacion.getText().trim();
            nombre = txtNombre.getText().trim();
            apellido = txtApellido.getText().trim();
            edad = txtEdad.getText().trim();
            telefono = txtTelefono.getText().trim();
            sexo = cmbSexo.getSelectedItem().toString();
            alergia = txtTipoDeAlergia.getText().trim();
            tipoSangre = cmbTipoSangre.getSelectedItem().toString();
            enfermedad = txtTipoDeEnfermedad.getText().trim();

            pacientesMificados = Helper.modificarPaciente(identificacion, rutaP, nombre, apellido, edad, telefono, sexo, alergia, tipoSangre, enfermedad);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(rutaP));
            } catch (IOException ex) {
                Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, pacientesMificados);
            Helper.mensaje(this, "Paciente Actualizado exitosamente", 1);

            txtIdentificacion.setText("");
            txtIdentificacionBuscar.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtTipoDeAlergia.setText("");
            txtTipoDeEnfermedad.setText("");
            cmbSexo.setSelectedIndex(0);
            cmbSexo.setEnabled(false);
            cmbTipoSangre.setSelectedIndex(0);
            cmbTipoSangre.setEnabled(false);
            rbAlergicoNo.setSelected(false);
            rbAlergicoSi.setSelected(false);
            rbEnfermoNo.setSelected(false);
            rbEnfermoSi.setSelected(false);
            rbAlergicoNo.setEnabled(false);
            rbEnfermoNo.setEnabled(false);
            rbAlergicoSi.setEnabled(false);
            rbEnfermoSi.setEnabled(false);

            JButton botonesH[] = {cmdBuscar};
            JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
            JTextField[] camposH = {txtNombre, txtApellido, txtEdad, txtTelefono, txtTipoDeAlergia, txtIdentificacion, txtTipoDeEnfermedad};
            Helper.deshabilitarCampos(camposH);

        }


    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int op, i;
        String identificacion;
        identificacion = txtIdentificacion.getText();
        LinkedList<Paciente> pacientes = Helper.traerDatos(rutaP);

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            i = Helper.traerIndexPacienteIdentificacion(identificacion, rutaP);
            pacientes.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(rutaP));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, pacientes);
            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtTipoDeAlergia.setText("");
            txtTipoDeEnfermedad.setText("");
            cmbSexo.setSelectedIndex(0);
            cmbTipoSangre.setSelectedIndex(0);
            cmbSexo.setEnabled(false);
            cmbTipoSangre.setEnabled(false);

            txtIdentificacionBuscar.setText("");
            txtIdentificacionBuscar.requestFocusInWindow();

            Helper.mensaje(this, "Paciente eliminado exitosamente", 1);

            JButton botonesH[] = {cmdBuscar};
            JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtIdentificacion.setText("");
        txtIdentificacionBuscar.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtTipoDeAlergia.setText("");
        txtTipoDeEnfermedad.setText("");
        cmbSexo.setSelectedIndex(0);
        cmbTipoSangre.setSelectedIndex(0);
        cmbSexo.setEnabled(false);
        cmbTipoSangre.setEnabled(false);
        rbAlergicoNo.setSelected(false);
        rbAlergicoSi.setSelected(false);
        rbEnfermoNo.setSelected(false);
        rbEnfermoSi.setSelected(false);
        rbAlergicoNo.setEnabled(false);
        rbEnfermoNo.setEnabled(false);
        rbAlergicoSi.setEnabled(false);
        rbEnfermoSi.setEnabled(false);

        JButton botonesH[] = {cmdBuscar};
        JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar};
        JTextField[] camposD = {txtNombre, txtApellido, txtEdad, txtTelefono, txtTipoDeAlergia, txtIdentificacion, txtTipoDeEnfermedad};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        Helper.deshabilitarCampos(camposD);


    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void rbAlergicoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergicoSiActionPerformed
        if (Helper.buscarPacienteIdentificacion(identificacionBuscar, rutaP)) {
            p = Helper.traerPacienteIdentificacion(identificacionBuscar, rutaP);
            if (!p.getAlergia().equalsIgnoreCase("Ninguna")) {
                rbAlergicoSi.setSelected(true);
                txtTipoDeAlergia.setText(p.getAlergia());
                txtTipoDeAlergia.setEnabled(true);
            } else {
                txtTipoDeAlergia.setEnabled(true);
                txtTipoDeAlergia.setText("");
                txtTipoDeAlergia.selectAll();
                txtTipoDeAlergia.requestFocusInWindow();
            }

        }
    }//GEN-LAST:event_rbAlergicoSiActionPerformed

    private void rbAlergicoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlergicoNoActionPerformed
        txtTipoDeAlergia.setEnabled(false);
        txtTipoDeAlergia.setText("Ninguna");

    }//GEN-LAST:event_rbAlergicoNoActionPerformed

    private void rbEnfermoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermoSiActionPerformed
        if (Helper.buscarPacienteIdentificacion(identificacionBuscar, rutaP)) {
            p = Helper.traerPacienteIdentificacion(identificacionBuscar, rutaP);
            if (!p.getEnfermedad().equalsIgnoreCase("Ninguna")) {
                rbEnfermoSi.setSelected(true);
                txtTipoDeEnfermedad.setText(p.getEnfermedad());
                txtTipoDeEnfermedad.setEnabled(true);
            } else {
                txtTipoDeEnfermedad.setEnabled(true);
                txtTipoDeEnfermedad.setText("");
                txtTipoDeEnfermedad.selectAll();
                txtTipoDeEnfermedad.requestFocusInWindow();
            }

        }


    }//GEN-LAST:event_rbEnfermoSiActionPerformed

    private void rbEnfermoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermoNoActionPerformed
        txtTipoDeEnfermedad.setEnabled(false);
        txtTipoDeEnfermedad.setText("Ninguna");
    }//GEN-LAST:event_rbEnfermoNoActionPerformed

    private void txtIdentificacionBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionBuscarKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionBuscarKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

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
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarPaciente dialog = new BuscarPaciente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.ButtonGroup rbAlergia;
    private javax.swing.JRadioButton rbAlergicoNo;
    private javax.swing.JRadioButton rbAlergicoSi;
    private javax.swing.ButtonGroup rbEnfermedad;
    private javax.swing.JRadioButton rbEnfermoNo;
    private javax.swing.JRadioButton rbEnfermoSi;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtIdentificacionBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDeAlergia;
    private javax.swing.JTextField txtTipoDeEnfermedad;
    // End of variables declaration//GEN-END:variables
}
