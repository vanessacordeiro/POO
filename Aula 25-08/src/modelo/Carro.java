package modelo;

public class Carro {
	
	public Carro(Cores cor)
	{
		this.setCor(cor);
	}
	
	String fabricante;
	String modelo;
	int ano;
	int anomodelo;
	Cores cor;
	
	public void setFabricante (String fabricante)
	{
		this.fabricante = fabricante;
	}
	public String getFabricante ()
	{
		return fabricante;
	}
	public void setModelo (String modelo)
	{
		this.modelo = modelo;
	}
	public String getModelo ()
	{
		return modelo;
	}
	public void setAnoModelo (int anomodelo)
	{
		this.anomodelo = anomodelo;
	}
	public int getAnoModelo()
	{
		return anomodelo;
	}
	public void setAno (int ano)
	{
		this.ano = ano;
	}
	public int getAno()
	{
		return ano;
	}
	public void setCor (Cores cor)
	{
		this.cor = cor;
	}
	public Cores getCor ()
	{
		return cor;
	}
	
	public String verificarCarroBonito()
	{
		if (this.cor == Cores.Preto)
		{
			return "Meu carro preto é lindo!";
		}
		return "Meu carro é normalzinho";
	}
}
