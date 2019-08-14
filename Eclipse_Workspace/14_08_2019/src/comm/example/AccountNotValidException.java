package comm.example;

public class AccountNotValidException extends Throwable{
	
	private String message;
	private static final long serialVersionID=1L;
	
	public AccountNotValidException()
	{
		super();
	}
	
	public AccountNotValidException(String message) {
		super();
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
