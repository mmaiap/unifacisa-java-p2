package classesAbstratas.geometria;

public class Trapezio extends Quadrilatero {
	
	private double altura;
	
	public Trapezio(double baseMaior, double baseMenor, double lado3, double lado4, Cor cor, double altura) {
		super.setLado1(baseMaior);
		super.setLado2(baseMenor);
		super.setLado3(lado3);
		super.setLado4(lado4);
		super.setCor(cor);
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		
		double area = 0;
		
		area = ((getLado1() + getLado2()) * altura)/2;
				
		return area;
	}

	@Override
	public double calculaPerimetro() {
		
		double perimetro = 0;
		
		perimetro = getLado1() + getLado2() + getLado3() + getLado4();
		
		return perimetro;
	}
	


}
