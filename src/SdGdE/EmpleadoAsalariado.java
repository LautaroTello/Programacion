package SdGdE;

public class EmpleadoAsalariado extends Empleado implements Impuesto{
   public EmpleadoAsalariado(String nombre, int id, double sueldobase){
       super(nombre, id, sueldobase);
   }
//calcula sueldo fijo
    @Override
    public double calcularSueldo() {
        return getSueldobase();
    }

//Calcula impuesto
    @Override
    public double calcularImpuesto() {
        return calcularSueldo()*0.15;
    }

}
