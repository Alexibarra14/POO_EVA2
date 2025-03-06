/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author aleja
 */
public class CLIENTE {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    
    
    public CLIENTE(){
        nombre="__";
        apellidoPaterno="__";
        apellidoMaterno="__";
        edad=0;
        rfc="__";
    }
    public CLIENTE(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.edad=edad;
        this.rfc=rfc;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setapellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
        
    }
    public String getapellidoPaterno(){
        return apellidoPaterno;
    }
    public void setapellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
        
    }
    public String getapellidoMaterno(){
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
}
