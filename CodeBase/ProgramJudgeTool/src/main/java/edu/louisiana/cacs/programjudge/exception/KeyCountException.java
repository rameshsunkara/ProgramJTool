package edu.louisiana.cacs.programjudge.exception;

/**
 * 
 * Custom exception class for KeyCount operations
 * @author rsunkara
 *
 */
public class KeyCountException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message = null;

	
	public KeyCountException() {
        super();
    }
	
	public KeyCountException(String p_excepMessage) {
        super(p_excepMessage);
        this.message = p_excepMessage;
    }
	 
    public KeyCountException(Throwable cause) {
        super(cause);
    }
 
    @Override
    public String toString() {
        return this.message;
    }
 
    @Override
    public String getMessage() {
        return this.message;
    }

}
