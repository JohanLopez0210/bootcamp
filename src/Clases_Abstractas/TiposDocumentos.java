package Clases_Abstractas;

public class TiposDocumentos {
    public static void main(String[] args) {
        Curriculum curr = new Curriculum("Johan Lopez", new String[] {"Java", "SQL", "Spring"});
        LibroPDF libro = new LibroPDF("Gabriel Garcia Marquez", "Cien Años de Soledad", "Ficción", 500);
        Informe informe = new Informe("Este es un informe sobre...", "Luz Vargas", 10);

        imprimirDocumento(curr);
        imprimirDocumento(libro);
        imprimirDocumento(informe);
    }

    public static void imprimirDocumento(Imprimible doc) {
        doc.imprimir();
    }
}

interface Imprimible {
    void imprimir();
}

class Curriculum implements Imprimible {
    String nombre;
    String[] habilidades;

    public Curriculum(String nombre, String[] habilidades) {
        this.nombre = nombre;
        this.habilidades = habilidades;
    }

    public void imprimir() {
        System.out.println("Curriculum de: " + nombre);
        System.out.println("Habilidades: " + String.join(", ", habilidades));
    }
}

class LibroPDF implements Imprimible {
    String autor;
    String titulo;
    String genero;
    int paginas;

    public LibroPDF(String autor, String titulo, String genero, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
    }

    public void imprimir() {
        System.out.println("Libro PDF: " + titulo + " de " + autor + ", Género: " + genero + ", Páginas: " + paginas);
    }
}

class Informe implements Imprimible {
    String texto;
    String autor;
    int paginas;

    public Informe(String texto, String autor, int paginas) {
        this.texto = texto;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void imprimir() {
        System.out.println("Informe por " + autor + ", Páginas: " + paginas + ", Contenido: " + texto);
    }
}
