package classe;

public class Data {
	
	//String dia, mes, ano;
	int dia, mes, ano;
	
	String obterDataFormatada() {
		
		//return dia + mes + ano; jeito que eu fiz
		//Jeito do professor abaixo
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
	

}
