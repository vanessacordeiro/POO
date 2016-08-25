package view;
import modelo.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Tabuleiro iniciar = new Tabuleiro();
		TicTacToe ttt = new TicTacToe(iniciar.iniciarJogo());
		int x = 0;
		boolean y=true;
		
		System.out.println("***************** JOGO DA VELHA *******************\n");
		while(true)
		{
			x++;
			System.out.println("%da rodada!\nVez do jogador: ");
			if (y == true){System.out.printf("1");}else{System.out.printf("2");}
			System.out.printf("Linha: ");
			int linha = leitor.nextInt();
			System.out.printf("Coluna: ");
			int coluna = leitor.nextInt();
			
		}
	}

}
