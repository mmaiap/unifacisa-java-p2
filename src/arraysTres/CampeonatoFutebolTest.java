package arraysTres;

import java.util.Arrays;

public class CampeonatoFutebolTest {
	
	public static void main(String[] args) {
		
		
		CampeonatoFutebol paraibano = new  CampeonatoFutebol();
		
		paraibano.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		String [] jogos = paraibano.criarCampeonato();
		System.out.println(Arrays.toString(jogos));
		
	}

}
