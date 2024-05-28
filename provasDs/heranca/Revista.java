
public class Revista extends Publicacao {
	private int numEdicao;
	private String mesEdicao;
	
	public Revista(String titulo,String autor,int anoPubli,int numEdicao,String mesEdicao) {
		super(titulo,autor,anoPubli);
		this.mesEdicao=mesEdicao;
		this.numEdicao=numEdicao;
		
	}

	public int getNumEdicao() {
		return numEdicao;
	}

	public void setNumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}

	public String getMesEdicao() {
		return mesEdicao;
	}

	public void setMesEdicao(String mesEdicao) {
		this.mesEdicao = mesEdicao;
	}

	@Override
	public String exibirDetalhes() {
		return super.exibirDetalhes()+" a edicao é "+ getNumEdicao()+" e foi publicada em "+getMesEdicao();
		
	}
	

}
