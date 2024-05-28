
public class Livro extends Publicacao {
	 private int numPag;
	 private String editora;
	 
	 
	public Livro(String titulo,String autor,int anoPubli,int numPag,String editora) {
		super(titulo,autor,anoPubli);
		this.numPag=numPag;
		this.editora=editora;
		
	}


	public int getNumPag() {
		return numPag;
	}


	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	@Override
	public String exibirDetalhes() {
		return super.exibirDetalhes()+" tem "+getNumPag()+" paginas e a editora é "+getEditora();
		
	}

	
	
	
}
