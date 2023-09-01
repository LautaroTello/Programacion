package SdGdE;

public class EmpleadoPorHoras extends Empleado implements Impuesto{
    protected int horastrabajadas;
    public EmpleadoPorHoras(String nombre, int id, double sueldobase, int horasTrabajadas) {
        super(nombre, id, sueldobase);
        this.horastrabajadas= horasTrabajadas;
    }

    public int getHorastrabajadas(){
        return  horastrabajadas;
    }
    @Override
    public double calcularSueldo(){
        return getSueldobase()*getHorastrabajadas();
    }
    @Override
    public double calcularImpuesto(){
        return calcularSueldo()*0.1;
    }
}
