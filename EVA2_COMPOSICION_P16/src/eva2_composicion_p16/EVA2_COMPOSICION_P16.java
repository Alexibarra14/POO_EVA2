/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_composicion_p16;

/**
 *
 * @author aleja
 */
public class EVA2_COMPOSICION_P16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         CLIENTE client= new CLIENTE();
        CLIENTE cliente= new CLIENTE("ALEJANDRO", "IBARRA", 35);
        System.out.println(cliente);
        DIRECCION direc = new DIRECCION("OLIVAR DE COS", 122, "LOS OLIVOS", "CHIHUAHUA", "CHIHUAHUA");
        cliente.setDireccion(direc);
        System.out.println(cliente);
        
    }
    
}
