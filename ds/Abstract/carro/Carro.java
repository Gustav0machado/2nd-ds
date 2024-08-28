
class Carro extends Veiculo {
 
    public Carro(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
        calculaIpva();
    }
 
    @Override
    public void calculaIpva() {
        setIpva(getValorTabela() * 0.04);
    }
}
 