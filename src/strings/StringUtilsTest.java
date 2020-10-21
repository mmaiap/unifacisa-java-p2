package strings;

import java.util.Arrays;

public class StringUtilsTest {
	
	public static void main(String[] args) {
		
		// Letra A

		System.out.println(StringUtils.formataAtributo("matheus maia"));
		
		// Letra B

		System.out.println(StringUtils.formataMetodo("buzinar carro"));
		
		// Letra C

		System.out.println(StringUtils.formataClasse("loja de carros"));
		
		// Letra D

		System.out.println(StringUtils.ordenaStrings("volkswagen", "chery"));
		
		// Letra E
		System.out.println(StringUtils.ehPalindromo("arara"));
		
		// Letra F
		
		System.out.println(StringUtils.transformaParaCaixaAlta("PhUlaNo dEtHal"));
		
		// Letra G

		System.out.println(StringUtils.contaVogais("In God We Trust"));
		
		// Letra H

		System.out.println(StringUtils.removeEspacosSuperfluos(" Hay que     endurecerse, pero sin perder la ternura jamás "));
		
		// Letra I

		System.out.println(Arrays.toString(StringUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce")));
		
		// Letra J

		System.out.println(StringUtils.binarioPraDecimal("101"));
		
		// Letra K

		System.out.println(StringUtils.getQtdadePalavras("programar é muito fácil"));
		
		// Letra L

		System.out.println(Arrays.toString(StringUtils.histogramaLetras("the quick brown fox jumps over the lazy dog")));
		
		
	}

}
