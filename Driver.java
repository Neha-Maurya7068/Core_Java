package multithreading;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		MyThread t3 = new MyThread();
		
//		t1.setName("Deepanshu");
//		t2.setName("Neha");
//		t3.setName("Abhinav");
		
//		t1.run();
//		t2.run();
		
		t1.start();
		t1.join();
		
//		t2.start();
//		t2.join();
//		
//		t3.start();
//		t3.join();
		
	}

}
