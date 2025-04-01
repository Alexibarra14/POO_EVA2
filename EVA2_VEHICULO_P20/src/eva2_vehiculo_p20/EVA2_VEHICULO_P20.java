/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_vehiculo_p20;

/**
 *
 * @author aleja
 */
public class EVA2_VEHICULO_P20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VEHICULO carro= new VEHICULO();
        carro.setMarca("FORD");
        carro.setModelo("MUSTANG");
        carro.setAño(1970);
        //TIPO DE MOTOR:
        MOTOR_ELECTRICO miMotor = new MOTOR_ELECTRICO();
        MOTOR_DISEL motorDisel= new MOTOR_DISEL();
        MOTOR_GASOLINA moto = new MOTOR_GASOLINA();
        
        carro.setMotor(moto);
        System.out.println(carro);
        
    }
    
}
