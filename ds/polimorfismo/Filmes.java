
public class Filmes extends Conteudo {
    private int duracao;
 
    // Construtor
    public Filmes(String titulo, int duracao) {
        super("Filme", titulo);
        this.duracao = duracao;
    }
 
    // Getter e Setter para dura��o
    public int getDuracao() {
        return duracao;
    }
 
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
 
    // Sobrescrevendo o m�todo descricao
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", T�tulo: " + getTitulo() + ", Dura��o: " + duracao + " minutos");
    }
}
