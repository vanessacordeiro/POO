package view;
import java.util.Scanner;
import modelo.*;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean fechar = false;
		Flight aviao1 = null;
		Flight aviao2 = null;
		Flight aviao3 = null;
		
		String modelo;
		int anoFabric;
		int velocidadeAtual;
		int altitudeAtual;
		String direcao;
		String transportadora;
		String horaPartida;
		String horaChegada;
		Codigos origem;
		Codigos destino;
		FlightStatus status;
		
		System.out.println("================== Air Traffic Control Simulator ==================\n");
		System.out.println("Digite as informações dos 3 aviões!");
		
		for (int x = 0; x<3; x++)
		{
			System.out.printf("\n%dº avião: \n", x+1);
			System.out.printf("Modelo: ");
			modelo = leitor.nextLine();
			System.out.printf("Ano do fabricante: ");
			anoFabric = leitor.nextInt();
			System.out.printf("Velocidade atual: ");
			velocidadeAtual = leitor.nextInt();
			System.out.printf("Altitude atual: ");
			altitudeAtual = leitor.nextInt();
			System.out.printf("Direção: ");
			direcao = leitor.nextLine();
			System.out.printf("Transportadora: ");
			transportadora = leitor.nextLine();
			System.out.printf("Hora da partida: ");
			horaPartida = leitor.nextLine();
			System.out.printf("Hora de chegada: ");
			horaChegada = leitor.nextLine();
			System.out.printf("Origem: ");
			origem = Codigos.valueOf(leitor.nextLine().toUpperCase());
			System.out.printf("Destino: ");
			destino = Codigos.valueOf(leitor.nextLine().toUpperCase());
			System.out.printf("Status: ");
			status = FlightStatus.valueOf(leitor.nextLine().toLowerCase());
			
			if (x == 0)
			{
				aviao1 = new Flight(modelo, anoFabric, velocidadeAtual, altitudeAtual, direcao, transportadora, horaPartida, horaChegada, origem, destino, status);
			}else if(x == 1)
			{
				aviao2 = new Flight(modelo, anoFabric, velocidadeAtual, altitudeAtual, direcao, transportadora, horaPartida, horaChegada, origem, destino, status);
			}else if(x == 2)
			{
				aviao3 = new Flight(modelo, anoFabric, velocidadeAtual, altitudeAtual, direcao, transportadora, horaPartida, horaChegada, origem, destino, status);
			}
		}
		
		while(!fechar)
		{
			System.out.println("\n======================================================");
			System.out.println("              Escolha o que deseja fazer:             ");
			System.out.println("======================================================");
			System.out.println("1 - Aumentar a altitude de um avião.");
			System.out.println("2 - Diminuir a velocidade de um avião.");
			System.out.println("3 - Atualizar o status de um avião para 'pousando'.");
			System.out.println("4 - Escrever todas as informações de um avião na tela.");
			System.out.println("5 - Fechar programa.");
			int opcao = leitor.nextInt();
			
			if ((opcao>=1)&&(opcao<=4))
			{
				System.out.println("\nEm qual avião deseja fazer a mudança?\n1 - Modelo " + aviao1.getModelo() + "\n2 - Modelo " + aviao2.getModelo() + "\n3 - Modelo " + aviao3.getModelo());
				int opcaoAviao = leitor.nextInt();
				if (opcao==1)
				{
					System.out.println("\nAumentar a altitude de um avião.");
					System.out.printf("Digite o aumento da altitude: ");
					int diferenca = leitor.nextInt();
					
					if (opcaoAviao==1)
					{
						int retorno[] = aviao1.changeAltitude(diferenca);
						System.out.println("\nTransportadora: " + aviao1.getTransportadora() + "\nModelo: " + aviao1.getModelo() + "\nAltitude acrescentada: " + diferenca + "\nAntiga altitude: " + retorno[0] + "\nNova altitude: " + retorno[1]);
					}else if (opcaoAviao==2)
					{
						int retorno[] = aviao2.changeAltitude(diferenca);
						System.out.println("\nTransportadora: " + aviao2.getTransportadora() + "\nModelo: " + aviao2.getModelo() + "\nAltitude acrescentada: " + diferenca + "\nAntiga altitude: " + retorno[0] + "\nNova altitude: " + retorno[1]);
					}else if (opcaoAviao==3)
					{
						int retorno[] = aviao3.changeAltitude(diferenca);
						System.out.println("\nTransportadora: " + aviao3.getTransportadora() + "\nModelo: " + aviao3.getModelo() + "\nAltitude acrescentada: " + diferenca + "\nAntiga altitude: " + retorno[0] + "\nNova altitude: " + retorno[1]);
					}
				}else if(opcao==2)
				{
					System.out.println("\nDiminuir a velocidade de um avião.");
					System.out.printf("Digite o decréscimo na velocidade: ");
					int diferenca = leitor.nextInt();
					
					if (opcaoAviao==1)
					{
						int retorno[] = aviao1.reduceSpeed(diferenca);
						System.out.println("\nTransportadora: " + aviao1.getTransportadora() + "\nModelo: " + aviao1.getModelo() + "\nVelocidade decrescida: " + diferenca + "\nAntiga velocidade: " + retorno[0] + "\nNova velocidade: " + retorno[1]);
					}else if (opcaoAviao==2)
					{
						int retorno[] = aviao2.reduceSpeed(diferenca);
						System.out.println("\nTransportadora: " + aviao2.getTransportadora() + "\nModelo: " + aviao2.getModelo() + "\nVelocidade decrescida: " + diferenca + "\nAntiga velocidade: " + retorno[0] + "\nNova velocidade: " + retorno[1]);
					}else if (opcaoAviao==3)
					{
						int retorno[] = aviao3.reduceSpeed(diferenca);
						System.out.println("\nTransportadora: " + aviao3.getTransportadora() + "\nModelo: " + aviao3.getModelo() + "\nVelocidade decrescida: " + diferenca + "\nAntiga velocidade: " + retorno[0] + "\nNova velocidade: " + retorno[1]);
					}
				}else if(opcao==3)
				{
					System.out.println("\nDiminuir a velocidade de um avião.");
					
					if (opcaoAviao==1)
					{
						FlightStatus retorno[] = aviao1.beginLandingApproach();
						System.out.println("\nTransportadora: " + aviao1.getTransportadora() + "\nModelo: " + aviao1.getModelo() + "\nStatus antigo: " + retorno[0] + "\nNovo status: " + retorno[1]);
					}else if (opcaoAviao==2)
					{
						FlightStatus retorno[] = aviao2.beginLandingApproach();
						System.out.println("\nTransportadora: " + aviao2.getTransportadora() + "\nModelo: " + aviao2.getModelo() + "\nStatus antigo: " + retorno[0] + "\nNovo status: " + retorno[1]);
					}else if (opcaoAviao==3)
					{
						FlightStatus retorno[] = aviao3.beginLandingApproach();
						System.out.println("\nTransportadora: " + aviao3.getTransportadora() + "\nModelo: " + aviao3.getModelo() + "\nStatus antigo: " + retorno[0] + "\nNovo status: " + retorno[1]);
					}
				}
				else if(opcao==4)
				{
					
				}
				
			}else if(opcao==5)
			{
				fechar = true;
			}else
			{
				System.out.println("\nOpção invalida!");
			}
		}
		
		leitor.close();
	}

}
