package comm.example;

public class MyThreadDemo1 implements Runnable{
	
	public static void main(String[] args)
	{
		MyThreadDemo1 myThread1=new MyThreadDemo1();
		MyThreadDemo2 myThreadDemo2=new MyThreadDemo2();
	
		Thread t1=new Thread(myThread1);
		Thread t2=new Thread(myThread1);
		t1.start();
		t2.start();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		for(int i = 0;i<20;i++)
		{
			System.out.println("i==>"+i);
			if(i==10)
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