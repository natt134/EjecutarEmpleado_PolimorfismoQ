
package ejecutarempleado;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class EjecutarEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer=new Scanner (System.in);
    
    String Nombre,POO;
    int codigo,tipo,proyectos,lineas;
    double salario;
    Empleados [] empleados=new Empleados [3];
        for (int i = 0; i < empleados.length; i++) {
        System.out.println("<<<<    INGRESO DE LOS DATOS    >>>>");
        System.out.print("Teclee su nombre: ");
        Nombre=Leer.next();
        System.out.print("Ingrese su codigo de empleado: ");
        codigo=Leer.nextInt();
        System.out.println("<<<    Que Tipo de empleado es:    >>>");
        System.out.println("<<<    1. Programador    >>>");
        System.out.println("<<<    2. Analista    >>>");
        System.out.println("<<<    3. Desarrollador    >>>");
        tipo=Leer.nextInt();
        
        switch (tipo) {
            case 1:
             Programadores pro= new Programadores();
            System.out.println("Ingrese Salario");
            salario=Leer.nextDouble();
            
            pro.setNombre(Nombre);
            pro.setCodigoEmpleado(codigo);
            pro.setSalario(salario);
            
            pro.TotalAPagar();
            
            System.out.println("Su mensualidad es de: "+pro.getTotal()); 
            empleados [i]=pro;
                break;
            case 2:
                Analistas ana=new Analistas ();
                System.out.println("Ingrese el numero de proyectos analizados");
                proyectos=Leer.nextInt();
                if (proyectos>=5) {
                salario=5600000;   
                }else {
                salario=4300000;
                }
                
                ana.setNombre(Nombre);
                ana.setCodigoEmpleado(codigo);
                ana.setSalario(salario);
                ana.setCantidadDeProyectos(proyectos);
                
                ana.CalcularDescuentoDeRetencion();
                ana.TotalAPagar();
                
                System.out.println("Su salario es de: "+ana.getSalario());
                System.out.println("Su descuento de retencion del 4% es de: "+ana.getDescuentoDeRetencion());
                System.out.println("Su sueldo final es de: "+ana.getTotal());
                empleados [i]=ana;
                break;
            case 3:
                Desarrolladores desa=new Desarrolladores();
                System.out.println("Cuantas lineas de codigo capturó?");
                lineas=Leer.nextInt();
                if (lineas>=1500) {
                salario=8200000;   
                } else {
                    salario=6320000;
                }
                
                desa.setNombre(Nombre);
                desa.setCodigoEmpleado(codigo);
                desa.setSalario(salario);
                
                System.out.println("Aplicó correctamente la POO?");
                POO=Leer.next();
                if (POO.equalsIgnoreCase("si")) {
                desa.CalcularBonificacion();
                desa.TotalAPagar();
                }else {
                desa.TotalAPagar();
                }
                
                System.out.println("Su salario es de: "+desa.getSalario());
                System.out.println("Su bonificacion del 5% es de: "+desa.getBonificación());
                System.out.println("Su sueldo final es de: "+desa.getTotal());
                empleados [i]=desa;
            default:
                System.out.println(" ");
        } 
                             
        }
        
       for (Empleados empleado : empleados) {
            System.out.println("\n<<<<    Resumen de los Empleados    >>>>");
            System.out.println("Nombre: " + empleado.getNombre() + ", Código: " + empleado.getCodigoEmpleado() + ", Sueldo final: " + empleado.getTotal());
            }
           System.out.println("¡Hasta pronto!"); 
       
    }
    
}
