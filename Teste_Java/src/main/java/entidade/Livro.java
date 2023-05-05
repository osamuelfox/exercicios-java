
package entidade;

public class Livro {
    
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    private int numCopias;

    public Livro(String titulo, String autor, String editora, int ano, int numCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.numCopias = numCopias;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public String toString() {
        return "Título: " + titulo + 
                ", Autor: " + autor + 
                ", Editora: " + editora +
                ", Ano: " + ano +
                ", Numero da copias: " + numCopias;
    }
}
