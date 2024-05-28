
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jair", 5000.0, 30);
        Gerente gerente = new Gerente("Messias", 8000.0, 40, "Vendas");
        Desenvolvedor desenvolvedor = new Desenvolvedor("bosonaro", 7000.0, 28, "Java");
        
        System.out.println("Salario do Funcionario:" + funcionario.getSalario());
        System.out.println("Bonus do Funcionario:");
        System.out.println("Bonus padrão: " + funcionario.calcularBonus());
        System.out.println("Bonus com percentual: " + funcionario.calcularBonus(7.5));
        System.out.println("Salário com bônus padrao: " + funcionario.calcularSalarioComBonus());
        
        System.out.println("\nSalario do Gerente:" + gerente.getSalario());
        System.out.println("Bonus do Gerente:");
        System.out.println("Bonus padrão: " + gerente.calcularBonus());
        System.out.println("Bonus com metas atingidas: " + gerente.calcularBonus(12.5, true));
        System.out.println("Bonus sem metas atingidas: " + gerente.calcularBonus(12.5, false));
        System.out.println("Salário com bônus padrao: " + gerente.calcularSalarioComBonus());
        
        System.out.println("\nSalario do desenvolvedor:" + desenvolvedor.getSalario());
        System.out.println("Bonus do Desenvolvedor:");
        System.out.println("Bonus padrão: " + desenvolvedor.calcularBonus());
        System.out.println("Bonus com projetos completados: " + desenvolvedor.calcularBonus(9, 3));
        System.out.println("Salário com bônus padrao: " + desenvolvedor.calcularSalarioComBonus());
    }
}

