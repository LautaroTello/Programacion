package Practica_2;
import java.util.Scanner;
public class Principal  { public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba el nombre");
        String nombre = leer.nextLine();
        System.out.println("Escriba el apellido");
        String apellido = leer.nextLine();
        System.out.println("Ingresar edad");
        int edad = leer.nextInt();
        System.out.println("Ingresar documento");
        int dni = leer.nextInt();
        leer.nextLine(); // Consume el carácter de nueva línea
        System.out.println("Ingrese su sexo");
        String sexo = leer.nextLine();
        System.out.println("Ingrese peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese altura");
        double altura = leer.nextDouble();
        Persona persona1 = new Persona(nombre, apellido, edad,dni, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, apellido, edad, dni, sexo);
        Persona persona3 = new Persona(nombre, dni);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Si el numero es -1 esta debajo del peso ideal " + " 0 peso ideal y 1 sobrepeso "+ persona1.CalcularIMC());
        System.out.println("Es mayor de edad? "+ persona1.esMayordeEdad());
        System.out.println(persona1);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Si el numero es -1 esta debajo del peso ideal " + " 0 peso ideal y 1 sobrepeso "+ persona2.CalcularIMC());
        System.out.println(persona2);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(persona3);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");}}
