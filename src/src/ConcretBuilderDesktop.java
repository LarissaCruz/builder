package src;

public class ConcretBuilderDesktop implements Builder{
	Computador CPU ;

	public ConcretBuilderDesktop() {
		this.CPU = new Computador();
	}
	@Override
	public void setSistemaOperacional() {
		// TODO Auto-generated method stub
		this.CPU.setSistema("Linux");
	}

	@Override
	public void setMemoria() {
		// TODO Auto-generated method stub
		this.CPU.setMemoria("DRR4");
	}

	@Override
	public void setArmazenamento() {
		// TODO Auto-generated method stub
		this.CPU.setTipoArmazenamento("HD");
	}
	
	public Computador getComputador() {
		return this.CPU;
	}

}
