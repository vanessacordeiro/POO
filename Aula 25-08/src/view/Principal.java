package view;
import modelo.*;

public class Principal {

	public static void main(String[] args) 
	{
		Carro c1 = new Carro(Cores.Preto);
		
		Carro c2 = new Carro(Cores.Prata);
		
		System.out.println("A cor do carro: " + c1.getCor());
		System.out.println(c1.verificarCarroBonito());
		
		System.out.println("*******VERIFICANDO C2********");
		
		System.out.println("A cor do carro: " + c2.getCor());
		System.out.println(c2.verificarCarroBonito());
		
		Config.setNomeDoPrograma("Meu programa");
		Config.getEnderecoBaseDados();
		
		System.out.println("O nome do meu programa é: " + Config.getNomeDoPrograma());
		
		
	}

}
