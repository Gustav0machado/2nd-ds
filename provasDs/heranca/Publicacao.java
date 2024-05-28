
public class Publicacao {

	private String titulo;
	private String autor;
	private int anoPubli;
	
	public Publicacao(String titulo,String autor,int anoPubli) {
		this.autor=autor;
		this.titulo=titulo;
		this.anoPubli=anoPubli;
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

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}
	
	public String exibirDetalhes() {
		return "o nome é "+titulo+", o autor é " + autor+" e foi publicada em " + anoPubli+" ";
	}
	
}
