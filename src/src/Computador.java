package src;

public class Computador {
	String sistema ; 
	String tipoArmazenamento ;
	String memoria ;
	
	
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getTipoArmazenamento() {
		return tipoArmazenamento;
	}
	public void setTipoArmazenamento(String tipoArmazenamento) {
		this.tipoArmazenamento = tipoArmazenamento;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String toString() {
		return "Computador [sistema=" + sistema + ", tipoArmazenamento=" + tipoArmazenamento + ", memoria=" + memoria
				+ "]";
	}
	
	
	
}
