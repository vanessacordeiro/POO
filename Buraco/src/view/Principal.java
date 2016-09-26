package view;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import modelo.*;

public class Principal {
	
	private List < IniciarJogo > jogador;
	
	public Principal()
	{
		IniciarJogo[] deck = new IniciarJogo [52];
		int cont = 0;
		
		for (Naipes naipe : Naipes.values())
		{
			for (Cartas carta : Cartas.values())
			{
				deck [cont] = new IniciarJogo (carta, naipe);
				cont++;
			}
		}
		
		jogador = Arrays.asList(deck);
		Collections.shuffle(jogador);
	}
	
	public void printCartas()
	{
		int i = 0;
		System.out.printf("\n--------------------------- CARTAS JOGADOR 1 ---------------------------\n");
		for (i = 0; i<11; i++)
			System.out.printf("%-19s%s", jogador.get(i),
					((i+1)%4==0)? "\n" : "");
		System.out.printf("\n------------------------------------------------------------------------\n");
		System.out.printf("\n--------------------------- CARTAS JOGADOR 2 ---------------------------\n");
		for (i = 11; i<22; i++)
			System.out.printf("%-19s%s", jogador.get(i),
					((i+2)%4==0)? "\n" : "");
		System.out.printf("\n------------------------------------------------------------------------\n");
		System.out.printf("\n--------------------------- CARTAS JOGADOR 3 ---------------------------\n");
		for (i = 22; i<33; i++)
			System.out.printf("%-19s%s", jogador.get(i),
					((i+3)%4==0)? "\n" : "");
		System.out.printf("\n------------------------------------------------------------------------\n");
		System.out.printf("\n--------------------------- CARTAS JOGADOR 4 ---------------------------\n");
		for (i = 33; i<44; i++)
			System.out.printf("%-19s%s", jogador.get(i),
					((i+4)%4==0)? "\n" : "");
		System.out.printf("\n------------------------------------------------------------------------\n");
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("|=======================================================================|" );
		System.out.println("|========== ♣ ==== ♠ ====       BEM VINDO       ==== ♥ ==== ♦ ==========|" );
		System.out.println("|========== ♣ ==== ♠ ====  CARTAS PARA BURACO!  ==== ♥ ==== ♦ ==========|" );
		System.out.println("|=======================================================================|" );
		
		System.out.printf("\n|                   Quatro jogadores para duas duplas!!!                |"
						+ "\n|                           O que deseja fazer?                         |"
						+ "\n|                     1 - Gerar as duplas sortidas                      |"
						+ "\n|                     2 - Criar as duplas                               |" 
						+ "\n|... ");
		
		Principal inicio = new Principal(); 
		System.out.printf("\n");
		inicio.printCartas();
	}

}
