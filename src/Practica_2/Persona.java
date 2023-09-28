package Practica_2;

public class Persona {



    //Declaración
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    //Valores por defecto
    public Persona() {
        this.apellido = "";
        this.edad = 0;
        this.sexo = "H";
        this.peso = 0;
        this.altura = 0;
    }

    //Constructor con dni y nombre
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, int edad, int dni, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    public Persona(String nombre, String apellido, int edad, int dni, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double CalcularIMC() {
        double pesoideal = this.peso / Math.pow(this.altura, 2);
        if (pesoideal <= 20) {
            return -1;
        } else {
            if (pesoideal >= 20 && pesoideal <= 25) {
                return  0;
            } else {
                return 1;
            }
        }
    }

    public boolean esMayordeEdad() {
        boolean confirmacion;
        if (this.edad >= 18) {
            return true;
        } else
            return confirmacion = false;
    }

    public void comprobarSexo(char sexo) {
        if (sexo != 'M' && sexo != 'H') {
            String confirmacion = "H";
        }
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
