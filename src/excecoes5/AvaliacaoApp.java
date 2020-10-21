package excecoes5;

import java.util.Scanner;

public class AvaliacaoApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		boolean nota1Ok = false;
		boolean nota2Ok = false;
		while(!nota1Ok) {
			System.out.print("Digite nota do est�gio 1: ");
			try {
				avaliacao.setNota1(teclado.nextDouble());
				nota1Ok = true;
				
			}catch (NotaInvalidaException e) {
				System.out.println(e.getMessage());
			}
		}
		while(!nota2Ok) {
			System.out.print("Digite nota do est�gio 2: ");
			try {
				avaliacao.setNota2(teclado.nextDouble());
				nota2Ok = true;
				
			}catch (NotaInvalidaException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("M�dia: " + avaliacao.getMedia());
		teclado.close();
	}
}