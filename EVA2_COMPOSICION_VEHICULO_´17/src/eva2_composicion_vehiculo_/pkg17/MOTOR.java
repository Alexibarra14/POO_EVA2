/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_composicion_vehiculo_.pkg17;

/**
 *
 * @author aleja
 */
public class MOTOR {
    private int tipoMotor;
    private int potencia;
  
    public MOTOR() {
        this.tipoMotor = 0;//gasolina
        this.potencia = 0;
    }
    public MOTOR(int tipoMotor, int potencia) {
        this.tipoMotor = tipoMotor;
        this.potencia = potencia;
    }

    public int getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(int tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
