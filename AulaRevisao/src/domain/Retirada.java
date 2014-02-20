package domain;

import java.math.BigDecimal;

import util.TransactionExecutionException;

public class Retirada extends Transacao{

	public Retirada(Conta orConta, Conta desConta, BigDecimal valor) {
		super(orConta, null, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executar() throws TransactionExecutionException {
		// TODO Auto-generated method stub
	  if(this.getOrigem().getSaldo().compareTo(getValor())==-1){
		  throw new TransactionExecutionException("Saldo Insucifiente", this);
		  
	  }else{
		this.getOrigem().debitar(getValor());
	  }
		
	}


}
