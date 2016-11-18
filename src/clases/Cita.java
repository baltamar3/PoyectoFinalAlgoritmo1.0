package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author baltamar
 */
public class Cita implements Serializable {

    private Paciente p;
    private Doctor d;
    private String especialidad;
    private String sintomas;

    public Cita(Paciente p, Doctor d, String especialidad, String sintomas) {
        this.p = p;
        this.d = d;
        this.especialidad = especialidad;
        this.sintomas = sintomas;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public Doctor getD() {
        return d;
    }

    public void setD(Doctor d) {
        this.d = d;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
