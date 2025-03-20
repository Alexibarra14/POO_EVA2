/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_figura_p10;

/**
 *
 * @author aleja
 */
public class EVA2_FIGURA_P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("******CIRCULO******");
        CIRCULO circulo= new CIRCULO(45.2);
        System.out.println("AREA: "+circulo.calcularArea());;
        System.out.println("PERIMETRO: "+circulo.calcularPerimetro());
        System.out.println("*****RECTANGULO******");
        RECTANGULO rectangulo= new RECTANGULO(50, 40);
        System.out.println("AREA: "+rectangulo.calcularArea());
        System.out.println("PRIMETRO :"+rectangulo.calcularPerimetro());
    }
    
}
