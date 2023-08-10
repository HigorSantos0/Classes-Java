package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Data date = new Data();
		
		System.out.println("Inicializando a primeira data!");
		
		System.out.println("Entre com o dia: ");
		date.dia = entrada.nextInt();
		System.out.println("Entre com o mes: ");
		date.mes = entrada.nextInt();
		System.out.println("Entre com o ano: ");
		date.ano = entrada.nextInt();
		
		Data date2 = new Data();
		
		System.out.println("Inicializando a segunda data!");
		 
		System.out.println("Entre com o dia: ");
		date2.dia = entrada.nextInt();
		System.out.println("Entre com o mes: ");
		date2.mes = entrada.nextInt();
		System.out.println("Entre com o ano: ");
		date2.ano = entrada.nextInt();
		
		//System.out.printf("Primeira data %s\n", date.obterDataFormatada());
		String dataFormatada1 = date.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.println(date2.obterDataFormatada());
		
		date.imprimirDataFormatada();
		date2.imprimirDataFormatada();
		
		
		
		entrada.close();
	}
}
