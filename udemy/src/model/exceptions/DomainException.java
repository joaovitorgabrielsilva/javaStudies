package model.exceptions;

public class DomainException extends Exception{
	//Classes serializibles os objetos podem ser convertios para bytes
	//Para isso precisa de numero serial
	private static final long serialVersionUID = 1L; //padrão
	public DomainException(String msg) {
		super(msg);
	}
}
