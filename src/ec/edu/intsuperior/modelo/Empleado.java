
package ec.edu.intsuperior.modelo;

import java.util.Date;

public abstract class Empleado extends Persona {
    private int sueldoBruto;
    private int salarioNeto;

    public Empleado() {
    }

    public Empleado(int sueldoBruto, int salarioNeto, String nombres, String apellidos, String cedula, Date fecha, String telefono) {
        super(nombres, apellidos, cedula, fecha, telefono);
        this.sueldoBruto = sueldoBruto;
        this.salarioNeto = salarioNeto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(int salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    @Override
    public String toString() {
        return super.toString()+"SUS DATOS SON"+getCedula()+getNombres()+getApellidos()+getTelefono()+getFecha() ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
