package control;

import model.Project;

public class Program {

	/**
	 * M�todo para testar o modelo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Project pj1 = new Project("ScrumJ", "Ferramenta para r�pida implementa��o do m�todo SCRUM em pequenos projetos.");
		
		System.out.println(pj1);
	}

}
