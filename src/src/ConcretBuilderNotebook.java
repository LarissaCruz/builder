package src;


public class ConcretBuilderNotebook implements Builder{
	Computador CPU ;
	
	public ConcretBuilderNotebook() {
		this.CPU = new Computador();
	}
	@Override
	public void setSistemaOperacional() {
		// TODO Auto-generated method stub
		this.CPU.setSistema("Windows 10");
	}

	@Override
	public void setMemoria() {
		// TODO Auto-generated method stub
		this.CPU.setMemoria("DRR3");
	}

	@Override
	public void setArmazenamento() {
		// TODO Auto-generated method stub
		this.CPU.setTipoArmazenamento("SSD");
	}
	
	public Computador getComputador() {
		return this.CPU;
	}
}
