package view;

import java.util.ArrayList;
import modelo.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String palavraDigitada = "";
		Scanner leitor = new Scanner (System.in);
		ArrayList <String> arrList = new ArrayList <String> (); 
		
		while (!palavraDigitada.equalsIgnoreCase("S"))
		{
			System.out.println("Digite algo diferente de S:" );
			palavraDigitada = leitor.nextLine();
			
			if (!palavraDigitada.equalsIgnoreCase("S"))
				arrList.add(palavraDigitada);
		}
		
		leitor.close();
		leitor = null;
		
		System.out.println("///////////////////////////////////////\n" );
		
		int[] arr = {10,20,30,40,5,6,7,8,9,11,12};
				
		for(int numero : arr)
		{
			System.out.println("Número lido: " + numero);
		}
		
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("Palavra 01");
		aList.add("Palavra 02");
		aList.add("Palavra 03");
		
		
		for(String s : aList)
		{
			System.out.println("Valor lido: " + s);
		}

		ArrayList<Pessoa> pList = new ArrayList<Pessoa>();
		
		pList.add(new Pessoa("Edizon", 35));
		pList.add(new Pessoa("Fulano", 15));
		pList.add(new Pessoa("Ciclana", 33));
		
		for(Pessoa p : pList)
		{   
			System.out.println("toString() = " + p.toString());
			System.out.println("Nome: " + p.getNome() + ", idade: " + p.getIdade());
		}
		
		
		Aluno a1 = new Aluno("Edizon", 35, 1234);
		
				
		System.out.println("**** ALUNO *****");
		System.out.println(a1.toString());
		
	}

}
