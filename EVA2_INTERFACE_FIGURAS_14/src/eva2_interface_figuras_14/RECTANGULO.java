/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_interface_figuras_14;

/**
 *
 * @author aleja
 */
public class RECTANGULO implements FIGURA,MostrarDatos {
     private  double base;
    private double altura;
  
    public RECTANGULO() {
        this.base = 0.0;
        this.altura = 0.0;
    }
    public RECTANGULO(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
                return base* altura;
    }

    @Override
    public double calcularPerimetro() {
          return (base*2)+ (altura*2);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("*******RECTANGULO*****");
        System.out.println("BASE: "+base);
        System.out.println("ALTURA: "+ altura);
        System.out.println("AREA: "+calcularArea());
        System.out.println("PERIMETRO: "+calcularPerimetro());
        
    }

    
}
