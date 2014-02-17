package domain;

import java.math.BigDecimal;

public abstract class Transacao {
	private Conta origem;
	private Conta destino;
	private BigDecimal valor;
	
	public Transacao(Conta orConta, Conta desConta,BigDecimal valor){
		this.origem = orConta;
		this.destino = desConta;
		this.valor = valor;
	}
	
	public abstract void executar();

	public Conta getOrigem() {
		return origem;
	}

	public Conta getDestino() {
		return destino;
	}

	public BigDecimal getValor(){
		return valor;
	}
	
	

}
