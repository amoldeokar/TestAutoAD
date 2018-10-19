package MultiThread;

public class ImplementDemo implements Runnable {

	private Thread t;
	private String t_name;
	
	public ImplementDemo (String name){
		t_name = name;
		System.out.println("Creating " + name);
	}
	
	public void run(){
		System.out.println("Running " + t_name);
		try {
        for(int i=4; i>0; i--){
        	System.out.println(t_name +" "+ i);
        	Thread.sleep(50);
			} 
		}
		catch (InterruptedException e) {
				e.printStackTrace();
			}
        
	}
        
      public void start(){
    	  System.out.println("Starting " +  t_name );
          if (t == null) {
             t = new Thread (this, t_name);
             t.start ();
      }
	}
}
