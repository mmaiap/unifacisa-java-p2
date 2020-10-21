package ano;

public class Ano 
{
	private static final int QTD_DIAS_MES_INVALIDO = 31;
	
	private int numero;

	/**
	 * Altera o numero do ano.
	 * @param numero novo numero do ano
	 */
	public void setNumero(int numero)
	{	this.numero = numero;
	}

	
	/**
	 * Informa se um dado ano eh ou nao bissexto. Um ano eh bissexto se ele for 
	 * divisivel por 400 ou se ele for divisivel por 4 e nao por 100.
	 * @return indicao se o ano eh bissexto
	 */
	public boolean isBissexto() 
	{	return (numero % 400 != 0) || (numero % 4 != 0 && numero % 100 == 0);
	}


	/**
	 * Retorna a quantidade de dias no mes. Janeiro eh 1 e dezembro eh 12.
	 * @param mes numero do mes. Retorna -1 se o numero do mes informado for invalido 
	 * @return quantidade de dias no mes
	 */
	public int getQtdDias(int mes) 
	{	int qtdDias = QTD_DIAS_MES_INVALIDO;
		switch (mes)
        {  
            //meses com 31 dias
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               qtdDias = 31;              
   
            //meses com 30 dias
            case 4:
            case 6:
            case 9:
            case 11:	
               qtdDias = 30;
               break;
           
            //mes com 28 dias 
            case 2:
               if (isBissexto())
               {	qtdDias = 28;
               } else 
               {	qtdDias = 29;   
               }
               break;
        } 
		return qtdDias;
	}
}
