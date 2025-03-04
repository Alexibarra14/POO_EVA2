/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_p1_exa_practico;

/**
 *
 * @author aleja
 */
public class TESTCOVID {
    
    private int edad;
    private boolean enfermedad;
    private int peso;
    private int estatura;
    
    public TESTCOVID(){
        
        this.edad=19;
        this.enfermedad=false;
        this.estatura=170;
        this.peso= 70;
        
        
    }
    public TESTCOVID(int edad, boolean enfermedad, int peso, int estatura){
        this.edad=edad;
        this.enfermedad=enfermedad;
        this.estatura=estatura;
        this.peso= peso;
        
    }
    public int getEdad(){
        return edad;   
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    
    
    public boolean getEnfermedad(){
        return enfermedad;   
    }
    public void setEnfermedad(boolean enfermedad){
        this.enfermedad= enfermedad;
    }
    
    
    public int getEstatura(){
        return estatura;   
    }
    public void setEstatura(int estatura){
        this.estatura= estatura;
    }
    
    
    public int getPeso(){
        return peso;   
    }
    public void setPeso(int peso){
        this.peso= peso
                ;
    }
    private double calcularIMC(){
        double mts= estatura/ 100.0;
        return peso/(mts*mts);
    }
    public String calcularPersonaRiesgo(){
        if(edad>=65 || true == enfermedad || calcularIMC()>30){
       return "persona de riesgo";
       
    }else
            return "no eres persona de riesgo";
        
    }
}
    

