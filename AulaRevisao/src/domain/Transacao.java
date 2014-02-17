package domain;

import java.math.BigDecimal;

public abstract class Transacao {
	private Conta origem;
	private Conta destino;
	
	public Transacao(Conta orConta, Conta desConta){
		this.origem = orConta;
		this.destino = desConta;
	}
	
	public void executar(BigDecimal valor){
		
	}

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}
	
	

}
