package arraysQuatro;

import java.util.Scanner;


public class JogoDaVelha {
	
	char [][] tabuleiro; 
	boolean vezJogador1;
	
	public JogoDaVelha(){
		
		this.tabuleiro =  new char [3][3];
		this.vezJogador1 = true;
		iniciarJogo();
		
	}
	
	void iniciarJogo() {
		
		Scanner entrada = new Scanner(System.in);
		
		
		while(detectaFimJogo()) {
		
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(tabuleiro[i][j] + " ");
				}
			System.out.println();
			}
			System.out.println("faça a jogada");
			int linha = entrada.nextInt();
			int coluna = entrada.nextInt();
			jogar(linha, coluna);
		}
		entrada.close();
			
	}
	boolean jogar(int linha, int coluna) {
		
		
		if(tabuleiro[linha][coluna] == '\u0000') {
			
			if(vezJogador1 && linha < tabuleiro.length && linha >= 0 && coluna < tabuleiro.length && coluna >= 0) {
				tabuleiro[linha][coluna] = 'X';
				vezJogador1 = false;
				detectaFimJogo();
			}else {
				tabuleiro[linha][coluna] = 'O';
				vezJogador1 = true;
				detectaFimJogo();
			}
		
		}else {
			System.out.println("jogada inválida");
			
		}
		
		
		if(detectaFimJogo()) {
			
			return true;
		}else {
			return false;
		}
	}
	
		
	
	boolean detectaFimJogo() {
		
		// Linhas
		if(tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][0] == tabuleiro[0][2]
				|| (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][0] == tabuleiro[1][2])
						|| (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][0] == tabuleiro[2][2])) {
			
			return true;
		}
		// Colunas
		else if(tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[0][0] == tabuleiro[2][0]
				|| (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[0][1] == tabuleiro[2][1])
				|| (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[0][2] == tabuleiro[2][2])) {
			
			
			return true;
		}
		// Diagonais
		else if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]
				|| (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0])) {
			
			return true;
			
		}
		else {
			
			int cont = 0;
			for(int i = 0; i <3; i++) {
				for(int k = 0; k < 3; k++) {
					
					if(tabuleiro[i][k] != '-') {
						cont += 1;
					}
					
				}
			}
			if(cont == 9) {
				return true;
			}
			else {
		
				return false;
			}
		
		
	}
}
}





























