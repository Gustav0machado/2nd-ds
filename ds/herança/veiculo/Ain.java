
public class Ain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		
		carro.setAno(1974);
		carro.setCor("Preto");
		carro.setMarca("volkswagen");
		carro.setModelo("Kombi");
		carro.setQntdportas(3);
		System.out.println("o carro � "+carro.getModelo()+" a marca � "+carro.getMarca()+" a cor � "+carro.getCor()+" o ano � "+carro.getAno()+" e tem "+carro.getQntdportas()+" portas");
	
		
		Moto moto = new Moto();
		
		moto.setAno(1900);
		moto.setCor("Verde");
		moto.setMarca("Honda");
		moto.setModelo("Pop 100");
		moto.setCilindradas(100);
		System.out.println("o Moto � "+moto.getModelo()+" a marca � "+moto.getMarca()+" a cor � "+moto.getCor()+" o ano � "+moto.getAno()+" e tem "+moto.getCilindradas()+" Cilindradas");
	
		
	
	
	
	
	
	
	
	
	}
	
	

}
