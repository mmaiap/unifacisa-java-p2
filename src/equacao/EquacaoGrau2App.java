package equacao;

public class EquacaoGrau2App 
{
	public static void main(String[] args) 
	{	EquacaoGrau2 equacao = new EquacaoGrau2Impl();
	
		double a = 1;
		double b = -2;
		double c = -3;
		equacao.setA(a);
		equacao.setB(b);
		equacao.setC(c);
		int qtd = equacao.getQtdRaizes();
		double delta = equacao.getDelta();
		switch (qtd) 
		{	case 0:
				System.out.println("a: " + a + ", b: " + b + " e quantidade: " + qtd);
				break;
			case 1:
			case 2:
				double x1 = equacao.getRaiz1();
				double x2 = equacao.getRaiz1();
				System.out.println("a: " + a + ", b: " + b + ", delta: " + delta + ", quantidade: " + qtd + ", x' = " + x1 + " e x'' = " + x2);
				break;
		}
		System.out.println();
		
		a = 1;
		b = 8;
		c = 16;
		equacao.setA(a);
		equacao.setB(b);
		equacao.setC(c);
		qtd = equacao.getQtdRaizes();
		delta = equacao.getDelta();
		switch (qtd) 
		{	case 0:
				System.out.println("a: " + a + ", b: " + b + " e quantidade: " + qtd);
				break;
			case 1:
			case 2:
				double x1 = equacao.getRaiz1();
				double x2 = equacao.getRaiz1();
				System.out.println("a: " + a + ", b: " + b + ", delta: " + delta + ", quantidade: " + qtd + ", x' = " + x1 + " e x'' = " + x2);
				break;
		}
		System.out.println();
		
		a = 10;
		b = 6;
		c = 10;
		equacao.setA(a);
		equacao.setB(b);
		equacao.setC(c);
		qtd = equacao.getQtdRaizes();
		delta = equacao.getDelta();
		switch (qtd) 
		{	case 0:
				System.out.println("a: " + a + ", b: " + b + ", delta: " + delta + ", e quantidade: " + qtd);
				break;
			case 1:
			case 2:
				double x1 = equacao.getRaiz1();
				double x2 = equacao.getRaiz1();
				System.out.println("a: " + a + ", b: " + b + ", delta: " + delta + ", quantidade: " + qtd + ", x' = " + x1 + " e x'' = " + x2);
				break;
		}
		System.out.println();
	}
}
