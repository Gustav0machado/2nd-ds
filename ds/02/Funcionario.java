
class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    Funcionario(String nome, double salarioBruto, double imposto) {
        nome = nome;
        salarioBruto = salarioBruto;
        imposto = imposto;
    }

    double salarioLiquido() {
        return salarioBruto - imposto;
    }

    void aumentaSalario(double aumento) {
        salarioBruto += aumento;
    }
}


