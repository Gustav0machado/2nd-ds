import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario pedro = new Funcionario("Pedro", 3000.0, 300.0);
        Funcionario vagner = new Funcionario("Vagner", 4000.0, 500.0);

        System.out.println("Informe o aumento para Pedro:");
        double aumentoPedro = scanner.nextDouble();
        pedro.aumentaSalario(aumentoPedro);

        System.out.println("Informe o aumento para Vagner:");
        double aumentoVagner = scanner.nextDouble();
        vagner.aumentaSalario(aumentoVagner);

        System.out.println("Salário líquido de Pedro após aumento: " + pedro.salarioLiquido());
        System.out.println("Salário líquido de Vagner após aumento: " + vagner.salarioLiquido());

        scanner.close();
    }
}
