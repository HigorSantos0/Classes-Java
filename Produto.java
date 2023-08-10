package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		 return preco * (1 - desconto);
	}
	// ou 
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		
	}
}
