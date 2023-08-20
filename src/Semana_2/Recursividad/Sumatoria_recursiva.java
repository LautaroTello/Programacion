package Semana_2.Recursividad;
import java.util.Scanner;
public class Sumatoria_recursiva {
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();
        System.out.println(suma(n));
    }
}

