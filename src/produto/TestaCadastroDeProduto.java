package produto;

import produto.excecoes.CodigoDeBarrasInvalido;

public class TestaCadastroDeProduto 
{
	public static void main(String[] args) throws CodigoDeBarrasInvalido
	{	CodigoDeBarras codigo = new CodigoDeBarrasImpl();
		
		long numero = 7891027119485L;
		codigo.setNumero(numero);
		System.out.println(numero + " = " + codigo.getNumero());
		
		try
		{	numero = 891027119485L;
			codigo.setNumero(numero);
			System.out.println("Aceitou " + numero + " que eh invalido ");
		} catch (CodigoDeBarrasInvalido e)
		{	
		}
	
		try
		{	numero = 891027119485L;
			codigo.setNumero(numero);
			System.out.println("Aceitou " + numero + " que eh invalido ");
		} catch (CodigoDeBarrasInvalido e)
		{
		}
		
		try
		{	numero = 77891027119485L;
			codigo.setNumero(numero);
			System.out.println("Aceitou " + numero + " que eh invalido ");
		} catch (CodigoDeBarrasInvalido e)
		{
		}
		
		numero = 7891027119485L;
		codigo.setNumero(numero);
		System.out.println(789 + " = " + codigo.getPais());
		
		numero = 7891027119485L;
		codigo.setNumero(numero);
		System.out.println(5 + " = " + codigo.getVerificador());	
	}
}
