package modelo;

public class Tabuleiro {
	
	
	public Celulas[][] iniciarJogo()
	{
		Celulas m[][] = new Celulas[3][3];
		for (int x = 0; x<3; x++)
		{
			for (int y = 0; y<3;y++)
			{
				m[x][y]= Celulas.empty;
			}
		}
		return m;
	}
	
}
