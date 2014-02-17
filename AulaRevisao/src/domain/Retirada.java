package domain;

import java.math.BigDecimal;

public class Retirada extends Transacao{

	public Retirada(Conta orConta, Conta desConta) {
		super(orConta, null);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void executar(BigDecimal valor){
		super.getOrigem().debitar(valor);
	}

}
