package jogo;


public class Ain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JogoEletronico jogo1 = new JogoEletronico("Mario Card ", 12," Sony"," Trovo"," Ação");
		jogo1.exibirinformacoes();
		jogo1.jogarOnline(8);
		
		System.out.println(" ");
		
		JogoFisico jogo2 = new JogoFisico ("Mario kart ",235, " nintendo ",453,13,24);
		jogo2.exibirinformacoes();
		jogo2.calcularTempoTotal();
	}

}
