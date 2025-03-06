/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author aleja
 */
public class EMPLEADO {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    private int claveEmpleado;
    
    
    public EMPLEADO(){
        nombre="__";
        apellidoPaterno="__";
        apellidoMaterno="__";
        edad=0;
        rfc="__";
        claveEmpleado=0;
    }
      public EMPLEADO(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc, int claveEmpleado){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.edad= edad;
        this.rfc=rfc;
        this.claveEmpleado=claveEmpleado;
        
      }
          public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
        
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
        
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }
    public String getApellidoMaterno(){
        return apellidoMaterno;
        
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
        
    }
    public void setRfc(String rfc){
        this.rfc=rfc;
    }
    public String getRfc(){
        return rfc;
        
    }
    public void setClaveEmpleado(int claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }
    public double getClaveEmpleado(){
        return claveEmpleado;
        
    }
}
