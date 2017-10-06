package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.ValidationException;

/**
 * Model Class
 * 
 * @author Valdecir
 *
 */
public class Professional {
	
	private String email;
	private String unicPass;
	
	/**
	 * Simple Constructor
	 */
	public Professional() {

	}
	
	/**
	 * Constructor
	 * 
	 * @param email
	 * @param unicPass
	 * @throws Exception 
	 */
	public Professional(String email, String unicPass) throws Exception {
		super();
		this.setEmail(email);
		this.setUnicPass(unicPass);
	}
	
	/**
	 * M�todo de valida��o de e-mail
	 * @param email
	 * @throws Exception
	 */
	public static void validaEmail(String email) throws Exception{
	    Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
	    Matcher m = p.matcher(email); 
	    
	    if (!m.find())
	    		throw new Exception("O e-mail informado � inv�lido");
	}
	
	/**
	 * M�todo de valida��o de senha
	 * @param unicPass
	 * @throws Exception
	 */
	public static void validaUnicPass(String unicPass) throws Exception {
		if (unicPass.length() < 8)
			throw new Exception("A senha deve conter no m�nimo oito caracteres");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		validaEmail(email);
		this.email = email;
	}

	public String getUnicPass() {
		return unicPass;
	}

	public void setUnicPass(String unicPass) throws Exception {
		validaUnicPass(unicPass);
		this.unicPass = unicPass;
	}

	/**
	 * M�todo que retorna uma String de descri��o do objeto 
	 */
	@Override
	public String toString() {
		return "\n\nPROFESSIONAL\nEmail: " + this.getEmail() 
		+ "\nSenha: " + this.getUnicPass();
	}

}
