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
public class EMPLEADO extends PERSONA{
private int clave;

public EMPLEADO() {
super();
}

public EMPLEADO(int clave,String nombre, String apellido, int edad) {
super(nombre, apellido, edad);
this.clave=clave;
}

public int getClave() {
return clave;
}

public void setClave(int clave) {
this.clave = clave;
}
@Override
public void imprimirDatos(){
System.out.println("clave:"+clave);
super.imprimirDatos();
}

}