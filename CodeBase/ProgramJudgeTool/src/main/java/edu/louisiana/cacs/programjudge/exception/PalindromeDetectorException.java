package edu.louisiana.cacs.programjudge.exception;


/**
 * 
 * Custom exception class for PalindromeDetector operations
 * @author rsunkara
 *
 */
public class PalindromeDetectorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7290995757647560297L;
	private String message = null;

	
	public PalindromeDetectorException() {
        super();
    }
	
	public PalindromeDetectorException(String p_excepMessage) {
        super(p_excepMessage);
        this.message = p_excepMessage;
    }
	 
    public PalindromeDetectorException(Throwable cause) {
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
