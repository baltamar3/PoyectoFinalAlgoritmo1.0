/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rmorales1
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void mensaje(Component ventana, String mensaje, String titulo) {
        Icon icono1 = new ImageIcon("src/iconosMenu/lista.png");
        JOptionPane.showMessageDialog(ventana, mensaje, titulo, 0, icono1);

    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void habilitarCampos(JTextField[] campos) {
        for (int i = 0; i < campos.length; i++) {
            campos[i].setEnabled(true);

        }
    }

    public static void deshabilitarCampos(JTextField[] campos) {
        for (int i = 0; i < campos.length; i++) {
            campos[i].setEnabled(false);

        }
    }

    public static void llenarTablaPacientes(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        LinkedList<Paciente> pacientes = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = pacientes.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(pacientes.get(i).getIdentificacion(), i, 1);
            tabla.setValueAt(pacientes.get(i).getNombre(), i, 2);
            tabla.setValueAt(pacientes.get(i).getApellido(), i, 3);
            tabla.setValueAt(pacientes.get(i).getEdad(), i, 4);
            tabla.setValueAt(pacientes.get(i).getTelefono(), i, 5);
            tabla.setValueAt(pacientes.get(i).getSexo(), i, 6);
            tabla.setValueAt(pacientes.get(i).getAlergia(), i, 7);
            tabla.setValueAt(pacientes.get(i).getTipoSangre(), i, 8);
            tabla.setValueAt(pacientes.get(i).getEnfermedad(), i, 9);
        }
    }

    public static void llenarTablaPacientes(JTable tabla, LinkedList<Paciente> pacientes) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = pacientes.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(pacientes.get(i).getIdentificacion(), i, 1);
            tabla.setValueAt(pacientes.get(i).getNombre(), i, 2);
            tabla.setValueAt(pacientes.get(i).getApellido(), i, 3);
            tabla.setValueAt(pacientes.get(i).getEdad(), i, 4);
            tabla.setValueAt(pacientes.get(i).getTelefono(), i, 5);
            tabla.setValueAt(pacientes.get(i).getSexo(), i, 6);
            tabla.setValueAt(pacientes.get(i).getAlergia(), i, 7);
            tabla.setValueAt(pacientes.get(i).getTipoSangre(), i, 8);
            tabla.setValueAt(pacientes.get(i).getEnfermedad(), i, 9);
        }
    }

    public static void llenarTablaPacientes(JTable tabla, Paciente p) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = 1;
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(p.getIdentificacion(), i, 1);
            tabla.setValueAt(p.getNombre(), i, 2);
            tabla.setValueAt(p.getApellido(), i, 3);
            tabla.setValueAt(p.getEdad(), i, 4);
            tabla.setValueAt(p.getTelefono(), i, 5);
            tabla.setValueAt(p.getSexo(), i, 6);
            tabla.setValueAt(p.getAlergia(), i, 7);
            tabla.setValueAt(p.getTipoSangre(), i, 8);
            tabla.setValueAt(p.getEnfermedad(), i, 9);
        }
    }

    public static void llenarTablaDoctores(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        LinkedList<Doctor> doctores = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = doctores.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(doctores.get(i).getIdentificacion(), i, 1);
            tabla.setValueAt(doctores.get(i).getNombre(), i, 2);
            tabla.setValueAt(doctores.get(i).getApellido(), i, 3);
            tabla.setValueAt(doctores.get(i).getEdad(), i, 4);
            tabla.setValueAt(doctores.get(i).getTelefono(), i, 5);
            tabla.setValueAt(doctores.get(i).getSexo(), i, 6);
            tabla.setValueAt(doctores.get(i).getEspecialidad(), i, 7);
            tabla.setValueAt(doctores.get(i).getConsultorio(), i, 8);

        }
    }

    public static void llenarTablaCitas(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        LinkedList<Cita> citas = traerDatos(ruta);
        limpiadoTabla(tabla);
        nf = citas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(citas.get(i).getP().getNombre() + " " + citas.get(i).getP().getApellido(), i, 1);
            tabla.setValueAt(citas.get(i).getD().getNombre() + " " + citas.get(i).getD().getApellido(), i, 2);
            tabla.setValueAt(citas.get(i).getEspecialidad(), i, 3);
            tabla.setValueAt(citas.get(i).getSintomas(), i, 4);
            tabla.setValueAt(citas.get(i).getD().getConsultorio(), i, 5);

        }
    }

    public static void llenarTablaCitas(JTable tabla, Cita c) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = 1;
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(c.getP().getNombre() + " " + c.getP().getApellido(), i, 1);
            tabla.setValueAt(c.getD().getNombre() + " " + c.getD().getApellido(), i, 2);
            tabla.setValueAt(c.getEspecialidad(), i, 3);
            tabla.setValueAt(c.getSintomas(), i, 4);
            tabla.setValueAt(c.getD().getConsultorio(), i, 5);

        }
    }

    public static void llenarCombosBuscarCita(Cita c, JComboBox cmbEspecialidad, JComboBox cmbDoctor) {

        cmbEspecialidad.setSelectedItem(c.getEspecialidad());
        cmbDoctor.setSelectedItem(c.getD().getIdentificacion() + " - " + c.getD().getNombre() + " " + c.getD().getApellido());

    }

    public static LinkedList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        LinkedList personas = new LinkedList();
        Object p;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                personas.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return personas;
    }

    public static void volcado(ObjectOutputStream salida, LinkedList personas) {
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    public static LinkedList listadoAlergicos(String ruta) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);
        LinkedList<Paciente> pacientesAlergicos = new LinkedList();

        for (int i = 0; i < pacientes.size(); i++) {
            if (!pacientes.get(i).getAlergia().equalsIgnoreCase("Ninguna")) {
                pacientesAlergicos.add(pacientes.get(i));
            }
        }
        return pacientesAlergicos;
    }

    public static LinkedList listadoPacientesEnfermos(String ruta) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);
        LinkedList<Paciente> pacientesEnfermos = new LinkedList();

        for (int i = 0; i < pacientes.size(); i++) {
            if (!pacientes.get(i).getEnfermedad().equalsIgnoreCase("Ninguna")) {
                pacientesEnfermos.add(pacientes.get(i));
            }
        }
        return pacientesEnfermos;
    }

    public static void listadoPorTipoSangre(JTable tabla, String ruta, String tipoSangre) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);
        LinkedList<Paciente> tipoDeSangre = new LinkedList();

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getTipoSangre().equalsIgnoreCase(tipoSangre)) {
                tipoDeSangre.add(pacientes.get(i));
            }
        }
        llenarTablaPacientes(tabla, tipoDeSangre);
    }

    public static boolean buscarPacienteIdentificacion(String identificacion, String ruta) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getIdentificacion().equalsIgnoreCase(identificacion)) {
                return true;
            }
        }
        return false;
    }

    public static Paciente traerPacienteIdentificacion(String identificacion, String ruta) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getIdentificacion().equals(identificacion)) {
                return pacientes.get(i);
            }

        }
        return null;
    }

    public static int traerIndexPacienteIdentificacion(String identificacion, String ruta) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);
        int aux = 0;
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getIdentificacion().equals(identificacion)) {
                aux = i;

            }

        }
        return aux;
    }

    public static LinkedList<Paciente> modificarPaciente(String identificacion, String ruta, String nombre, String apellido, String edad, String telefono, String sexo, String alergia, String tipoSangre, String enfermedad) {
        LinkedList<Paciente> pacientes = traerDatos(ruta);

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getIdentificacion().equals(identificacion)) {
                pacientes.get(i).setNombre(nombre);
                pacientes.get(i).setApellido(apellido);
                pacientes.get(i).setEdad(edad);
                pacientes.get(i).setTelefono(telefono);
                pacientes.get(i).setSexo(sexo);
                pacientes.get(i).setAlergia(alergia);
                pacientes.get(i).setTipoSangre(tipoSangre);
                pacientes.get(i).setEnfermedad(enfermedad);

                return pacientes;
            }
        }
        return null;
    }

    public static boolean buscarDoctorIdentificacion(String identificacion, String ruta) {
        LinkedList<Doctor> doctores = traerDatos(ruta);

        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getIdentificacion().equalsIgnoreCase(identificacion)) {
                return true;
            }
        }
        return false;
    }

    public static Doctor traerDoctorIdentificacion(String identificacion, String ruta) {
        LinkedList<Doctor> doctores = traerDatos(ruta);

        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getIdentificacion().equals(identificacion)) {
                return doctores.get(i);
            }

        }
        return null;
    }

    public static int traerIndexDoctorIdentificacion(String identificacion, String ruta) {
        LinkedList<Doctor> doctores = traerDatos(ruta);
        int aux = 0;
        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getIdentificacion().equals(identificacion)) {
                aux = i;

            }

        }
        return aux;
    }

    public static LinkedList<Doctor> modificarDoctor(String identificacion, String ruta, String nombre, String apellido, String edad, String telefono, String sexo, String especialidad, String consultorio) {
        LinkedList<Doctor> doctores = traerDatos(ruta);

        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getIdentificacion().equals(identificacion)) {
                doctores.get(i).setNombre(nombre);
                doctores.get(i).setApellido(apellido);
                doctores.get(i).setEdad(edad);
                doctores.get(i).setTelefono(telefono);
                doctores.get(i).setSexo(sexo);
                doctores.get(i).setEspecialidad(especialidad);
                doctores.get(i).setConsultorio(consultorio);

                return doctores;
            }
        }
        return null;
    }

    public static boolean buscarCitaIdentificacion(String identificacion, String ruta) {
        LinkedList<Cita> citas = traerDatos(ruta);

        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getP().getIdentificacion().equalsIgnoreCase(identificacion)) {
                return true;
            }
        }
        return false;
    }

    public static Cita traerCitaIdentificacion(String identificacion, String ruta) {
        LinkedList<Cita> citas = traerDatos(ruta);

        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getP().getIdentificacion().equals(identificacion)) {
                return citas.get(i);
            }

        }
        return null;
    }

    public static int traerIndexCitaIdentificacion(String identificacion, String ruta) {
        LinkedList<Cita> citas = traerDatos(ruta);
        int aux = 0;
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getP().getIdentificacion().equals(identificacion)) {
                aux = i;

            }

        }
        return aux;
    }

    public static LinkedList<Cita> modificarCita(String identificacion, String ruta, String especialidad, Doctor d, String sintomas) {
        LinkedList<Cita> citas = traerDatos(ruta);

        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getP().getIdentificacion().equals(identificacion)) {
                citas.get(i).setEspecialidad(especialidad);
                citas.get(i).setD(d);
                citas.get(i).setSintomas(sintomas);
                return citas;
            }
        }
        return null;
    }

    public static void llenarComboBoxDoctores(String especialidad, JComboBox cmbDoctores, String ruta) {
        DefaultComboBoxModel cmb;
        LinkedList<Doctor> doctores = traerDatos(ruta);
        cmb = (DefaultComboBoxModel) cmbDoctores.getModel();
        cmb.removeAllElements();

        Doctor d;
        for (int i = 0; i < doctores.size(); i++) {

            d = doctores.get(i);
            if (d.getEspecialidad().equalsIgnoreCase(especialidad)) {
                cmb.addElement(d.getIdentificacion() + " - " + d.getNombre() + " " + d.getApellido());
            }
        }
    }

    public static boolean validarConsultorioMedico(String consultorio, String ruta) {
        LinkedList<Doctor> doctores = traerDatos(ruta);
        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getConsultorio().equals(consultorio)) {
                return true;
            }
        }
        return false;
    }

}
