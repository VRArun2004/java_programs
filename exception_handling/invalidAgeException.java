package exception_handling;         //unchecked custom exception

public class invalidAgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

@Override
	public String getMessage() {
		return "Age not valid for voting";
	}

}


