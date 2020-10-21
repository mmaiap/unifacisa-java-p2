package arraysDois;

public class SistemaInterpolTest {
	
	public static void main(String[] args) {
		
		SistemaInterpol osProcurados = new SistemaInterpol();
		
		osProcurados.adicionarProcurados("Phulano Syckrano Bheltranno");
		System.out.println(osProcurados.ehProcurado("matheus"));
		System.out.println(osProcurados.ehProcurado("Phulano"));
		
	}

}
