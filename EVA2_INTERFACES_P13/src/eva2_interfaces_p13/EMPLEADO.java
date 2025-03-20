/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_interfaces_p13;

/**
 *
 * @author aleja
 */
public class EMPLEADO extends PERSONA implements mpstrarDatos{
    private String clave;

    public EMPLEADO() {
        super();
        this.clave = "---";
    }

    public EMPLEADO(String clave, String nombre, String apellido) {
        super(nombre, apellido);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("apelldos: "+getApellido());
        System.out.println("Nombre: "+clave);
    }
    
}
