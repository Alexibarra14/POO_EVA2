/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p1_exa_practico;

/**
 *
 * @author aleja
 */
public class EVA2_P1_EXA_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TESTCOVID test= new TESTCOVID(50,false,50,150);
        System.out.println(test.calcularPersonaRiesgo());
    }
    
}
