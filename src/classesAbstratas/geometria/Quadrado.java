package classesAbstratas.geometria;

public class Quadrado extends Quadrilatero {
	
	

	public Quadrado(double lado, Cor cor) {
		super.setLado1(lado);
		super.setLado2(lado);
		super.setLado3(lado);
		super.setLado4(lado);
		super.setCor(cor);
	}

	@Override
	public double calculaArea() {
		
		double area = 0;
		
		area = getLado1() * getLado1();
				
		return area;
	}

	@Override
	public double calculaPerimetro() {
		
		double perimetro = 0;
		
		perimetro = getLado1() * 4;
		
		return perimetro;
	}
	


}
