package modelo;

public class Aluno extends Pessoa{
	int ra;

	public Aluno(String nome, int idade, int ra)
	{
		super(nome, idade);
		this.ra = ra;
		
	}
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public String toString()
	{
		//super.cpf = "";
		
		String retorno = "";
		
		retorno = super.toString() + "\n";
		retorno += "ALUNO => RA: " + this.ra;
		
		return retorno;
	}
}
