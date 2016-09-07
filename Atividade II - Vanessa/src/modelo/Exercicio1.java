package modelo;

public class Exercicio1 {
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
	
	public void printE1()
	{
		int soma = n1+n2;
		int subtracao = n1-n2;
		float divisao = n1/n2;
		int produto = n1*n2;
		System.out.println("***********RESULTADO***********\nSoma: " + soma + "\nSubtração: " + subtracao + "\nDivisão: " + divisao + "\nProduto: " + produto);
	}
}
