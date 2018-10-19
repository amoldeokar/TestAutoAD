package MultiThread;

public class MultiThreadTest {

	
	public static void main(String[] args) {
		
		ImplementDemo t1 = new ImplementDemo("Thread 1");
		t1.start();
		ImplementDemo t2 = new ImplementDemo("Thread 2");
		t2.start();
		ExtendDemo t3 = new ExtendDemo("Thread 3");
		t3.start();
		ExtendDemo t4 = new ExtendDemo("Thread 4");
		t4.start();

	}

}
