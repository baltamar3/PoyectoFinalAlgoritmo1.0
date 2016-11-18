
package clases;

/**
 *
 * @author baltamar3
 */
public class Paciente extends Persona {

    private String alergia;
    private String tipoSangre;
    private String enfermedad;

    public Paciente(String identificacion, String nombre, String apellido, String edad, String telefono, String sexo, String alergia, String tipoSangre, String enfermedad) {
        super(identificacion, nombre, apellido, edad, telefono, sexo);
        this.alergia = alergia;
        this.tipoSangre = tipoSangre;
        this.enfermedad = enfermedad;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

}
