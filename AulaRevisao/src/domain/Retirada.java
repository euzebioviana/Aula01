package domain;

import java.math.BigDecimal;

public class Retirada extends Transacao{

	public Retirada(Conta orConta, Conta desConta, BigDecimal valor) {
		super(orConta, null, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.getOrigem().debitar(getValor());
		
	}


}
