
public class Funcionario {
	private String nome;
	private double salario;
	private int idade;
	
	public Funcionario(String nome, double salario, int idade) {
	        this.nome = nome;
	        this.salario = salario;
	        this.idade = idade;
	}
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public double calcularBonus() {
			return salario*0.05;
		}
		public double calcularBonus(double percentual) {
			return salario*(percentual/100);
		}
		public double calcularSalarioComBonus() {
	        return salario + calcularBonus(); // Salário com bônus padrão
	    }

}
