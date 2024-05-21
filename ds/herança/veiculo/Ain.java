
public class Ain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		
		carro.setAno(1974);
		carro.setCor("Preto");
		carro.setMarca("volkswagen");
		carro.setModelo("Kombi");
		carro.setQntdportas(3);
		System.out.println("o carro é "+carro.getModelo()+" a marca é "+carro.getMarca()+" a cor é "+carro.getCor()+" o ano é "+carro.getAno()+" e tem "+carro.getQntdportas()+" portas");
	
		
		Moto moto = new Moto();
		
		moto.setAno(1900);
		moto.setCor("Verde");
		moto.setMarca("Honda");
		moto.setModelo("Pop 100");
		moto.setCilindradas(100);
		System.out.println("o Moto é "+moto.getModelo()+" a marca é "+moto.getMarca()+" a cor é "+moto.getCor()+" o ano é "+moto.getAno()+" e tem "+moto.getCilindradas()+" Cilindradas");
	
		
	
	
	
	
	
	
	
	
	}
	
	

}
