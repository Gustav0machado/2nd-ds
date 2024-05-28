
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Livro livro=new Livro("sla algum livro "," autor ", 2012 , 550 ," editora ");
		 System.out.println(livro.exibirDetalhes());
		 
		 Revista revista = new Revista("vogue","alguem",2024,163,"março");
		 System.out.println(revista.exibirDetalhes());
	}

}
