/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_libro_p18;

/**
 *
 * @author aleja
 */
public class LIBRO extends materialBibliografico{
    private String genero;
    private AUTOR autor;

    public LIBRO() {
        super();
        this.genero = "----";
        this.autor=new AUTOR();
    }
    public LIBRO(String genero, String titulo, int anoPublicacion) {
        super(titulo, anoPublicacion);
        this.genero = genero;
        this.autor=new AUTOR();
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public AUTOR getAutor() {
        return autor;
    }

    public void setAutor(AUTOR autor) {
        this.autor = autor;
    }
    public String toString(){
        return "DATOS DEL MATERIAL BIBLIOGRAFICO\n"+
                "TITULO: "+super.getTitulo()+"\n"+
                "AÑO DE PUBLICACION:"+ super.getAnoPublicacion()+"\n"+
                "GENERO DEL LIBRO: "+ genero+"\n"+
                "NOMBRE DEL AUTOR: "+autor.getNombre()+"\n"+
                "NACIONALIDAD: "+ autor.getNacionalidad();
    }
   
}
