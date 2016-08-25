package view;
import modelo.Exercicios;

public class Principal {

	public static void main(String[] args) {
		///////////////////////////////////////////////////
		Exercicios s = new Exercicios();
		s.Seta();
		///////////////////////////////////////////////////
		Exercicios i = new Exercicios();
		i.If();
		///////////////////////////////////////////////////
		Exercicios ie = new Exercicios();
		ie.IfElse();
		///////////////////////////////////////////////////
		Exercicios w = new Exercicios();
		w.While();
		///////////////////////////////////////////////////
		Exercicios f = new Exercicios();
		f.For();
		///////////////////////////////////////////////////
		Exercicios c = new Exercicios();
		c.Calculadora();
		///////////////////////////////////////////////////
		boolean[] coluna1 = {true, true, false, false};
		boolean[] coluna2 = {true, false, true, false};
		boolean[] resultado = new boolean[4];
		Exercicios and = new Exercicios();
		System.out.println("----------AND----------");
		and.OperadorLogicoAnd(coluna1, coluna2, resultado);
		System.out.println("-----------------------\n");
		//-----------------------------------------------//
		Exercicios or = new Exercicios();
		System.out.println("-----------OR----------");
		or.OperadorLogicoOr(coluna1, coluna2, resultado);
		System.out.println("-----------------------\n");
		//-----------------------------------------------//
		Exercicios not = new Exercicios();
		boolean[] coluna = {true, false};
		boolean[] resultado1 = new boolean[2];
		System.out.println("----------NOT----------");
		not.OperadorLogicoNot(coluna, resultado1);
		System.out.println("-----------------------");
		///////////////////////////////////////////////////
	}

}
