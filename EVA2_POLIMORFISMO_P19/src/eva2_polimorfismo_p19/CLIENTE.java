/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_polimorfismo_p19;

/**
 *
 * @author aleja
 */
public class CLIENTE extends Persona{
    
    private String rfc;

    public CLIENTE() {
        super();
        this.rfc="---";
    }

    public CLIENTE(String nombre, String apellidos, int edad,String rfc) {
        super(nombre, apellidos, edad);
        this.rfc=rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
   public void imprimirDatos(){
       super.imprimirDatos();
        System.out.println("RFC"+rfc);
   }
    }