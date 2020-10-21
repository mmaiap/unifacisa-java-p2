package listas.questao2;



public class SistemaInterpolTest {
	
	public static void main(String[] args) {
		
		
		SistemaInterpol novo = new SistemaInterpol();
		
		novo.adicionarProcurados("Connor");
		novo.adicionarProcurados("Matheus");
		novo.adicionarProcurados("Maia");
		novo.adicionarProcurados("Messi");
		novo.adicionarProcurados("Lebron");
		novo.adicionarProcurados("Isabela");
		
		System.out.println(novo.ehProcurado("Isabela"));
		System.out.println(novo.ehProcurado("Carlos"));
		System.out.println(novo.ehProcurado("Matheus"));
		
		
		
		
		
	}

}
