package classesAbstratas.geometria;

public class Retangulo extends Quadrilatero {
	
	public Retangulo(double lado1, double lado2, double lado3, double lado4, Cor cor) {
		super.setLado1(lado1);
		super.setLado2(lado2);
		super.setLado3(lado3);
		super.setLado4(lado4);
		super.setCor(cor);
	}

	@Override
	public double calculaArea() {
		
		double area = 0;
		
		if(getLado1() == getLado2()) {
			area = getLado1() * getLado3();
		}else {
			area = getLado1() * getLado2();
		}
		
		
		
				
		return area;
	}

	@Override
	public double calculaPerimetro() {
		
		double perimetro = 0;
		
		perimetro = getLado1() + getLado2() + getLado3() + getLado4();
		
		return perimetro;
	}
	


}
