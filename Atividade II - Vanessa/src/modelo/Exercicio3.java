package modelo;

public class Exercicio3 {
	
	public void printE3(int numeros[])
	{
		int maior = 0, menor = 999999;
		
		for (int x=0; x<5; x++)
		{
			if(maior<=numeros[x])maior=numeros[x];
			if(menor>=numeros[x])menor=numeros[x];
		}
		System.out.println("***********RESULTADO***********\nMaior: " + maior + "\nMenor: " + menor);
	}
}
