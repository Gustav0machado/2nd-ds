
class Moto extends Veiculo {
 
    public Moto(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
        calculaIpva();
    }
 
    @Override
    public void calculaIpva() {
        setIpva(getValorTabela() * 0.02);
    }
}
