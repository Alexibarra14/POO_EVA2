/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_libro_p18;

/**
 *
 * @author aleja
 */
public class EVA2_LIBRO_P18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LIBRO libro= new LIBRO();
        System.out.println(libro);
        libro.setAnoPublicacion(2005);
        libro.setTitulo("DRACULA");
        libro.setGenero("DRAMA");
        AUTOR autor = new AUTOR("ALEJANDRO", "MEXICANA");
        libro.setAutor(autor);
        System.out.println(libro);
    }
    
}
