
public class Usuario {
String nome;
int idade;
double peso;
double altura;

	 public Usuario(String nome, int idade, double peso, double altura){
		 this.nome=nome;
		 this.idade=idade;
		 this.peso=peso;
		 this.altura=altura;
	 }
	 public double calcImc() {
		 return peso/(altura*altura);
	 }
	 


}
