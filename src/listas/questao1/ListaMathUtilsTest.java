package listas.questao1;


import java.util.Arrays;



public class ListaMathUtilsTest {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(ListaMathUtils.calculaDivisores(12));
		
		
		System.out.println(ListaMathUtils.computaMaior(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7)));
		
		System.out.println(ListaMathUtils.computaMenor(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7)));
		
		System.out.println(ListaMathUtils.computaMedia(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7)));
		
		System.out.println(ListaMathUtils.temNumRepetido(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7)));
	}

}
