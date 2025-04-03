
package ejecutarempleado;

/**
 *
 * @author natal
 */
class Desarrolladores extends Empleados{
    
public int CantidadLineasCodigo;    
public double Bonificación;

    

    public void setCantidadLineasCodigo(int CantidadLineasCodigo) {
        this.CantidadLineasCodigo = CantidadLineasCodigo;
    }

    public void setBonificación(double Bonificación) {
        this.Bonificación = Bonificación;
    }
    
    public void CalcularBonificacion (){
    this.Bonificación=Salario*0.05;
    }
    
    public void TotalAPagar(){
    Total=Salario+Bonificación;
    }

    public double getBonificación() {
        return Bonificación;
    }
    
    public double getTotal() {
        return Total;
    }
    
}
