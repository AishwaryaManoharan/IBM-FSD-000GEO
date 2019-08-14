package comm.example;

public class Messaging {

	private String message;
	private static Messaging messaging;
	
	public Messaging()
	{
		
	}
	
	public Messaging(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString()
	{
		return "message=" +message;
	}
	
	public static Messaging createMessagingObject()
	{
		if(messaging==null)
		{
			messaging=new Messaging();
			
		}
		return messaging;
	}
	

}
