package domain;

import java.math.BigDecimal;

public class Transferencia extends Transacao {

	public Transferencia(Conta orConta, Conta desConta) {
		super(orConta, desConta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void executar(BigDecimal valor){
	  super.getOrigem().debitar(valor);
	  super.getDestino().creditar(valor);
		
	}

}
