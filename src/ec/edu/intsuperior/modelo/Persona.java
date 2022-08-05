
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Persona {
    private String nombres;
    private String apellidos;
    private String cedula;
    private Date fecha;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String cedula, Date fecha, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.fecha = fecha;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
