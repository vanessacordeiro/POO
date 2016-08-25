package modelo;

public class TicTacToe {
	private Celulas matriz[][] = new Celulas[3][3];
	
	public TicTacToe(Celulas[][] matriz)
	{
		this.setMatriz(matriz);
	}
	private void setMatriz(Celulas[][] matriz) 
	{
		this.matriz = matriz;
	}
	public Celulas[][] getMatriz()
	{
		return this.matriz;
	}
}
