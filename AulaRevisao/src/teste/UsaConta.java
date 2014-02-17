package teste;

import java.math.BigDecimal;

import domain.Conta;
import domain.GerenteTransacao;
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
		
		GerenteTransacao gerenteTransacao = new GerenteTransacao();
		
		Pessoa pessoa = new Pessoa("Euzébio");
		
		Conta conta = new Conta(pessoa, "7174");
	//	Transacao transacao  = 
		
		System.out.println("Correntista: "+conta.getCorrentista().getNome()+ "\n Saldo incial:"+conta.getSaldo());
		
		
		
		
	}

}
