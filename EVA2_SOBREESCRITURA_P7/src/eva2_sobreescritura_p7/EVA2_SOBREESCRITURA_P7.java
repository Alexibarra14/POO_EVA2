/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_sobreescritura_p7;

/**
 *
 * @author aleja
 */
public class EVA2_SOBREESCRITURA_P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* EMPLEADO empleado= new EMPLEADO("juan", "perez", 1400.0);
        System.out.println("EL SALARIO ES:"+ empleado.salario());
        System.out.println("************");*/
        EMPLEADOBASE empleadob= new EMPLEADOBASE("ALEJANDRO", "IBARRA", 1000, 5, .50);
       System.out.println(empleadob);
       
        System.out.println("***********");
       EMPLEADOTEMP empleadot = new EMPLEADOTEMP(5, 132, "alejandro", "ibarra", 1000);
        System.out.println(empleadot);
    }
    
}
