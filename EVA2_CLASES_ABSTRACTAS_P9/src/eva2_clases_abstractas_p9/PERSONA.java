/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_clases_abstractas_p9;

/**
 *
 * @author aleja
 */
public  abstract class  PERSONA {
    private String nombre;
    private String apellido;
    private int edad;

    
      public PERSONA() {
        this.nombre = "-----";
        this.apellido = "-----";
        this.edad = 0;
    }
    public PERSONA(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //METODO ABSTRACTO: Es un contrato para las clases
    //Que hereden de persona. Estan obligadas a implementarlo con codigo
    public abstract void imprimirDatos();
    
}
