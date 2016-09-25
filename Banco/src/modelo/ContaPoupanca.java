package modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public ContaPoupanca() {}

	public void atualizar(double taxaP)
	{
		super.saldo += ((super.saldo/100)*taxaP)*3;
	}

}
