package MyPackage;

public class StartAbstract  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1=new TwoWheeler();
		v1.start();
		v1.stop();
		
		Vehicle v2=new FourWheeler();
		v2.start();
		v2.stop();
	}


	
		

}
