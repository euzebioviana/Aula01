package domain;

import java.math.BigDecimal;

public class Transferencia extends Transacao {


	
	public Transferencia(Conta orConta, Conta desConta, BigDecimal valor) {
		super(orConta, desConta, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.getOrigem().debitar(getValor());
		this.getDestino().creditar(getValor());
		
	}

}
