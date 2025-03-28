/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_libro_p18;

/**
 *
 * @author aleja
 */
public class materialBibliografico {
    private String titulo;
    private int anoPublicacion;
 
    
        public materialBibliografico() {
        this.titulo = "----";
        this.anoPublicacion = 0;
    }
    public materialBibliografico(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    
}
