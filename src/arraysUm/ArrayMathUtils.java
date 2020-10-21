package arraysUm;

public class ArrayMathUtils {
	
	
	// Questão 1
	// Letra A 
	public static int[] calculaDivisores(int num) {
		
		int numDivisores = 0;
		int contador = 1;
		
		while(contador <= num) {
			
			if(num % contador == 0) {
				numDivisores += 1;
			}
			contador += 1;	
		}
		
		int [] totalDivisores = new int [numDivisores];
		int j = 0;
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) {
				totalDivisores[j] = i;	
				j++;
			}
			
		}
		
		return totalDivisores;
	}
		
	// Letra B
	public static double computaMaior(double[] numeros){
		
		double maior = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] >= maior) {
				
				maior = numeros[i];
				
			}
				
				
		}
			
			
			
			return maior; 
		}
	
	// Letra C
	public static double computaMenor(double[] numeros) {
		
		double menor = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
			
		}
		
		return menor;
	}
	
	// Letra D
	public static double computaMedia(double[] numeros) {
		
		double soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			
			soma += numeros[i];
			
		}
		double mediaFinal = soma/numeros.length;
		
		
		return mediaFinal;
	}
	
	// Letra E
	public static boolean temNumRepetido(double[] numeros) {
		
		
		double contador1 = 0;
		double contador2 = 0;
		int repetido = 0;
		
		for(int i = 0; i < numeros.length - 1; i++) {
			contador1 = numeros[i];
			for(int j = i + 1; j < numeros.length; j++) {
				contador2 = numeros[j];
				if(contador1 == contador2) {
					
					repetido++;
				}
				
			}
			
		}
		if(repetido != 0) {
			return true;
		}else {
			return false;
		}
			
	}
		
	
	
	// Letra F
	public static int[][] somaMatrizes(int[][] m1, int[][] m2){
		
		int [][] soma = new int [m1.length][m2.length];
		
		for(int i = 0; i < m1.length-1; i++) {
			for(int j = 0; j < m2.length-1; j++) {
				
				soma[i][j] = m1[i][j] + m2[i][j];
				
			}
			
		}
	
		return soma;
	}
	
	
		
		
		
	

}
