package Semana_2.Recursividad;
import java.util.Scanner;
public class Division_con_resta {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //declaro las variables

        int divisor, dividendo;
        // pido al usario que cargue los datos

        System.out.println("Cargué algun valor al divisor");
        divisor = leer.nextInt();
        System.out.println("Cargué algún valor al dividendo");
        dividendo = leer.nextInt();

        //en la siguiente linea bifurco con un if dependiendo opt para ir a una funcion

        int resultadoiterativo = resta(dividendo, divisor);
        System.out.println(resultadoiterativo);

        int resultadorecursivo = resta(dividendo, divisor, 0);
        System.out.println(resultadorecursivo);

    }

    // division con resta iterativa

    public static int resta(int dividendo, int divisor) {
        return resta(dividendo, divisor, 0);
    }

    public static int resta(int dividendo, int divisor, int cociente) {
        if (dividendo < divisor) {
            return cociente;
        } else {
            return resta(dividendo - divisor, divisor, cociente + 1);
        }
    }
}


