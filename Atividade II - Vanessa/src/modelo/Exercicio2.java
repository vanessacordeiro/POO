package modelo;

public class Exercicio2 {
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
	
	public void printE2()
	{
		int soma = n1+n2;
		int media = soma/2;
		int menor = 0;
		int maior = 0;
		
		if (n1<n2)
		{
			menor = n1;
			maior = n2;
		}else{
			maior = n2;
			menor = n1;
		}
		
		System.out.println("***********RESULTADO***********\nSoma: " + soma + "\nMédia: " + media);
		for (int x = menor; x<=maior; x++)
		{
			System.out.print(x + " ");
		}
	}
}
