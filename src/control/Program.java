package control;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.ProductBacklog;
import model.Professional;
import model.Project;
import model.Team;
import model.UserStory;

public class Program {

	/**
	 * M�todo para testar o modelo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Project pj1 = new Project("ScrumJ", "Ferramenta para r�pida implementa��o do m�todo SCRUM em pequenos projetos.");
//		System.out.println(pj1);

		Professional		pf1		= new Professional("vvaldecirr@hotmail.com", "123456");
		Team				team		= new Team("Analista", pf1, pj1);
		ProductBacklog	pbl1		= new ProductBacklog(new Date(), pj1, pf1);
		UserStory		us1		= new UserStory(1, "Impress�o de relat�rios", pbl1);
		System.out.println(us1);
	}

}
