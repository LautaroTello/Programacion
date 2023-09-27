package SdGdE;
public abstract class Empleado {
   private final String nombre;
   private final int id;
   private final double sueldobase;

   public Empleado(String nombre, int id, double sueldobase){
       this.nombre=nombre;
       this.id=id;
       this.sueldobase=sueldobase;
   }

   public String getNombre(){
       return nombre;
   }
   public int getId(){
       return id;
   }

   public double getSueldobase(){
       return sueldobase;
   }
 public abstract double calcularSueldo();//metodo para calcular sueldo

  public abstract double calcularImpuesto(); // metodo para calcular impuesto


}
