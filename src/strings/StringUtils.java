package strings;

import java.util.Arrays;


public class StringUtils {
	
	
		// Letra A
		public static String formataAtributo(String novoNomeAtributo) {
			
			String [] valor = novoNomeAtributo.split(" ");
			
			String novo = valor[0];
			
			for(int i = 1; i < valor.length; i++) {
				
				novo += valor[i].substring(0,1).toUpperCase().concat(valor[i].substring(1));
				
					}
			
			
			return novo;
		}
		
		// Letra B
		public static String formataMetodo(String novoNomeMetodo) {
					
			String [] valor = novoNomeMetodo.split(" ");
					
			String nomeMetodo = valor[0];
					
			for(int i = 1; i < valor.length; i++) {
						
				nomeMetodo += valor[i].substring(0,1).toUpperCase().concat(valor[i].substring(1));
						
					}
			
			return nomeMetodo;
				}
		// Letra C
		public static String formataClasse(String novoNomeClasse) {
			
			String [] valor = novoNomeClasse.split(" ");
			
			String nomeClasse = "";
			
			for(int i = 0; i < valor.length; i++) {
				
				nomeClasse += valor[i].substring(0,1).toUpperCase().concat(valor[i].substring(1));
				
			}
			
			return nomeClasse;
		}
		// Letra D
		public static String ordenaStrings(String palavra1, String palavra2) {
			
			String palavras[] = new String [2];
			
			palavras[0] = palavra1;
			palavras[1] = palavra2;
			
			Arrays.sort(palavras);
			
			String saida = palavras[0] + " " + palavras[1];
			
			return saida;
		}
		
		// Letra E
		
		public static boolean ehPalindromo(String palavra) {
			
			String palavraInicial = palavra;
			int tamanho = palavra.length() - 1;
			String palindromo = "";
			
			for(int i = tamanho; i >= 0 ; i --) {
				
				palindromo += palavraInicial.charAt(i);
			}
			
			if(palavraInicial.equalsIgnoreCase(palindromo)) {
				
				return true;
			}else {
				return false;
			}
			
			
			
		}
		// Letra F
		public static String transformaParaCaixaAlta(String frase) {
			
			String novaFrase = frase.toUpperCase();
			
			return novaFrase;
			
		}
		
		// Letra G
		
		public static int contaVogais(String frase) {
			
			int num = 0;
			
			if(frase.toLowerCase().contains("a")) {
				num += 1;
			}
			
			if(frase.toLowerCase().contains("e")) {
				num += 1;
			}
			
			if(frase.toLowerCase().contains("i")) {
				num += 1;
			}
			
			if(frase.toLowerCase().contains("o")) {
				num += 1;
			}
			
			if(frase.toLowerCase().contains("u")) {
				num += 1;
			}
			
			return num;
		}
		// Letra H
		public static String removeEspacosSuperfluos(String frase) {
			
			// \\s+ serve para remover sequencias em branco. 
			String fraseInicial = frase.replaceAll("\\s+"," ");
			fraseInicial = fraseInicial.trim();
			
			return fraseInicial;
		}
		
		// Letra I
		
		public static int [] ocorrencias(String frase, String subPalavra) {
			
			String sub = subPalavra;
			String [] palavras = frase.split(" ");
			
			int contador = 0;
		    for(String nome : palavras){
				
				if(nome.contains(sub)){
					
					contador += 1;
					
				} 
			}
		   
			int [] tamanho = new int [contador];
			int j = 0;
			
			for(int i = 0; i < tamanho.length; i++) {
				
				tamanho[i] = frase.indexOf(sub,j);
				j = frase.indexOf(sub,j)+1;
			}
			
			return tamanho;
				
		}
		
			
		
		// Letra J
		public static int binarioPraDecimal(String binario) {
			
			String numero = binario;
			int valor = numero.length()-1;
			int soma = 0;
			int potencia = 0;
			for(int i = valor; i >= 0 ; i--) {
				
				if(numero.charAt(i) == '1') {
					
					soma+= Math.pow(2, potencia);
					
				}else {
					soma+=0;
				}
				
				potencia+=1;
			}
	
			
			return soma;
		}
		
		// Letra K
		
		public static int getQtdadePalavras(String frase) {
			
			String [] tamanho = frase.split(" ");
			
			return tamanho.length;
			
		}
		
		public static int[] histogramaLetras(String texto){
			
			int [] alfabeto = new int [26];
			int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,j = 0,k = 0,l = 0,m = 0,
					n = 0,o = 0,p = 0,q = 0,r = 0,s = 0,t = 0,u = 0,v = 0,w = 0,x = 0,y = 0,z = 0;
			
			for(int ctd = 0; ctd < texto.length(); ctd++) {
				
				if(texto.toLowerCase().charAt(ctd) == 'a') {
					alfabeto[0] += 1;	
				}else if(texto.toLowerCase().charAt(ctd) == 'b') {
					alfabeto[1] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'c') {
					alfabeto[2] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'd') {
					alfabeto[3] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'e') {
					alfabeto[4] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'f') {
					alfabeto[5] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'g') {
					alfabeto[6] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'h') {
					alfabeto[7] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'i') {
					alfabeto[8] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'j') {
					alfabeto[9] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'k') {
					alfabeto[10] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'l') {
					alfabeto[11] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'm') {
					alfabeto[12] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'n') {
					alfabeto[13] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'o') {
					alfabeto[14] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'p') {
					alfabeto[15] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'q') {
					alfabeto[16] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'r') {
					alfabeto[17] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 's') {
					alfabeto[18] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 't') {
					alfabeto[19] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'u') {
					alfabeto[20] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'v') {
					alfabeto[21] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'w') {
					alfabeto[22] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'x') {
					alfabeto[23] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'y') {
					alfabeto[24] += 1;
				}else if(texto.toLowerCase().charAt(ctd) == 'z') {
					alfabeto[25] += 1;
				}else {
					continue;
				}
				
				
			}
			
			return alfabeto;
		}
	
		
		
		
}
		
		

	

