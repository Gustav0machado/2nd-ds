package jogo;

import java.util.*;
	public class Ain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digite os dados para Jogo Eletronico:");
        System.out.print("Nome: ");
        
        String nomeEletronico = scanner.nextLine();
        System.out.print("Preço: ");
        
        double precoEletronico = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Distribuidora: ");
        String distribuidoraEletronico = scanner.nextLine();
        System.out.print("Plataforma: ");
        String plataforma = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Quantidade de Jogadores para jogar online: ");
        int quantidadeJogadoresOnline = scanner.nextInt();
        
        JogoEletronico jogoEletronico1 = new JogoEletronico(nomeEletronico, precoEletronico, distribuidoraEletronico, plataforma, genero);
        jogoEletronico1.exibirinformacoes();
        jogoEletronico1.jogarOnline(quantidadeJogadoresOnline);
 
        System.out.println("\nDigite os dados para Jogo Físico:");
        scanner.nextLine();
        System.out.print("Nome: ");
        
        String nomeFisico = scanner.nextLine();
        System.out.print("Preço: ");
        
        double precoFisico = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Distribuidora: ");
        
        String distribuidoraFisico = scanner.nextLine();
        System.out.print("Quantidade de Jogadores: ");
        
        int quantidadeJogadores = scanner.nextInt();
        System.out.print("Tempo de Partida (em horas): ");
        
        double tempoPartida = scanner.nextDouble();
        System.out.print("Quantidade de Partidas: ");
        
        int quantidadePartidas = scanner.nextInt();
        
        JogoFisico jogoFisico1 = new JogoFisico(nomeFisico, precoFisico, distribuidoraFisico, quantidadeJogadores, tempoPartida);
        jogoFisico1.exibirinformacoes();
        
        double tempoTotal = jogoFisico1.calcularTempoTotal(quantidadePartidas);
        System.out.println("Tempo total de jogo: " + tempoTotal + " horas");
 
        scanner.close();
    }
}