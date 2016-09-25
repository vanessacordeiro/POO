package view;

import modelo.*;

public class Principal {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(1);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		/*c.atualizar(1);
		cc.atualizar(1);
		cp.atualizar(1);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		Console:
			1010.0
			1019.898
			1030.0
		*/
	}

}
