package Semana_2.Recursividad;
import java.util.Scanner;
public class Factorial_Iterativo {static Scanner leer;static{leer = new Scanner(System.in);}
    public static void main(String[]args){
        long n;
        System.out.println("Ingrese un numero");
        n= leer.nextLong();
        //Aca muestra el resultado final
        System.out.println("Su Resultado factorial es: " + Iterativo(n));


    }
    public static long Iterativo(long n){
        for(long i=n-1;i>0;i--){
            //En la primera ejecucion se hace n*i siendo n = 5 en caso de ser ese el numero ingresado y i como n-1
            // entonces comenzaria con valor 4 en su primera ejecucion, 20*3 en la segunda,
            // 60*2 en la tercera y asi hasta que i llegué a 1.
            n=n*i;
        }
        return n;
    }
}
