package modelo;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas (double selic)
	{
		this.selic = selic;
	}

	public void roda(Conta c)
	{
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualizar(this.selic);
		System.out.println("Saldo Final: " + c.getSaldo() + "\n");
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
}
