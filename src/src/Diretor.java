package src;

public class Diretor {
	private Builder computerBuilder;
	
	  public Diretor(Builder computerType) {
	        this.computerBuilder = computerType;
	  }

	 public Computador constructComputer() {
	        computerBuilder.setSistemaOperacional();
	        computerBuilder.setMemoria();
	        computerBuilder.setArmazenamento();
	        return computerBuilder.getComputador();
	        
	 }
}
