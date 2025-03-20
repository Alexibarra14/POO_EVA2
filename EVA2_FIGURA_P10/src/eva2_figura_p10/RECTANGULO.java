/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_figura_p10;

/**
 *
 * @author aleja
 */
public class RECTANGULO extends FIGURAS {
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
    
    
}
