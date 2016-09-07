package view;
import java.util.Scanner;

import modelo.*;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		Exercicio1 e1 = new Exercicio1();
		System.out.println("********* Exercicio 1 *********\nDigite o primeiro número: ");
		e1.setN1(leitor.nextInt());
		System.out.println("Digite o segundo número: ");
		e1.setN2(leitor.nextInt());
		e1.printE1();
		
		Exercicio2 e2 = new Exercicio2();
		System.out.println("\n\n********* Exercicio 2 *********\nDigite o primeiro número: ");
		e2.setN1(leitor.nextInt());
		System.out.println("Digite o segundo número: ");
		e2.setN2(leitor.nextInt());
		e2.printE2();
		
		Exercicio3 e3 = new Exercicio3();
		int v[] = new int [5];
		System.out.println("\n\n\n********* Exercicio 3 *********");
		for (int x = 0; x<5; x++)
		{
			System.out.println("Digite um número: ");
			v[x] = leitor.nextInt();
		}
		e3.printE3(v);
		
		Exercicio4 e4 = new Exercicio4();
		System.out.println("\n\n********* Exercicio 4 *********\nDigite o primeiro número: ");
		e4.setN1(leitor.nextInt());
		System.out.println("Digite o segundo número: ");
		e4.setN2(leitor.nextInt());
		e4.printE4();
		
		
		
		Exercicio7 e7 = new Exercicio7();
		System.out.println("\n\n********* Exercicio 7 *********\nDigite a quantidade de horas trabalhadas: ");
		e7.setQuantHoras(leitor.nextInt());
		System.out.println("Digite o valor da hora normal: ");
		e7.setHoraNormal(leitor.nextInt());
		e7.printE7();
		
		leitor.close();
	}
}
