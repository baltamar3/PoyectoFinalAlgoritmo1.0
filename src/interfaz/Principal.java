package interfaz;

import clases.Helper;
import clases.Paciente;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author baltamar3
 */
public class Principal extends javax.swing.JFrame {

    String rutaC;

    public Principal() {

        initComponents();
        rutaC = "src/datos/pacientes.txt";

        ImageIcon img = new ImageIcon("src/imagenes/gota.png");
        setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIcocno = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPacientes = new javax.swing.JMenu();
        mnRegistrarPaciente = new javax.swing.JMenuItem();
        mnBuscarPaciente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnRegistrarDoctor = new javax.swing.JMenuItem();
        mnBuscarDoctor = new javax.swing.JMenuItem();
        mnCitas = new javax.swing.JMenu();
        mnCrearCita = new javax.swing.JMenuItem();
        mnReportes = new javax.swing.JMenu();
        mnListar = new javax.swing.JMenu();
        mnListarTodos = new javax.swing.JMenuItem();
        mnListarAlergicos = new javax.swing.JMenuItem();
        mnListarConEnfermedad = new javax.swing.JMenuItem();
        mnListarTipoSangre = new javax.swing.JMenuItem();
        mnCantidades = new javax.swing.JMenu();
        mnCantidadPacientesIngresados = new javax.swing.JMenuItem();
        mnCantidaPacientesAlergicos = new javax.swing.JMenuItem();
        mnCantidaPacientesEnfermos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALUD-QUILLA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.jpg"))); // NOI18N
        jPanel1.add(lblIcocno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        jMenuBar1.setBorder(null);
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnPacientes.setBackground(new java.awt.Color(255, 255, 255));
        mnPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnPacientes.setText("Pacientes");
        mnPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnPacientes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        mnRegistrarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnRegistrarPaciente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnRegistrarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/1478292990_user-group-new.png"))); // NOI18N
        mnRegistrarPaciente.setText("Registrar Paciente");
        mnRegistrarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistrarPacienteActionPerformed(evt);
            }
        });
        mnPacientes.add(mnRegistrarPaciente);

        mnBuscarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnBuscarPaciente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/1478293239_Search-Male-User.png"))); // NOI18N
        mnBuscarPaciente.setText(" Buscar Paciente");
        mnBuscarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarPacienteActionPerformed(evt);
            }
        });
        mnPacientes.add(mnBuscarPaciente);

        jMenuBar1.add(mnPacientes);

        jMenu1.setText("Personal");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        mnRegistrarDoctor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnRegistrarDoctor.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnRegistrarDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/doctores4.png"))); // NOI18N
        mnRegistrarDoctor.setText("Registrar Doctor");
        mnRegistrarDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnRegistrarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistrarDoctorActionPerformed(evt);
            }
        });
        jMenu1.add(mnRegistrarDoctor);

        mnBuscarDoctor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnBuscarDoctor.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnBuscarDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/1479242976_023.png"))); // NOI18N
        mnBuscarDoctor.setText("Buscar Doctor");
        mnBuscarDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnBuscarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarDoctorActionPerformed(evt);
            }
        });
        jMenu1.add(mnBuscarDoctor);

        jMenuBar1.add(jMenu1);

        mnCitas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnCitas.setText("Citas");
        mnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnCitas.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        mnCrearCita.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnCrearCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/1478295314_appointment-new.png"))); // NOI18N
        mnCrearCita.setText("Crear cita");
        mnCrearCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnCrearCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCrearCitaActionPerformed(evt);
            }
        });
        mnCitas.add(mnCrearCita);

        jMenuBar1.add(mnCitas);

        mnReportes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mnReportes.setText("Reportes");
        mnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnReportes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        mnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/1478294413_reports.png"))); // NOI18N
        mnListar.setText("Listados");
        mnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnListar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        mnListarTodos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnListarTodos.setText("Listar todos los pacientes");
        mnListarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarTodosActionPerformed(evt);
            }
        });
        mnListar.add(mnListarTodos);

        mnListarAlergicos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnListarAlergicos.setText("Listar pacientes Alergicos");
        mnListarAlergicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnListarAlergicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarAlergicosActionPerformed(evt);
            }
        });
        mnListar.add(mnListarAlergicos);

        mnListarConEnfermedad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnListarConEnfermedad.setText("Listar pacientes con enfermedad");
        mnListarConEnfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnListarConEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarConEnfermedadActionPerformed(evt);
            }
        });
        mnListar.add(mnListarConEnfermedad);

        mnListarTipoSangre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnListarTipoSangre.setText("Listar por tipo de sangre");
        mnListarTipoSangre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnListarTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarTipoSangreActionPerformed(evt);
            }
        });
        mnListar.add(mnListarTipoSangre);

        mnReportes.add(mnListar);

        mnCantidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMenu/1478294386_order-history.png"))); // NOI18N
        mnCantidades.setText("Cantidades");
        mnCantidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnCantidades.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        mnCantidadPacientesIngresados.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnCantidadPacientesIngresados.setText("Cantidad de pacientes ingresados");
        mnCantidadPacientesIngresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidadPacientesIngresadosActionPerformed(evt);
            }
        });
        mnCantidades.add(mnCantidadPacientesIngresados);

        mnCantidaPacientesAlergicos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnCantidaPacientesAlergicos.setText("Cantidad de pacientes alergicos");
        mnCantidaPacientesAlergicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidaPacientesAlergicosActionPerformed(evt);
            }
        });
        mnCantidades.add(mnCantidaPacientesAlergicos);

        mnCantidaPacientesEnfermos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnCantidaPacientesEnfermos.setText("Cantidad de pacientes con enfermedad");
        mnCantidaPacientesEnfermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidaPacientesEnfermosActionPerformed(evt);
            }
        });
        mnCantidades.add(mnCantidaPacientesEnfermos);

        mnReportes.add(mnCantidades);

        jMenuBar1.add(mnReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistrarPacienteActionPerformed
        AgregarPaciente a = new AgregarPaciente(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnRegistrarPacienteActionPerformed

    private void mnCrearCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCrearCitaActionPerformed
        CrearCita a = new CrearCita(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnCrearCitaActionPerformed

    private void mnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarPacienteActionPerformed
        BuscarPaciente a = new BuscarPaciente(this, true);
        a.setVisible(true);    }//GEN-LAST:event_mnBuscarPacienteActionPerformed

    private void mnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarTodosActionPerformed
        ListaPacientes a = new ListaPacientes(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnListarTodosActionPerformed

    private void mnListarAlergicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarAlergicosActionPerformed
        ListaPacientesAlergicos a = new ListaPacientesAlergicos(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnListarAlergicosActionPerformed

    private void mnListarConEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarConEnfermedadActionPerformed
        ListaPacientesConEnfermedad a = new ListaPacientesConEnfermedad(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnListarConEnfermedadActionPerformed

    private void mnListarTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarTipoSangreActionPerformed
        ListaPorTipoSangre a = new ListaPorTipoSangre(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnListarTipoSangreActionPerformed

    private void mnCantidadPacientesIngresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidadPacientesIngresadosActionPerformed
        int cont;
        cont = Helper.traerDatos(rutaC).size();
        Helper.mensaje(this, "La cantidad de pacientes ingresados es: " + cont, "REPORTE: Cantidad de pacientes ingresados");
    }//GEN-LAST:event_mnCantidadPacientesIngresadosActionPerformed

    private void mnCantidaPacientesAlergicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidaPacientesAlergicosActionPerformed
        int cont;
        LinkedList<Paciente> pacientesAlergicos = new LinkedList();
        pacientesAlergicos = Helper.listadoAlergicos(rutaC);
        cont = pacientesAlergicos.size();
        Helper.mensaje(this, "La cantidad de pacientes alergicos es: " + cont, "REPORTE: Cantidad de pacientes alergicos");
    }//GEN-LAST:event_mnCantidaPacientesAlergicosActionPerformed

    private void mnCantidaPacientesEnfermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidaPacientesEnfermosActionPerformed
        int cont;
        LinkedList<Paciente> pacientesenfermos = new LinkedList();
        pacientesenfermos = Helper.listadoPacientesEnfermos(rutaC);
        cont = pacientesenfermos.size();
        Helper.mensaje(this, "La cantidad de pacientes con alguna enfermedad es: " + cont, "REPORTE: Cantidad de pacientes enfermos");    }//GEN-LAST:event_mnCantidaPacientesEnfermosActionPerformed

    private void mnRegistrarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistrarDoctorActionPerformed
        AgregarDoctor a = new AgregarDoctor(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnRegistrarDoctorActionPerformed

    private void mnBuscarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarDoctorActionPerformed
        BuscarDoctor a = new BuscarDoctor(this, true);
        a.setVisible(true);

    }//GEN-LAST:event_mnBuscarDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIcocno;
    private javax.swing.JMenuItem mnBuscarDoctor;
    private javax.swing.JMenuItem mnBuscarPaciente;
    private javax.swing.JMenuItem mnCantidaPacientesAlergicos;
    private javax.swing.JMenuItem mnCantidaPacientesEnfermos;
    private javax.swing.JMenuItem mnCantidadPacientesIngresados;
    private javax.swing.JMenu mnCantidades;
    private javax.swing.JMenu mnCitas;
    private javax.swing.JMenuItem mnCrearCita;
    private javax.swing.JMenu mnListar;
    private javax.swing.JMenuItem mnListarAlergicos;
    private javax.swing.JMenuItem mnListarConEnfermedad;
    private javax.swing.JMenuItem mnListarTipoSangre;
    private javax.swing.JMenuItem mnListarTodos;
    private javax.swing.JMenu mnPacientes;
    private javax.swing.JMenuItem mnRegistrarDoctor;
    private javax.swing.JMenuItem mnRegistrarPaciente;
    private javax.swing.JMenu mnReportes;
    // End of variables declaration//GEN-END:variables
}
