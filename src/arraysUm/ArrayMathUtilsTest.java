package arraysUm;

import java.util.Arrays;

public class ArrayMathUtilsTest {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Arrays.toString(ArrayMathUtils.calculaDivisores(12)));
		
		System.out.println(ArrayMathUtils.computaMaior(new double []{12.4, 43.1, 4.3, 54.0, 6.7}));
		
		System.out.println(ArrayMathUtils.computaMenor(new double []{12.4, 43.1, 4.3, 54.0, 6.7}));
		
		System.out.println(ArrayMathUtils.computaMedia(new double []{12.4, 43.1, 4.3, 54.0, 6.7}));
		
		System.out.println(ArrayMathUtils.temNumRepetido(new double []{12.4, 43.1, 4.3, 54.0, 6.7}));
		
		
		System.out.println(Arrays.toString(ArrayMathUtils.somaMatrizes(new int [][] {{5, 4}, {0, 2}, {1, -1}}, new int [][] {{0, -2}, {5, -3}, {-1, 0}})));
		
	}

}
