package src;

public class Main {
	public static void main(String[] args) {
        Builder builderNotebook = new ConcretBuilderNotebook();
        Diretor director = new Diretor(builderNotebook);

       

        Computador notebook =  director.constructComputer();

        System.out.println(notebook.toString());
        
        Builder builderDesktop = new ConcretBuilderDesktop();
        Diretor directorDesktop = new Diretor(builderDesktop);
        
        Computador desktop =  directorDesktop.constructComputer();
        
        System.out.println(desktop.toString());
        
    }
}
