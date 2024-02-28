package revisao;
import java.util.*;

public class matriz {
    public static void main(String[] args) {
        final int NA = 3;
        final int NN = 4;
        Scanner in = new Scanner(System.in);
        int aluno; 
        double[][] notas = new double[NA][NN];

        for (aluno= 0; aluno < NA; aluno++) {
            System.out.println("Digite as notas do Aluno " + (aluno + 1) + ":");
            for (int nota = 0; nota < NN; nota++) {
                System.out.print("Nota " + (nota + 1) + ": ");
                notas[aluno][nota] = in.nextDouble();
            }
        }

        // Exibição das notas dos alunos
        System.out.println("\nNotas dos alunos:");
        for (aluno=0; aluno < NA; aluno++) {
            System.out.print("Aluno " + (aluno + 1) + " Notas: ");
            for (int nota = 0; nota < NN; nota++) {
                System.out.print(notas[aluno][nota]);
                if (nota <NN - 1) {
                    System.out.print(" ; ");
                }
            }
            System.out.println();
        } in.close();

       
    }
}

