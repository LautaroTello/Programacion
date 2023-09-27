package SdGdE;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();

        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", 1, 10.0, 40);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Pedro", 2, 1000.0);
        EmpleadoComision empleado3 = new EmpleadoComision("María", 3, 500.0, 1000.0);

        gestor.agregarEmpleado(empleado1);
        gestor.agregarEmpleado(empleado2);
        gestor.agregarEmpleado(empleado3);

        // Mostrar los empleados con sus datos y cálculos
        gestor.mostrarEmpleados();

        //Menú
        while (true) {

            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Modificar a un empleado");
            System.out.println("3. Eliminar a unempleado");
            System.out.println("4. Mostrar empleados");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> agregarEmpleado(gestor, scanner);
                case 2 -> modificarEmpleado(gestor, scanner);
                case 3 -> eliminarEmpleado(gestor, scanner);
                case 4 -> gestor.mostrarEmpleados();
                case 5 -> {
                    System.out.println("Fin del programa");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    // Método para eliminar un empleado según la id
    public static void eliminarEmpleado(GestorEmpleados gestor, Scanner scanner) {
        // Leer el ID del empleado a eliminar
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        int id = scanner.nextInt();

        // Elimina el empleado del ArrayList
        gestor.eliminarEmpleado(id);

        // Un mensaje de confirmación
        System.out.println("El empleado eliminado.");
    }


    // Método para agregar un empleado al ArrayList
    public static void agregarEmpleado(GestorEmpleados gestor, Scanner scanner) {
        // Leer los datos del nuevo empleado
        System.out.print("Ingrese el nombre del nuevo empleado: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el ID del nuevo empleado: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese el sueldo base del nuevo empleado: ");
        double sueldobase = scanner.nextDouble();
        System.out.print("Seleccione el tipo de empleado (1=Por horas, 2=Asalariado, 3=Por comisión): ");
        int tipo = scanner.nextInt();

        switch (tipo) {
            case 1 -> {
                System.out.print("Ingrese las horas trabajadas por el nuevo empleado: ");
                int horasTrabajadas = scanner.nextInt();
                EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(nombre, id, sueldobase, horasTrabajadas);
                gestor.agregarEmpleado(empleadoPorHoras);
            }
            case 2 -> {
                EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombre, id, sueldobase);
                gestor.agregarEmpleado(empleadoAsalariado);

            }
            case 3 -> {
                System.out.print("Ingrese las ventas realizadas por el nuevo empleado: ");
                double ventasRealizadas = scanner.nextDouble();
                EmpleadoComision empleadoComision = new EmpleadoComision(nombre, id, sueldobase, ventasRealizadas);
                gestor.agregarEmpleado(empleadoComision);
            }
            default -> System.out.println("Opción inválida.");
        }
    }

    public static void modificarEmpleado(GestorEmpleados gestor, Scanner scanner) {

        System.out.print("Ingrese el ID del empleado a modificar: ");
        int id = scanner.nextInt();

        // Busca al empleado en el ArrayList
        boolean encontrado = false;
        for (int i = 0; i < gestor.empleados.size(); i++) {
            if (gestor.empleados.get(i).getId() == id) {
                encontrado = true;

                // Leer los nuevos datos del empleado
                System.out.print("Ingrese el nuevo nombre del empleado: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el nuevo sueldo base del empleado: ");
                double sueldobase = scanner.nextDouble();

                // Crea un nuevo objeto de la clase Empleado con los nuevos datos
                Empleado empleadoNuevo = null;
                if (gestor.empleados.get(i) instanceof EmpleadoPorHoras) {
                    System.out.print("Ingrese las nuevas horas trabajadas por el empleado: ");
                    int horasTrabajadas = scanner.nextInt();
                    empleadoNuevo = new EmpleadoPorHoras(nombre, id, sueldobase, horasTrabajadas);
                } else if (gestor.empleados.get(i) instanceof EmpleadoAsalariado) {
                    empleadoNuevo = new EmpleadoAsalariado(nombre, id, sueldobase);
                } else if (gestor.empleados.get(i) instanceof EmpleadoComision) {
                    System.out.print("Ingrese las nuevas ventas realizadas por el empleado: ");
                    double ventasRealizadas = scanner.nextDouble();
                    empleadoNuevo = new EmpleadoComision(nombre, id, sueldobase, ventasRealizadas);
                }

                // Reemplazar el objeto antiguo con el nuevo objeto en el ArrayList
                gestor.modificarEmpleado(id, empleadoNuevo);

                // Mostrar un mensaje de confirmación
                System.out.println("El empleado ha sido modificado.");
            }
        }
        scanner.close();
        // Muestra un mensaje de error si no se encuentra el empleado en el ArrayList
        if (!encontrado) {
            System.out.println("No se encontró ningún empleado con ese ID.");
        }
    }
}

