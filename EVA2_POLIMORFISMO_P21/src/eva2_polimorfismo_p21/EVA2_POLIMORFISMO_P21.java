/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_polimorfismo_p21;

/**
 *
 * @author aleja
 */
public class EVA2_POLIMORFISMO_P21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            SERPIENTE serp= new SERPIENTE();
            serp.respirarOxigeno();//ANIMAL
            serp.seArrastra();//SERPIENTE
            serp.tenerSangreFria();//REPTIL
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
            System.out.println("MAMIFERO");
            GATO garu = new GATO();
            
            garu.respirarOxigeno();
            garu.tenerGarrasRetractiles();
            garu.tenerPelo();
            
            garu.tenerSangreCaliente();
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("REPTIL");
            REPTIL reptil = new SERPIENTE();
           reptil.respirarOxigeno();
           reptil.tenerSangreFria();
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
           //COMO RECUPERAR EL PBJETO ORIGINAL
           SERPIENTE objSerp =(SERPIENTE)reptil;//CASTING
            animal anim= new SERPIENTE();
            System.out.println("POLIMORFISMO FALLIDO");
           /* SERPIENTE serp= new animal();//ANIMAL no es un reptil*/
            
            Object object= new SERPIENTE();
           
    }
    
}
class animal{
    public animal(){
        System.out.println("ANIMAL");
    }
    public void respirarOxigeno(){
        System.out.println("RESPIRAR OXIGENO");
    }
    
}
class MAMIFERO extends animal{
    public MAMIFERO(){
        System.out.println("Mamifero");
    }
    public void tenerPelo(){
        System.out.println("TENER PELO");
        
    }
    public void tenerSangreCaliente(){
        System.out.println("TENER SANGRE CALIENTE");
    }
    
}
class REPTIL extends animal{
    public REPTIL(){
        System.out.println("REPTIL");
    }
    public void tenerSangreFria(){
        System.out.println("TENER SANGRE FRIA");
    }
}
class GATO extends MAMIFERO{
    public GATO(){
        System.out.println("GATO");
        
    }
    public void tenerGarrasRetractiles(){
        System.out.println("TENER GARRAS RETRACTILES");
    }
    
}
class SERPIENTE extends REPTIL{
    public SERPIENTE(){
        System.out.println("SERPIENTE");
        
    }
    public void seArrastra(){
        System.out.println("SE ARRASTRA");
    }
}