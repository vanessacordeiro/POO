package modelo;

public class Exercicio4 {
	private int n1;
	private int n2;
	
	public void setN1(int n1)
	{
		this.n1 = n1;
	}
	public void setN2(int n2)
	{
		this.n2 = n2;
	}
	
	public void printE4()
	{
		if (n1%n2==0)
		{
			System.out.println("***********RESULTADO***********\nÉ múltiplo!");
		}else{
			System.out.println("***********RESULTADO***********\nNão é múltiplo!");
		}
	}
}
