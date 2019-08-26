package comm.example;

public class ProducerConsumerTester {
	
	private final static MyStack myStack=new MyStack();

	public static void main(String[] args) {
		
		StackConsumer c=new StackConsumer(myStack);
		StackProducer p=new StackProducer(myStack);
		Thread t1=new Thread(c);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();

	}

}
