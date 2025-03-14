/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_sobreescritura_p7;

/**
 *
 * @author aleja
 */
public class EMPLEADOBASE extends EMPLEADO{
    private int numempleado;
    private double bono;

    public EMPLEADOBASE() {
        super();
        numempleado=0;
        bono=0.0;
    }

    public EMPLEADOBASE(String nombre, String apellido, double salario, int numempleado, double bono) {
        super(nombre, apellido, salario);
        this.numempleado=numempleado;
        this.bono=bono;
    }

    public int getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double salario(){
     return super.salario()*(1+bono);
    }
    @Override
    public String toString(){
        String cadena=super.toString();
        cadena= cadena+ "\n numero de empleado: "+ numempleado+ "\n"+
                "bono: "+ bono+ "\n"+
                "salario totañ: "+ salario();
                
         return cadena;       
    }
}
