package modelo;

public class Conta {
	protected double saldo;
	
	public Conta (double saldo)
	{
		this.saldo = saldo;
	}

	public Conta() {}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double valorDeposito)
	{
		this.saldo +=valorDeposito;
	}
	
	public void sacar (double valorSaque)
	{
		this.saldo -= valorSaque;
	}
	
	public void atualizar(double taxaP)
	{
		this.saldo += (this.saldo/100)*taxaP;
	}
}
