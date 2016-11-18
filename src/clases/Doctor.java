
package clases;



/**
 *
 * @author baltamar
 */
public class Doctor extends Persona {

    private String especialidad;
    private String consultorio;

    public Doctor(String identificacion, String nombre, String apellido, String edad, String telefono, String sexo, String especialidad, String consultorio) {
        super(identificacion, nombre, apellido, edad, telefono, sexo);
        this.especialidad = especialidad;
        this.consultorio = consultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

}
