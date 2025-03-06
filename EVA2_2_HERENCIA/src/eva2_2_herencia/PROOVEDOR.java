/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author aleja
 */
public class PROOVEDOR {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    private boolean credito;
    
    
    public PROOVEDOR(){
        nombre="__";
        apellidoPaterno="__";
        apellidoMaterno="__";
        edad=0;
        rfc="__";
        credito=false;
    }
    public PROOVEDOR(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc, boolean credito){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.edad= edad;
        this.rfc=rfc;
        this.credito=credito;
        
        
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
    public void setCredito(boolean credito){
        this.credito=credito;
    }
    public boolean getCredito(){
        return credito;
        
    }
}
