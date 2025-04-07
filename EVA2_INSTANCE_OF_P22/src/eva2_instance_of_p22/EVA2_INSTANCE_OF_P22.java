/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_instance_of_p22;

/**
 *
 * @author aleja
 */
public class EVA2_INSTANCE_OF_P22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GATO garu = new GATO();
        SERPIENTE serp= new SERPIENTE();
        imprimir(garu);
        imprimir(serp);
    }
    public static void imprimir(animal anim){
        anim.respirarOxigeno();
        if(anim instanceof GATO){
            anim.respirarOxigeno();
        }
        else if(anim instanceof REPTIL) {
            anim.respirarOxigeno();
            ((REPTIL) anim).tenerSangreFria();
            
        }
        
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