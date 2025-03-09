/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_herencia_p3;

/**
 *
 * @author aleja
 */
public class EVA2_HERENCIA_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EMPLEADO empleado = new EMPLEADO();
        empleado.setNombre("ruben");
        System.out.println("NOMBRE: "+ empleado.getNombre());
        empleado.setNumeroEmpleado(50);
        System.out.println("NUMERO DE EMPLEADO: "+empleado.getNumeroEmpleado());
        PROOVEDOR proovedor = new PROOVEDOR();
        
        System.out.println("-------------------------------");
        proovedor.setNombre("WALRMART");
        System.out.println("Nombre: "+proovedor.getNombre());
        System.out.println("Credito: "+proovedor.isCredito());
        
        System.out.println("--------------------------------");
        CLIENTE cliente= new CLIENTE();
        cliente.setNombre("SORIANA");
        System.out.println("Nombre: "+cliente.getNombre());
        cliente.setRazonSocial("SORIANA");
        System.out.println("RAZON SOCIAL: "+cliente.getRazonSocial());
    }
    
}
