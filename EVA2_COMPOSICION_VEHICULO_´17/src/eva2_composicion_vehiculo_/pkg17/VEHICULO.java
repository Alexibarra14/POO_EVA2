/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_composicion_vehiculo_.pkg17;

/**
 *
 * @author aleja
 */
public class VEHICULO {
    private String marca;
    private String modelo;
    private int año;
    private MOTOR motor;
  
     public VEHICULO() {
        this.marca = "---";
        this.modelo = "----";
        this.año = 0;
        this.motor= new MOTOR();
    }
    public VEHICULO(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor= new MOTOR();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public MOTOR getMotor() {
        return motor;
    }

    public void setMotor(MOTOR motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    @Override
    public String toString(){
        return "DATOS DEL VEHICULO:\n"+
                "MARCA: " + marca+"\n"+
                "MODELO: "+ modelo+"\n"+
                "AÑO: "   +año+"\n"+
                "TIPO DE MOTOR: "+motor.getTipoMotor()+"\n"+
                "POTENCIA: "+ motor.getPotencia();
    }
    
}
