/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_polimorfismo_p19;

/**
 *
 * @author aleja
 */         //EMPLEADO ES UNA PERSONA
public class EMPLEADO extends Persona{
  
    private int claveEmpleado;

    public EMPLEADO(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public EMPLEADO(int claveEmpleado, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.claveEmpleado = claveEmpleado;
    }
    
    
   
    public void setClaveEmpleado(int claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }
    public double getClaveEmpleado(){
        return claveEmpleado;
        
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("CAVE EMPLEADO: "+ claveEmpleado);
    }
}
