package classesAbstratas.geometria;

public abstract class Figura {
	
	private Cor cor;
	
	
	public abstract double calculaArea();
	
	public abstract double calculaPerimetro();
	
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public Cor getCor() {
		return cor;
	}
}
