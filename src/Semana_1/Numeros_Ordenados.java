package Semana_1;

import java.util.Scanner;

public class Numeros_Ordenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Ingrese tres números enteros uno por uno:");

        for (int i = 0; i < 4; i++) {
            String mensaje = switch (i) {
                case 1 -> "Primer número";
                case 2 -> "Segundo número";
                case 3 -> "Tercer número";
                default -> "";
            };
            if (!mensaje.isEmpty()) {
                System.out.println(mensaje);
                numeros[i - 1] = sc.nextInt();
            }
        }


        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("Los números ordenados de mayor a menor son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
