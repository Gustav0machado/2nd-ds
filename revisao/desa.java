package revisao;
import java.util.*;
public class desa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o ano de nascimento:");
            int anoNascimento = scanner.nextInt();
            
            System.out.println("Digite o ano atual:");
            int anoAtual = scanner.nextInt();
           
            int idade = anoAtual - anoNascimento;
            System.out.println(" ");
            System.out.println("Você tem " + idade + " anos.");
            
            if (idade >= 18) {System.out.println(" ");
                System.out.println("Você é maior de idade.");
            } else {System.out.println(" ");
                System.out.println("Você é menor de idade.");
            }
            
            System.out.println(" ");
            // Pergunta se deseja calcular a idade de mais uma pessoa
            System.out.println("Deseja calcular a idade de mais uma pessoa? (Sim/Não)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")) {
            
            }
            // Se a resposta for diferente de sim, encerra o loop	
            else {  
            	break;
            	}
            
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}

