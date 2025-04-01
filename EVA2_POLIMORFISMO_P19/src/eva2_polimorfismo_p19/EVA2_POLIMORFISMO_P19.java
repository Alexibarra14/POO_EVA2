/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_polimorfismo_p19;

/**
 *
 * @author aleja
 */
public class EVA2_POLIMORFISMO_P19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // POLIMORFISMO: Un objeto de una clase se comporta como un objeto de otra clase.
        //Solo aplica en clases relacionadas por herencia
        EMPLEADO[] empleados = new EMPLEADO[5];
        empleados[0] = new EMPLEADO(1, "juan","Peres",50);
        empleados[1] = new EMPLEADO(2, "Alejandro","Ibarra",40);
        empleados[2] = new EMPLEADO(3, "Jose","Valdez",35);
        empleados[3] = new EMPLEADO(4, "Raul","Pedroza",10);
        empleados[4] = new EMPLEADO(5, "Lilia","Morales",28);
        
        
        System.out.println("----------------REPORTE DE EMPLEADOS------------");
          /*for(int i=0; i<5;i++)
                {
                    empleados[i].imprimirDatos();
                }*/
          reportes(empleados);
          
        CLIENTE[] cliente = new CLIENTE[5];
        cliente[0]= new CLIENTE("ALEJANDRO", "IBARRA", 27, "SAADFSDF54");
        cliente[1]= new CLIENTE("MARTIN", "IBARRA", 24, "AFLDSKSFSA5");
        cliente[2]= new CLIENTE("LLUVIA", "IBARRA", 17, "DASFDF54");
        cliente[3]= new CLIENTE("JOEL", "MARTINEZ", 47, "FSDAFS4SF4");
        cliente[4]= new CLIENTE("BRENDA", "IBARRA", 57, "SFSFSFE5S4F");
        
        
              System.out.println("---------------REPORTE DE CLIENTES:-----------------");
               /* for(int i=0; i<5;i++)
                {
                    cliente[i].imprimirDatos();
                }
                    */
               reportes(cliente);
                }
    public static void reportes(Persona[] personas){
         for(int i=0; i<5;i++)
           {
                    personas[i].imprimirDatos();
                }

}
}

