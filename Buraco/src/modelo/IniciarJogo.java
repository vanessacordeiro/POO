package modelo;

public class IniciarJogo {
	private Cartas carta;
	private Naipes naipe;
	
	public IniciarJogo (Cartas carta, Naipes naipe)
	{
		this.carta = carta;
		this.naipe = naipe;
	}

	public Cartas getCarta() {
		return carta;
	}

	public Naipes getNaipe() {
		return naipe;
	}
	
	public String toString()
	{
		return String.format("%s de %s", carta, naipe);
	}
}
