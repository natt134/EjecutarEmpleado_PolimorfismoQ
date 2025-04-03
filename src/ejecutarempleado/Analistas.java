
package ejecutarempleado;

/**
 *
 * @author natal
 */
class Analistas extends Empleados {
    
public int CantidadDeProyectos;
public double DescuentoDeRetencion;

   

    public void setCantidadDeProyectos(int CantidadDeProyectos) {
        this.CantidadDeProyectos = CantidadDeProyectos;
    }

    public void setDescuentoDeRetencion(double DescuentoDeRetencion) {
        this.DescuentoDeRetencion = DescuentoDeRetencion;
    }

    public void CalcularDescuentoDeRetencion (){
    DescuentoDeRetencion=Salario*0.04;
    }
    
    public void TotalAPagar ()
    {
        Total= Salario-DescuentoDeRetencion;
    }

    public double getDescuentoDeRetencion() {
        return DescuentoDeRetencion;
    }
    
    public double getTotal() {
        return Total;
    }

}
