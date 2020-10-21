package contador;

public class ContadorDeDigitosApp 
{
	public static void main(String[] args)
	{	ContadorDeDigitos contador = new ContadorDeDigitos();
		int numero = 0;
		contador.setValor(numero);
		int qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 9;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 10;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 19;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 20;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 99;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 100;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 999;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
		
		numero = 1000;
		contador.setValor(numero);
		qtdDigitos = contador.getQtdDigitos();
		System.out.println(numero +  " tem " + qtdDigitos);
	}
}
