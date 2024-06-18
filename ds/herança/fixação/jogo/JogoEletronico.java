package jogo;

public class JogoEletronico extends Jogo {
	private String plataforma;
	private String genero;
	
	public JogoEletronico(String nome,double preco, String distribuidora,String plataforma,String genero) {
		super(nome, preco, distribuidora);
		this.genero=genero;
		this.plataforma=plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void jogarOnline(int qtdJog){
		System.out.println("jogando online com "+qtdJog+" jogadores");
	}

	@Override
	public void exibirinformacoes() {
		super.exibirinformacoes();
		System.out.println("Plataforma :"+getPlataforma());
		System.out.println("Genero :"+getGenero());
	}
	

}
