package SdGdE;

// Interfaz Impuesto
public interface Impuesto {

    // Método abstracto para calcular el impuesto a pagar
  default double calcularImpuesto(){
      return 0;
  }


}
