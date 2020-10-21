package excecoes;

import java.util.Scanner;

public class NomeDoMes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número do mês: ");
	
		try {
			Mes mes = new Mes(teclado.nextInt());
			System.out.println("Nome do mês: " + mes.getNome());
		} catch (MesInvalidoException e) {
			
			System.out.println(e.getMessage());
			
		}
		teclado.close();
		System.out.println("fim");
	}
}
