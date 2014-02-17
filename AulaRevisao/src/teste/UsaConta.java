package teste;

import java.math.BigDecimal;

import domain.Conta;
import domain.Pessoa;
import domain.Retirada;
import domain.Transacao;
import domain.Transferencia;

public class UsaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa("Euzébio");
		
		Conta conta = new Conta(pessoa, "7174");
		
		System.out.println("Saldo incial: "+conta.getSaldo());

		
		conta.creditar(new BigDecimal(100));
		
		System.out.println("Saldo: "+conta.getSaldo());
		
		Transacao retirada = new Retirada(conta, null);
		retirada.executar(new BigDecimal(50));
		
		System.out.println("Saldo: "+conta.getSaldo());
		
		Pessoa pessoa2 = new Pessoa("Lucas");
		
		Conta conta2 = new Conta(pessoa2, "9888");
		
		Transacao tranferencia = new Transferencia(conta, conta2);
		tranferencia.executar(new BigDecimal(10));
		
		System.out.println("Saldo: "+conta2.getSaldo());

	}

}
