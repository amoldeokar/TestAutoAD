package MyPackage;

///Threads can be implementated using Runnable Interface or extending Thread class
//but due to Multiple Inheritance Runnable Interface is used mostly

public class RunnableDemo implements Runnable{
	
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String name) {
		this.threadName=name;		
	}

	@Override
	public void run() {
		System.out.println("thread is running..." + this.threadName); 
		
	}
	
	

}


/*

package ThreadDemoPack;

import java.util.ArrayList;  
import java.util.Date;  
import java.util.List;  
  
public class ThreadDemoClass implements Runnable   
{  
  public boolean running = false;  
    
  public ThreadDemoClass ()  
  {  
    Thread thread = new Thread(this);  
    thread.start();  
  }  
    
  public static void main (String[] args) throws InterruptedException  
  {  
    List<ThreadDemoClass> workers = new ArrayList<ThreadDemoClass>();  
      
    System.out.println("This is currently running on the main thread, " +  
        "the id is: " + Thread.currentThread().getId());  
  
    Date start = new Date();  
  
 
    for (int i=4;i>0 ; i--)  
    {  
      workers.add(new ThreadDemoClass());   
    }  
      
  
    for (ThreadDemoClass worker : workers)  
    {  
      while (worker.running)  
      {  
        Thread.sleep(100);  
      }  
    }  
      
    Date end = new Date();  
      
    long difference = end.getTime() - start.getTime();  
      
    System.out.println ("This whole process took: " + difference/1000 + " seconds.");  
  }  
    
  @Override  
  public void run()   
  {  
    this.running = true;  
    System.out.println("This is currently running on a separate thread, " +  
        "the id is: " + Thread.currentThread().getId());  
      
    try   
    {  

      Thread.sleep(5000);  
    }   
    catch (InterruptedException e)   
    {  
  
      Thread.currentThread().interrupt();  
    }  
    this.running = false;  
  }  
}  


*/