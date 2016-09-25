package modelo;

public class ContaCorrente extends Conta{

	public ContaCorrente(double saldo) {
		super(saldo);
	}

	public ContaCorrente() {}

	public void atualizar(double taxaP)
	{
		super.saldo += ((super.saldo/100)*taxaP)*2;
	}
	
	public void depositar (double valorDeposito)
	{
		this.saldo +=valorDeposito-0.10;
	}
}
