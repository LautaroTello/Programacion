package SdGdE;

public class EmpleadoComision extends Empleado implements Impuesto{
    protected double ventasRealizadas;
    public EmpleadoComision(String nombre, int id, double sueldobase, double ventasRealizadas) {
        super(nombre, id, sueldobase);
        this.ventasRealizadas = ventasRealizadas;
    }
    protected double getVentasRealizadas(){
        return ventasRealizadas;
    }
    @Override
    public double calcularSueldo() {
        return getSueldobase()+ventasRealizadas*0.5;
    }

    @Override
    public double calcularImpuesto() {
        return calcularSueldo()*0.2;
    }

}

