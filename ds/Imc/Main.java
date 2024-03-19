import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("digite seu nome ");
		String nome = in.nextLine();
		
		System.out.println("digite sua idade");
		int idade= in.nextInt();
		
		System.out.println("digite seu peso");
		double peso = in.nextDouble();
		
		System.out.println("digite sua altura em metros");
		double altura= in.nextDouble();
		
		Usuario pessoa= new Usuario(nome,idade,peso,altura);
		double imc=pessoa.calcImc();
		System.out.printf("%s, seu Imc é: %.2f%n", nome, imc);
		in.close();
	}

}
