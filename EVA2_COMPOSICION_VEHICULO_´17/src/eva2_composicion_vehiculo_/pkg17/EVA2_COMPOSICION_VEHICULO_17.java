/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_composicion_vehiculo_.pkg17;

/**
 *
 * @author aleja
 */
public class EVA2_COMPOSICION_VEHICULO_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VEHICULO carro = new VEHICULO();
        System.out.println(carro);
        carro.setMarca("Ford");
        carro.setModelo("Mustang");
        carro.setAño(2008);
        MOTOR motor= new MOTOR(0, 500);
        carro.setMotor(motor);
        System.out.println(carro);
    }
    
}
