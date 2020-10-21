package arraysDois;

public class SistemaInterpol {
	
	String [] procurados;
	
	
	void adicionarProcurados(String nomes) {
		
		String [] procuradosIniciais = nomes.split(" ");
		
		procurados = procuradosIniciais;
		
		
	}
	
	boolean ehProcurado(String nome) {
		
		int contador = 0;
		for(String pessoa : procurados) {
			
			if(pessoa.equalsIgnoreCase(nome)) {
				
				contador++;
			}
		
		}
		if(contador > 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
