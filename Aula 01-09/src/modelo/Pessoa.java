package modelo;

public class Pessoa {
	private int idade;
	private String nome;
	private String cpf;
	
	public Pessoa(){}
	
	public Pessoa(String nome, int idade)
	{
		this.idade = idade;
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString()
	{
		return "PESSOA => Nome: " + this.getNome() + ", idade: " + this.getIdade();
	}
}
