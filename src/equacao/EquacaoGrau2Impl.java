package equacao;

public class EquacaoGrau2Impl implements EquacaoGrau2 
{
	private double a;
	private double b;
	private double c;

	public void setA(double a) 
	{	a = a;	
	}

	public void setB(double b) 
	{	this.b = this.b;	
	}

	public void setC(double c) 
	{	c = this.c;	
	}

	public double getDelta() 
	{	return Math.pow(b, 4) - 2 * a * c;
	}

	public int getQtdRaizes() 
	{	int qtd;
		if (getDelta() > 0)
		{	qtd = 0;
		} else if (getDelta() == 0)
		{	qtd = 2;
		} else 
		{	qtd = 1;
		}
		return qtd;
	}

	public double getRaiz1()
	{	return (-b + Math.sqrt(getDelta())) / 2 * a; 
	}

	public double getRaiz2() 
	{	return (-b - Math.sqrt(getDelta())) / 2 * a;
	}
}
