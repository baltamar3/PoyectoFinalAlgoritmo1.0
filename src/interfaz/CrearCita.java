package interfaz;

import clases.Cita;
import clases.Doctor;
import clases.Helper;
import clases.Paciente;
import clases.Persona;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author baltamar3
 */
public class CrearCita extends javax.swing.JDialog {

    String rutaP;
    String rutaD;
    String rutaC;
    Paciente p;
    int aux = 0, aux2 = 0;
    String identificacionP;
    LinkedList<Cita> citas;
    ObjectOutputStream salida;

    public CrearCita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rutaP = "src/datos/pacientes.txt";
        rutaD = "src/datos/doctores.txt";
        rutaC = "src/datos/citas.txt";

        JButton botonesH[] = {cmdBuscarPaciente};
        JButton botonesD[] = {cmdEliminar, cmdGuardar, cmdBuscarCita, cmdCancelar, cmdModificar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        try {
            citas = Helper.traerDatos(rutaC);
            salida = new ObjectOutputStream(new FileOutputStream(rutaC));
        } catch (IOException ex) {
            Logger.getLogger(CrearCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        Helper.volcado(salida, citas);
        Helper.llenarTablaCitas(tblCitas, rutaC);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        cmbDoctor = new javax.swing.JComboBox<>();
        lblResultadosBsuquedad = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTipoDeAlergia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTipoDeEnfermedad = new javax.swing.JTextField();
        txtTipoSangre = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        cmdBuscarCita = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdModificar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        cmdBuscarPaciente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Especialidad:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor o Especialista");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sintomas:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        cmbEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Infectologia", "Neumologia", "Nutriologia", "Oftalmologia", "Pediatria", "Psiquiatria", "Reumatologia" }));
        cmbEspecialidad.setEnabled(false);
        cmbEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEspecialidadItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, -1));

        txtSintomas.setColumns(20);
        txtSintomas.setRows(5);
        txtSintomas.setEnabled(false);
        jScrollPane1.setViewportView(txtSintomas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, 130));

        cmbDoctor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbDoctor.setEnabled(false);
        jPanel2.add(cmbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 200, -1));

        lblResultadosBsuquedad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultadosBsuquedad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblResultadosBsuquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 24, 320, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 360, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        txtNombre.setEditable(false);
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellido:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        txtApellido.setEditable(false);
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Alergia:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtTipoDeAlergia.setEditable(false);
        jPanel3.add(txtTipoDeAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tipo de sangre:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 10));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Efermedad:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtTipoDeEnfermedad.setEditable(false);
        jPanel3.add(txtTipoDeEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, -1));

        txtTipoSangre.setEditable(false);
        jPanel3.add(txtTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 190));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBuscarCita.setBackground(new java.awt.Color(0, 102, 102));
        cmdBuscarCita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdBuscarCita.setForeground(new java.awt.Color(255, 255, 255));
        cmdBuscarCita.setText("Buscar Cita");
        cmdBuscarCita.setEnabled(false);
        cmdBuscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarCitaActionPerformed(evt);
            }
        });
        jPanel5.add(cmdBuscarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        cmdCancelar.setBackground(new java.awt.Color(0, 102, 102));
        cmdCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdCancelar.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        cmdEliminar.setBackground(new java.awt.Color(0, 102, 102));
        cmdEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdEliminar.setForeground(new java.awt.Color(255, 255, 255));
        cmdEliminar.setText("Eliminar");
        cmdEliminar.setEnabled(false);
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, -1));

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
        jPanel5.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));

        cmdModificar.setBackground(new java.awt.Color(0, 102, 102));
        cmdModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdModificar.setForeground(new java.awt.Color(255, 255, 255));
        cmdModificar.setText("Modificar");
        cmdModificar.setEnabled(false);
        cmdModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdModificarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 200, 270));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Identificación:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));
        jPanel4.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, -1));

        cmdBuscarPaciente.setBackground(new java.awt.Color(0, 102, 102));
        cmdBuscarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdBuscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        cmdBuscarPaciente.setText("Buscar");
        cmdBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gota.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 230, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conve2 - copia.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 960, 330));

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Paciente", "Epecialista", "Especialidad", "Motivo", "consultorio"
            }
        ));
        tblCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCitas);
        if (tblCitas.getColumnModel().getColumnCount() > 0) {
            tblCitas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCitas.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 890, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarPacienteActionPerformed
        identificacionP = txtIdentificacion.getText();

        if (txtIdentificacion.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor, ingrese la identificacion del paciente al cual desea crear cita", 3);
            txtIdentificacion.requestFocusInWindow();
        } else if (Helper.buscarPacienteIdentificacion(identificacionP, rutaP)) {
            p = Helper.traerPacienteIdentificacion(identificacionP, rutaP);
            txtIdentificacion.setText(p.getIdentificacion());
            txtNombre.setText(p.getNombre());
            txtApellido.setText(p.getApellido());
            txtTipoDeAlergia.setText(p.getAlergia());
            txtTipoSangre.setText(p.getTipoSangre());
            txtTipoDeEnfermedad.setText(p.getEnfermedad());
            JButton botonesD[] = {cmdGuardar, cmdCancelar, cmdEliminar};
            JButton botonesH[] = {cmdBuscarCita};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        } else {
            Helper.mensaje(this, "Paciente inexistente, por favor verificar el numero de identificación", 1);
            txtIdentificacion.requestFocusInWindow();
            txtIdentificacion.selectAll();
        }

    }//GEN-LAST:event_cmdBuscarPacienteActionPerformed

    private void cmbEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEspecialidadItemStateChanged
        String especialidad;
        especialidad = cmbEspecialidad.getSelectedItem().toString();
        Helper.llenarComboBoxDoctores(especialidad, cmbDoctor, rutaD);

    }//GEN-LAST:event_cmbEspecialidadItemStateChanged

    private void cmdBuscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarCitaActionPerformed
        String identifiacion, auxDoctor;
        Doctor d;
        Cita c;

        identifiacion = txtIdentificacion.getText();

        if (Helper.buscarCitaIdentificacion(identifiacion, rutaC)) {
            c = Helper.traerCitaIdentificacion(identifiacion, rutaC);
            Helper.mensaje(this, "Cita encontrada", 1);
            lblResultadosBsuquedad.setText("Cita Encontrada");
            txtNombre.setText(c.getP().getNombre());
            txtApellido.setText(c.getP().getApellido());
            txtTipoDeAlergia.setText(c.getP().getAlergia());
            txtTipoDeEnfermedad.setText(c.getP().getEnfermedad());
            txtTipoSangre.setText(c.getP().getTipoSangre());
            txtSintomas.setText(c.getSintomas());
            d = c.getD();
            auxDoctor = d.getIdentificacion() + " - " + d.getNombre() + " " + d.getApellido();
            cmbDoctor.setSelectedItem(auxDoctor);
            cmbEspecialidad.setSelectedItem(c.getEspecialidad());
            aux = 1;

            JButton botonesH[] = {cmdCancelar, cmdEliminar, cmdModificar};
            JButton botonesD[] = {cmdBuscarCita};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        } else {
            txtIdentificacion.requestFocusInWindow();
            Helper.mensaje(this, "El paciente ingresado No tiene cita", 3);
            aux = 0;

            cmbEspecialidad.setEnabled(true);
            cmbDoctor.setEnabled(true);
            txtSintomas.setEnabled(true);
            JButton botonesH[] = {cmdGuardar, cmdCancelar};
            JButton botonesD[] = {cmdBuscarCita};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        }

    }//GEN-LAST:event_cmdBuscarCitaActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtSintomas.setText("");
        txtTipoDeAlergia.setText("");
        txtTipoDeEnfermedad.setText("");
        txtTipoSangre.setText("");
        cmbEspecialidad.setSelectedIndex(0);
        cmbDoctor.setSelectedIndex(0);
        cmbEspecialidad.setEnabled(false);
        cmbDoctor.setEnabled(false);

        txtIdentificacion.requestFocusInWindow();
        JButton botonesH[] = {cmdBuscarPaciente};
        JButton botonesD[] = {cmdEliminar, cmdGuardar, cmdBuscarCita};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String identificacion, especialidad, sintomas, auxDoctor;
        int indice;
        Doctor d;
        Paciente p;

        if (cmbDoctor.getSelectedIndex() == -1) {
            Helper.mensaje(this, "Seleccione un doctor", 3);
        } else {
            especialidad = cmbEspecialidad.getSelectedItem().toString();
            sintomas = txtSintomas.getText();
            auxDoctor = cmbDoctor.getSelectedItem().toString();
            indice = auxDoctor.indexOf("-") - 1;
            identificacion = auxDoctor.substring(0, indice);
            d = Helper.traerDoctorIdentificacion(identificacion, rutaD);

            p = Helper.traerPacienteIdentificacion(identificacionP, rutaP);
            LinkedList<Cita> citasModificadas;

            if (aux2 == 1) {
                especialidad = cmbEspecialidad.getSelectedItem().toString();
                sintomas = txtSintomas.getText();
                auxDoctor = cmbDoctor.getSelectedItem().toString();
                indice = auxDoctor.indexOf("-") - 1;
                identificacion = auxDoctor.substring(0, indice);
                d = Helper.traerDoctorIdentificacion(identificacion, rutaD);

                p = Helper.traerPacienteIdentificacion(identificacionP, rutaP);
                LinkedList<Cita> citasModificada;
            }

            try {
                if (aux == 0) {

                    Cita c = new Cita(p, d, especialidad, sintomas);
                    c.guardar(salida);
                    Helper.mensaje(this, "Cita Creada exitosamente", 1);
                } else if (aux == 1) {
                    citasModificadas = Helper.modificarCita(identificacionP, rutaC, especialidad, d, sintomas);
                    salida = new ObjectOutputStream(new FileOutputStream(rutaC));
                    Helper.volcado(salida, citasModificadas);
                    aux = 0;
                    aux2 = 0;
                    Helper.mensaje(this, "Cita Actualizada Correctamente", 1);
                } else if (aux2 == 1) {
                    citasModificadas = Helper.modificarCita(identificacionP, rutaC, especialidad, d, sintomas);
                    salida = new ObjectOutputStream(new FileOutputStream(rutaC));
                    Helper.volcado(salida, citasModificadas);
                    aux2 = 0;
                    aux = 0;
                    Helper.mensaje(this, "Cita Actualizada Correctamente", 1);
                }
            } catch (IOException ex) {
                Logger.getLogger(CrearCita.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException e) {
                e.getMessage();
            }

            Helper.llenarTablaCitas(tblCitas, rutaC);

            txtIdentificacion.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtSintomas.setText("");
            txtTipoDeAlergia.setText("");
            txtTipoDeEnfermedad.setText("");
            txtTipoSangre.setText("");
            cmbEspecialidad.setSelectedIndex(0);
            cmbDoctor.setSelectedIndex(0);
            cmbEspecialidad.setEnabled(false);
            cmbDoctor.setEnabled(false);
            txtSintomas.setEnabled(false);

            txtIdentificacion.requestFocusInWindow();
            JButton botonesH[] = {cmdBuscarPaciente};
            JButton botonesD[] = {cmdEliminar, cmdGuardar, cmdCancelar, cmdModificar, cmdBuscarCita};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
        cmbEspecialidad.setEnabled(true);
        cmbDoctor.setEnabled(true);
        txtSintomas.setEnabled(true);
        aux = 1;
        aux2 = 1;

        JButton botonesH[] = {cmdGuardar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar, cmdModificar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdModificarActionPerformed

    private void tblCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCitasMouseClicked
        int i;
        String auxDoctor;
        Cita c;
        Doctor d;
        LinkedList<Cita> citas = Helper.traerDatos(rutaC);
        i = tblCitas.getSelectedRow();

        c = citas.get(i);
        d = c.getD();
        auxDoctor = d.getIdentificacion() + " - " + d.getNombre() + " " + d.getApellido();

        txtIdentificacion.setText(c.getP().getIdentificacion());
        txtNombre.setText(c.getP().getNombre());
        txtApellido.setText(c.getP().getApellido());
        txtTipoDeAlergia.setText(c.getP().getAlergia());
        txtTipoDeEnfermedad.setText(c.getP().getEnfermedad());
        txtTipoSangre.setText(c.getP().getTipoSangre());
        txtSintomas.setText(c.getSintomas());

        cmbEspecialidad.setSelectedItem(c.getEspecialidad());
        cmbDoctor.setSelectedItem(auxDoctor);

        aux2 = 1;
        JButton botonesH[] = {cmdEliminar, cmdCancelar};
        JButton botonesD[] = {cmdBuscarPaciente, cmdModificar, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_tblCitasMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
        LinkedList<Cita> citas = Helper.traerDatos(rutaC);
        if (aux2 == 1) {
            op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta cita?", "Eliminar", JOptionPane.YES_NO_OPTION);

            if (op == JOptionPane.YES_OPTION) {
                i = tblCitas.getSelectedRow();
                citas.remove(i);
                try {
                    salida = new ObjectOutputStream(new FileOutputStream(rutaC));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CrearCita.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(CrearCita.class.getName()).log(Level.SEVERE, null, ex);
                }
                Helper.volcado(salida, citas);
                Helper.llenarTablaCitas(tblCitas, rutaC);

                JButton botonesH[] = {cmdBuscarPaciente};
                JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar, cmdBuscarCita};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);

                txtIdentificacion.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtSintomas.setText("");
                txtTipoDeAlergia.setText("");
                txtTipoDeEnfermedad.setText("");
                txtTipoSangre.setText("");
                cmbEspecialidad.setSelectedIndex(0);
                cmbDoctor.setSelectedIndex(0);
                cmbEspecialidad.setEnabled(false);
                cmbDoctor.setEnabled(false);
                txtIdentificacion.requestFocusInWindow();
            }
        } else {

            op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                i = Helper.traerIndexCitaIdentificacion(identificacionP, rutaC);
                citas.remove(i);
                try {
                    salida = new ObjectOutputStream(new FileOutputStream(rutaC));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
                Helper.volcado(salida, citas);
                Helper.llenarTablaCitas(tblCitas, rutaC);
                Helper.mensaje(this, "Paciente eliminado exitosamente", 1);

                JButton botonesH[] = {cmdBuscarPaciente};
                JButton botonesD[] = {cmdModificar, cmdEliminar, cmdGuardar, cmdCancelar, cmdBuscarCita};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);

                txtIdentificacion.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtSintomas.setText("");
                txtTipoDeAlergia.setText("");
                txtTipoDeEnfermedad.setText("");
                txtTipoSangre.setText("");
                cmbEspecialidad.setSelectedIndex(0);
                cmbDoctor.setSelectedIndex(0);
                cmbEspecialidad.setEnabled(false);
                cmbDoctor.setEnabled(false);
                txtIdentificacion.requestFocusInWindow();

            } else {
                JButton botonesH[] = {cmdCancelar, cmdEliminar};
                JButton botonesD[] = {cmdModificar, cmdGuardar, cmdBuscarCita};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
            }
        }


    }//GEN-LAST:event_cmdEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearCita dialog = new CrearCita(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JButton cmdBuscarCita;
    private javax.swing.JButton cmdBuscarPaciente;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblResultadosBsuquedad;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSintomas;
    private javax.swing.JTextField txtTipoDeAlergia;
    private javax.swing.JTextField txtTipoDeEnfermedad;
    private javax.swing.JTextField txtTipoSangre;
    // End of variables declaration//GEN-END:variables
}
