/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_clases_abstractas_p9;

/**
 *
 * @author aleja
 */
public class CLIENTE extends PERSONA{
    private String tipoPersona;

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public CLIENTE() {
        this.tipoPersona = "-----";
    }

    public CLIENTE(String tipoPersona, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.tipoPersona = tipoPersona;
    }
    

    @Override
    public void imprimirDatos() {
        System.out.println("CLIENTE****");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("TIPO DE PERSONA: "+tipoPersona);
    
    }
    
}
