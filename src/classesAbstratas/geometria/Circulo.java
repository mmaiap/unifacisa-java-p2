package classesAbstratas.geometria;

public class Circulo extends Figura{
	
	private double raio;
	
	public Circulo(Cor cor, double raio) {
		
		super.setCor(cor);
		this.raio = raio;
		
	}
	
	

	@Override
	public double calculaArea() {
		
		double area = 0;
		
		area = Math.pow(Math.PI * raio, 2);


		return area;
	}

	@Override
	public double calculaPerimetro() {

		double perimetro = 0;
		
		perimetro = 2 * Math.PI * raio;
		
		return perimetro;
	}
	
	

}
