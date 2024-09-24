
public class Filmes extends Conteudo {
    private int duracao;
 
    // Construtor
    public Filmes(String titulo, int duracao) {
        super("Filme", titulo);
        this.duracao = duracao;
    }
 
    // Getter e Setter para duração
    public int getDuracao() {
        return duracao;
    }
 
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
 
    // Sobrescrevendo o método descricao
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", Título: " + getTitulo() + ", Duração: " + duracao + " minutos");
    }
}
