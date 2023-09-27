package Problema_1;

import java.util.Scanner;

class Prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular");
        String Titular = leer.nextLine();
        System.out.println("Ingrese la cantidad inicial");
        double Cantidad = leer.nextDouble();
        Cuenta cuenta = new Cuenta(Titular, Cantidad);
        System.out.println("\t\t\t Menu");
        int opc;
        System.out.println("Ingrese 1: Ingresar dinero \nIngrese 2: Retirar Dinero \nIngrese 3: Ver Dinero\nIngrese 0: Salir del programa");
        opc = leer.nextInt();
        do {
            switch (opc) {
                case 1 -> {
                        System.out.print("Ingrese la cantidad a ingresar: ");
                        cuenta.Ingresar(leer.nextDouble());
                }case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: ");
                    cuenta.Retirar(leer.nextDouble());
                    }case 3 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Estado de la cuenta: " + cuenta.getCantidad());
                    System.out.println("--------------------------------------------------");
                    }
            }
            System.out.println("Ingrese 1: Ingresar dinero \nIngrese 2: Retirar Dinero \nIngrese 3: Ver Dinero\nIngrese 0: Salir del programa");
            opc = leer.nextInt();
        } while (opc > 0);
        leer.close();
    }
}
