
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Cliente cliente = new Cliente();
		
		cliente.setEndereco("Vila chuca");
		cliente.setIdade(57);
		cliente.setName("Jhon");
		cliente.setValPe(1500);
		
		System.out.println("O cliente: "+cliente.getName()+" , o valor total era "+cliente.getValPe()+" mas com "+cliente.calcDesc()+" de desconto ficará "+cliente.valCDesc()+" , sua idade "+cliente.getIdade()+" e seu endereço "+cliente.getEndereco());
		
		ClientePremium cliente1 = new ClientePremium();
		
		cliente1.setEndereco("Vila chaves");
		cliente1.setIdade(71);
		cliente1.setName("Chico Moedas");
		cliente1.setValPe(1500);
		
		System.out.println("O cliente premium: "+cliente1.getName()+" , o valor total era "+cliente1.getValPe()+" mas com "+cliente1.calcDesc()+" de desconto ficará "+cliente1.valCDesc()+" , sua idade "+cliente1.getIdade()+" e seu endereço "+cliente1.getEndereco());
	}

}
