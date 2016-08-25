package modelo;
import java.util.Scanner;

public class Exercicios {
		Scanner leitor = new Scanner(System.in);
		
		public void Seta()
		{
			System.out.println("************");
			System.out.println("***      ***");
			System.out.println("***      ***");
			System.out.println("***      ***");
			System.out.println("***      ***");
			System.out.println("***      ***");
			System.out.println("**        **");
			System.out.println("***      ***");
			System.out.println("****    ****");
			System.out.println("*****  *****");
			System.out.println("************\n");
		}
		
		public void If()
		{
			System.out.println("Insira um valor inteiro para o número 1: ");
			int numero1 = leitor.nextInt();
			System.out.println("Insira um valor inteiro para o número 2: ");
			int numero2 = leitor.nextInt();
			
			if (numero1 > numero2)
			{
				System.out.println("Numero 1 > Numero 2");
			}
			if(numero1 < numero2) 
			{
				System.out.println("Numero 2 > Numero 1");
			}
			if(numero1 == numero2) 
			{
				System.out.println("Numero 2 == Numero 1");
			}
			if(numero1 != numero2) 
			{
				System.out.println("Numero 2 != Numero 1");
			}
			System.out.println(" ");
		}
		
		public void IfElse()
		{
			System.out.println("Insira um valor inteiro para o número 1: ");
			int numero1 = leitor.nextInt();
			System.out.println("Insira um valor inteiro para o número 2: ");
			int numero2 = leitor.nextInt();
			
			if (numero1 > numero2)
			{
				System.out.println("Numero 1 > Numero 2");
			}else if(numero1 < numero2) 
			{
				System.out.println("Numero 2 > Numero 1");
			}
			if(numero1 == numero2) 
			{
				System.out.println("Numero 2 == Numero 1\n");
			}else if(numero1 != numero2) 
			{
				System.out.println("Numero 2 != Numero 1\n");
			}
		}
		
		public void While()
		{
			int x = 8;
			System.out.println("*******");
			while (x>0)
			{
				System.out.println("*     *");
				x--;
			}
			System.out.println("*******\n");
		}
		
		public void For()
		{
			System.out.println("*******");
			for (int x = 8; x>0; x--)
				System.out.println("*     *");
			System.out.println("*******\n");
		}
		
		public void Calculadora()
		{
			boolean executar = true;
			while (executar)
			{
				System.out.println("Calculadora basica. Para fazer cálculos com apenas dois números.\nDigite a opção que você deseja: \n 1 - SOMA\n 2 - SUBTRACAO\n 3 - DIVISAO\n 4 - MULTIPLICAÇÃO\n 5 SAIR");
				int opcao = leitor.nextInt();
				int primeiro = 0;
				int segundo = 0;
				if(opcao != 5)
				{
					System.out.println("\nDigite o primeiro número: ");
					primeiro = leitor.nextInt();
					System.out.println("Digite o segundo número:" );
					segundo = leitor.nextInt();
				}
				switch(opcao)
				{
					case 1:
						System.out.printf("\nResultado: %d\n", primeiro+segundo);
						break;
					case 2:
						System.out.printf("\nResultado: %d\n", primeiro-segundo);
						break;
					case 3:
						System.out.printf("\nResultado: %d\n", primeiro/segundo);
						break;
					case 4:
						System.out.printf("\nResultado: %d\n", primeiro*segundo);
						break;
					case 5:
						executar = false;					
						break;
					default:
						System.out.println("\nOpção invalida!");
				}
				System.out.println(" ");
			}
		}
		
		public void OperadorLogicoAnd(boolean[] coluna1, boolean[] coluna2, boolean[] resultado)
		{
			for (int n=0; n<4; n++)
			{
				resultado[n] = coluna1[n] && coluna2[n];
				System.out.printf("%s and %s - %s \n", coluna1[n], coluna2[n], resultado[n]);
			}	
		}
		
		public void OperadorLogicoOr(boolean[] coluna1, boolean[] coluna2, boolean[] resultado)
		{
			for (int n=0; n<4; n++)
			{
				resultado[n] = coluna1[n] || coluna2[n];
				System.out.printf("%s and %s - %s \n", coluna1[n], coluna2[n], resultado[n]);
			}
		}
		
		public void OperadorLogicoNot(boolean[] coluna, boolean[] resultado1)
		{
			for (int n=0; n<2; n++)
			{
				resultado1[n] = !coluna[n];
				System.out.printf("%s - %s \n", coluna[n], resultado1[n]);
			}
		}
	
}
