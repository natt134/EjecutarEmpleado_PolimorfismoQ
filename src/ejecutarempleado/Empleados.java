
package ejecutarempleado;

/**
 *
 * @author natal
 */
abstract class Empleados {
protected int CodigoEmpleado;
protected String Nombre;
protected double Salario;
protected double Total;





    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public double getTotal() {
        return Total;
    }
    
    
 
    abstract void TotalAPagar ();

}
