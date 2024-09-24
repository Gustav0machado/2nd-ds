import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        // Criando o catálogo
        ArrayList<Conteudo> catalogo = new ArrayList<>();
 
        // Adicionando filmes e séries ao catálogo
        catalogo.add(new Filmes("Homem Formiga", 140));
        catalogo.add(new Filmes("O Senhor dos Anéis", 180));
        catalogo.add(new Filmes("Vingadores", 160));
        catalogo.add(new Filmes("Interestelar", 169));

        catalogo.add(new Series("Breaking Bad", 45, 62, 5));
        catalogo.add(new Series("Stranger Things", 50, 34, 4));
        catalogo.add(new Series("Friends", 22, 236, 10));
        catalogo.add(new Series("Game of Thrones", 60, 73, 8));
        catalogo.add(new Filmes("A Origem", 148));
        catalogo.add(new Series("The Office", 22, 201, 9));

      
        for (Conteudo conteudo : catalogo) {
            conteudo.descricao();
        }
    }
}
