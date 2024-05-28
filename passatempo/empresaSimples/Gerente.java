
public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, int idade, String departamento) {
        super(nome, salario, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        double bonus = super.calcularBonus(); // 5% do salário como base
        bonus += getSalario() * 0.05; // Adicional de 5% por ser gerente
        return bonus;
    }

    public double calcularBonus(double percentual, boolean atingiuMetas) {
        double bonus = super.calcularBonus(percentual); // Bônus baseado no percentual fornecido
        if (atingiuMetas) {
            bonus += getSalario() * 0.05; // Adicional de 5% se atingiu metas
        }
        return bonus;
    }
    
    @Override
    public double calcularSalarioComBonus() {
        return getSalario() + calcularBonus(); // Salário com bônus padrão
    }
}
