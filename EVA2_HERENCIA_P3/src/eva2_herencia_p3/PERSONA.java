/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_herencia_p3;

/**
 *
 * @author aleja
 */
public class PERSONA {
    private String nombre;
    private  String apellidoPaterno;
    private String apellidoMaterno;
    private String rfc;

    public PERSONA() {
                this.nombre = "CONSTRUCTOR PERSONA";
        this.apellidoPaterno = "__";
        this.apellidoMaterno = "__";
        this.rfc = "__";
    }

    public PERSONA(String nombre, String apellidoPaterno, String apellidoMaterno, String rfc) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
