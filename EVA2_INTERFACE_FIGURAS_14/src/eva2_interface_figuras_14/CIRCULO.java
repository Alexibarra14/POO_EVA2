/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_interface_figuras_14;

/**
 *
 * @author aleja
 */
public class CIRCULO implements FIGURA,MostrarDatos {
    private double radio;

     public CIRCULO() {
        this.radio = 0;
    }
  
    public CIRCULO(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area= Math.PI*(radio*radio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro= Math.PI*(radio*2);
        return perimetro;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("*********CIRCULO******** ");
        System.out.println("Radio: "+ radio);
        System.out.println("Area: "+ calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
  
    
   
  
    
    
}


