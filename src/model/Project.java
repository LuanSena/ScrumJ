package model;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class Project {
	
	private String title;	
	private String description;
	
	/**
	 * Simple Constructor
	 */
	public Project() {
	}

	/**
	 * Constructor
	 * 
	 * @param title
	 * @param description
	 */
	public Project(String title, String description) {
		this.setTitle(title);
		this.setDescription(description);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * M�todo que retorna uma String de descri��o do objeto 
	 */
	public String toString() {
		return this.title + " - " + this.description;
	}

}
