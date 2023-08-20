package Semana_2.Recursividad;

import java.util.Scanner;

public class Factorial_Recursivo { static Scanner leer=new Scanner(System.in);
    public static void main(String[]args){
    long n;
    System.out.println("Ingrese su Valor: ");
        n= leer.nextLong();
        System.out.println("Resultado Factorial Recursivo es: "+Recursivo(n));
    }
    public static long Recursivo(long n){
        if(n==0){
            return 1;
        }else{
            return n*Recursivo(n-1);
        }
    }
}
