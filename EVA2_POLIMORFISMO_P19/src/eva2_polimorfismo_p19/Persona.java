package eva2_polimorfismo_p19;

public abstract class Persona {
   //ATRIBUTOS
   String nombre;
   String apellidos;
   int edad;
     public Persona() {
        this.nombre = "---";
        this.apellidos = "---";
        this.edad = 0;
     }
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
      
    }
   
   public String getNombre(){
      return nombre;
   }
   
   public void setNombre(String valor){
      nombre = valor;
   }
   
   public String getApellidos(){
      return apellidos;
   }
   
   public void setApellidos(String valor){
      apellidos = valor;
   }
   
   public int getEdad(){
      return edad;
   }
   
   public void setEdad(int valor){
      edad = valor;
   }
   

   public void imprimirDatos(){
       System.out.println("NOMBRE: "+nombre);
       System.out.println("APELLIDO: "+apellidos);
       System.out.println("EDAD: "+edad);
   }
}
