/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_composicion_p16;

/**
 *
 * @author aleja
 */
public class CLIENTE{
    private String nombre;
    private String apellido;
    private int edad;
    private DIRECCION direccion;//CLIENTE HAS A(TIENE UNA) DIRECCION
    
    
      public CLIENTE() {
        this.nombre = "----";
        this.apellido = "----";
        this.edad = 0;
        this.direccion= new DIRECCION();
    }
    public CLIENTE(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion= new DIRECCION();
        
    }

    public DIRECCION getDireccion() {
        return direccion;
    }

    public void setDireccion(DIRECCION direccion) {
        this.direccion = direccion;
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
    public String toString(){
        return "datos del cliente:\n"+
                "NOMBRE: "+ nombre +"\n"+
                "APELLIDO: "+ apellido +"\n"+
                "EDAD: "+ edad+ "\n"+
                "NUMERO DE CASA "+ direccion.getNumeroCasa()+"\n"+
                "CALLE: "+ direccion.getCalle()+"\n"+
                "COLONIA: "+ direccion.getColonia()+"\n"+
                "ESTADO: "+ direccion.getEstado();
                
    }
}
