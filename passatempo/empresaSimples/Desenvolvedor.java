

public class Desenvolvedor extends Funcionario {
    
	private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, int idade, String linguagemPrincipal) {
        super(nome, salario, idade);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double calcularBonus() {
        double bonus = super.calcularBonus(); // 5% do salário como base
        bonus += getSalario() * 0.03; // Adicional de 3% por ser desenvolvedor
        return bonus;
    }

    public double calcularBonus(double percentual, int projetosCompletados) {
        double bonus = super.calcularBonus(percentual); // Bônus baseado no percentual fornecido
        bonus += getSalario() * 0.01 * projetosCompletados; // Adicional de 1% por projeto completado
        return bonus;
    }
    
    @Override
    public double calcularSalarioComBonus() {
        return getSalario() + calcularBonus(); // Salário com bônus padrão
    }

}
