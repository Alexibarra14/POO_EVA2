/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_sobreescritura_p7;

/**
 *
 * @author aleja
 */
public class EMPLEADO {
    private String nombre;
    private String apellido;
    private double salario;

    
     public EMPLEADO() {
        this.nombre = "___";
        this.apellido = "___";
        this.salario = 0;
    }
    public EMPLEADO(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double salario(){
        return this.salario;
    }
    @Override
    public String toString(){
        String cadena= "nombre: "+ nombre+ "\n"+
                "apellido:"+apellido+      "\n" +
                "Salario: "+salario;
        return cadena;
    }
    
    
}
