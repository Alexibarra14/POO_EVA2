/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_clases_abstractas_p9;

/**
 *
 * @author aleja
 */
public class EMPLEADO extends PERSONA {
    private double salario;

    public EMPLEADO() {
        this.salario = 0.0;
    }

    public EMPLEADO(double salario, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("EMPLEADO****");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Salario: "+salario);
    }
    
    
}
