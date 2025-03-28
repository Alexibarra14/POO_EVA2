/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_composicion_p16;

/**
 *
 * @author aleja
 */
public class DIRECCION {
    private String calle;
    private int numeroCasa;
    private String colonia;
    private String ciudad;
    private String estado;

    public DIRECCION() {
        this.calle = "----";
        this.numeroCasa = 0;
        this.colonia = "-----";
        this.ciudad = "-----";
        this.estado = "-----";
    }
    public DIRECCION(String calle, int numeroCasa, String colonia, String ciudad, String estado) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
