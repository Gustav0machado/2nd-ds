package jogo;


public class JogoFisico extends Jogo{
	private int quantJogadores;
	private double tmpPart;
	
public JogoFisico(String nome,double preco, String distribuidora, int quantJogadores,double tmpPart) {
	super(nome, preco, distribuidora);
	this.quantJogadores=quantJogadores;
	this.tmpPart=tmpPart;
	
}

		public int getQuantJogadores() {
			return quantJogadores;
		}
		
		public void setQuantJogadores(int quantJogadores) {
			this.quantJogadores = quantJogadores;
		}
		
		public double getTmpPart() {
			return tmpPart;
		}
		
		public void setTmpPart(double tmpPart) {
			this.tmpPart = tmpPart;
		}
		
		public double calcularTempoTotal(int quantidadePartidas) {
	        return tmpPart * quantidadePartidas;
	    }


	@Override
	public void exibirinformacoes() {
		super.exibirinformacoes();
		System.out.println("Quantidade de jogadores :"+getQuantJogadores());
		System.out.println("tempo de partida :"+getTmpPart());
	}
	

	
}
