
public class Cliente {
	private String name;
	private  int idade;
	private String endereco;
	private double valPe;
	private double valPro;
	
	 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getValPe() {
		return valPe;
	}
	
	public void setValPe(double valPe) {
		this.valPe = valPe;
	}
	
	public double getValPro() {
		return valPro;
	}
	
	public void setValPro(double valPro) {
		this.valPro = valPro;
	}
	
	public double calcDesc() {
		
		return valPro=valPe*0.10  ;
		 			 
	}
	public double valCDesc() {
		
		return valPro = valPe -(valPe*0.10)  ;
		 			 
	}
	 ;

	
	
}
