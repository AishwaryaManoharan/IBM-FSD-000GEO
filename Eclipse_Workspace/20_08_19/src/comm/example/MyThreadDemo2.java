package comm.example;

public class MyThreadDemo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int j = 0;j<20;j++)
			{
				System.out.println("j==>"+j);
				if(j==10)
				{
					Thread.sleep(2000);
				}
			}
			}
			catch(Exception e)
			{
				
			}
		
	}

}
