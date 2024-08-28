
public class Ain {
    public static void main(String[] args) {
        // Criando 2 instâncias de Carro
        Carro carro1 = new Carro("Honda Civic", 100000, "Preto", "Gasolina");
        Carro carro2 = new Carro("Toyota Corolla", 90000, "Branco", "Flex");
 
        // Criando 2 instâncias de Moto
        Moto moto1 = new Moto("Honda CG", 12000, "Vermelho", "Gasolina");
        Moto moto2 = new Moto("Yamaha Fazer", 15000, "Azul", "Flex");
 
        // Imprimindo a ficha técnica de cada veículo
        carro1.imprimirFicha();
        carro2.imprimirFicha();
        moto1.imprimirFicha();
        moto2.imprimirFicha();
    }
}
