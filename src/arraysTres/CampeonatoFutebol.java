package arraysTres;

public class CampeonatoFutebol {
	
	String [] todosOsTimes;
	
	
	void adicionarTimes(String times) {
		
		todosOsTimes = times.split(" ");
	
	}
	
	String[] criarCampeonato() {
		
		int numJogos = (todosOsTimes.length - 1)*2;
		String [] tabela = new String[numJogos];
		int i = 0;
		
		for (int mandante = 0; mandante < todosOsTimes.length - 1; mandante++) {
			String timeCasa = todosOsTimes[mandante];
			for(int visitante = mandante + 1; visitante < todosOsTimes.length; visitante++) {
				
				String timeFora = todosOsTimes[visitante];
				tabela[i] = timeCasa + " X " + timeFora;
				i++;	
			}
		}
		
		return tabela;
		
	}

}
