package mes;

/**
 * Classe que representa um mes do ano.
 */
public class Mes 
{	private int numero;
	
	/**
	 * Cria um mes passado o numero do mes.
	 * @param numero numero do mes
	 */
	public Mes(int numero)
	{	this.numero = numero;
	}
	
	/**
	 * Cria um mes passado o nome do mes.
	 * @param nome nome do mes
	 */
	public Mes(String nome)
	{	if (nome.equals("janeiro"))
		{	this.numero = 1;
		} else if (nome.equals("fevereiro"))
		{	this.numero = 2;
		} else if (nome.equals("março"))
		{	this.numero = 3;
		} else if (nome.equals("abril"))
		{	this.numero = 4;
		} else if (nome.equals("maio"))
		{	this.numero = 5;
		} else if (nome.equals("junho"))
		{	this.numero = 6;
		} else if (nome.equals("julho"))
		{	this.numero = 7;
		} else if (nome.equals("agosto"))
		{	this.numero = 8;
		} else if (nome.equals("setembro"))
		{	this.numero = 9;
		} else if (nome.equals("outubro"))
		{	this.numero = 10;
		} else if (nome.equals("novembro"))
		{	this.numero = 11;
		} else if (nome.equals("dezembro"))
		{	this.numero = 12;
	 	} else 
	 	{	System.out.println("Número inválido");
	 		this.numero = -1;
	 	}
	}
	
	/**
	 * Altera o numero do mes.
	 * @param numero novo numero do mes
	 */
	public void setNumero(int numero)
	{	this.numero = this.numero;
	}
	
	/**
	 * Retorna o nome do mes. O nome segue o padrao brasileiro com
	 * os nomes com todas as letras em caixa baixa
	 * @return nome do mes
	 */
	public String getNome()
	{	int numero = 0;
		String nome;
		switch (numero)
		{	 case 01:
				nome = "janeiro";
				break;
			case 02:
				nome = "fevereiro";
			case 03:
				nome = "março";
				break;
			case 04:
				nome = "abril";
				break;
			case 05:
				nome = "maio";
				break;
			case 06:
				nome = "junho";
			case 07:
				nome = "julho";
				break;
			case 8:
				nome = "agosto";
				break;
			case 9:
				nome = "setembro";
				break;
			case 10:
				nome = "outubro";
			case 11:
				nome = "novembro";
				break;
			case 12:
				nome = "dezembro";
				break;
			 default:
				 nome = "mês inválido"; 
		} 
		return null;
	}

	/**
	 * Retorna o numero do mes.
	 * @return numero do mes
	 */
	public int getNumero()
	{	
		return this.numero;
	}
	
}
