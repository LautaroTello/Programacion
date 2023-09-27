package Problema_1;
/////PROBLEMA N° 1
//1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener
//decimales).
//El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
//Crea sus métodos get, set y toString.
//Tendrá dos métodos especiales:
//• ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no
//se hará nada.
//• retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos
//pasan es negativa, la cantidad de la cuenta pasa a ser 0.
public class Cuenta {
    protected String Titular;
    protected double Cantidad;

    public String getTitular() {
        return Titular;
    }

    protected void setTitular(String Titular) {
        this.Titular = Titular;

    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Cuenta(String titular, double Cantidad) {
        this.Titular = titular;
        if (Cantidad>0) {
            this.Cantidad = Cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Titular='" + Titular + '\'' +
                ", Cantidad=" + Cantidad +
                '}';
    }
    public void Ingresar(double Cantidad){
    if(Cantidad>0){
        this.Cantidad+=Cantidad;
        }
    }

    public void Retirar(double Cantidad) {
        if (this.Cantidad - Cantidad < 0) {
            this.Cantidad = 0;
        } else {
            this.Cantidad -= Cantidad;
        }
    }
}
