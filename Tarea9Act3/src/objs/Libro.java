package objs;

public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int n_pag;
	
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getN_pag() {
		return n_pag;
	}
	
	public void setN_pag(int n_pag) {
		this.n_pag = n_pag;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + "  con ISBN:" + ISBN + ", creado por el autor " + autor + " tiene " + n_pag + " paginas";
	}
	
	
	
}
