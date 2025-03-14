/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_sobreescritura_p7;

/**
 *
 * @author aleja
 */
public class EMPLEADOTEMP extends EMPLEADO {
    private int horas;
    private int numContrato;

    public EMPLEADOTEMP() {
        super();
        this.horas = 0;
        this.numContrato = 0;
    }

    public EMPLEADOTEMP(int horas, int numContrato,String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
        this.horas = horas;
        this.numContrato = numContrato;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }
    @Override
    public double salario(){
        return super.salario()*horas;
    }
    @Override
    public String toString(){
        String cadena= super.toString();
        cadena= cadena + "\n horas: " + horas +      "\n"+
                "numero de contrato: "+ numContrato+ "\n"+
                "Salario por horas: "+ salario();
                return cadena;
    }
    
    
}
