package model.exceptions;

public class IllegalApartment extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public IllegalApartment(String msg) {
		super(msg);
	}

}
