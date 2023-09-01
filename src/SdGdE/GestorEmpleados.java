package SdGdE;

import java.util.ArrayList;

public class GestorEmpleados {

    // Atributo que almacena los empleados en un ArrayList
    public final ArrayList<Empleado> empleados;

    // Constructor que inicializa el ArrayList vacío
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado al ArrayList
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para modificar un empleado del ArrayList por su id
    public void modificarEmpleado(int id, Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                empleados.set(i, empleado);
                break;
            }
        }
    }

    // Método para eliminar un empleado del ArrayList por su id
    public void eliminarEmpleado(int id) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                empleados.remove(i);
                break;
            }
        }
    }

    // Método para mostrar los empleados del ArrayList con sus datos y cálculos
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("ID: " + empleado.getId());
            System.out.println("Sueldo base: " + empleado.getSueldobase());
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Horas trabajadas: " + ((EmpleadoPorHoras) empleado).getHorastrabajadas());
            }
            if (empleado instanceof EmpleadoComision) {
                System.out.println("Ventas realizadas: " + ((EmpleadoComision) empleado).getVentasRealizadas());
            }
            System.out.println("Sueldo: " + empleado.calcularSueldo());
            System.out.println("Impuesto: " + empleado.calcularImpuesto());
            System.out.println();
        }
    }
}
