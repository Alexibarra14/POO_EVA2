/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package eva2_sobreesctritura_p6;

/**
*
* @author invitado
*/
public class PERSONA {
private String nombre;
private String apellido;
private int edad;

public PERSONA() {
this.nombre = "---";
this.apellido = "---";
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

public void imprimirDatos(){
System.out.println("NOMBRE: "+nombre);
System.out.println("APELLIDO: "+apellido);
System.out.println("EDAD: "+edad);
}
}