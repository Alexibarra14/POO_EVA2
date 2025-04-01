/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_vehiculo_p20;

/**
 *
 * @author aleja
 */
public class VEHICULO {
   private String marca;
   private String modelo;
   private int año;
   private MOTOR motor;//¿QUE TIPO DE MOTOR QUIERES?

       public VEHICULO() {
        this.marca = "---";
        this.modelo = "---";
        this.año = 0;
        this.motor = null;///TODAVIA NO LO TENEMOS
    }
    public VEHICULO(String marca, String modelo, int año, MOTOR motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public MOTOR getMotor() {
        return motor;
    }

    public void setMotor(MOTOR motor) {
        this.motor = motor;
    }
   @Override
    public String toString(){
        String cade= "MARCA: "+marca+"\n"+
                "MODELO: "+ modelo+ "\n"+
                "AÑO: "+ año+ "\n"+
                "MOTOR: "+ motor.tipoMotor();
        return cade;
    }
   
}
