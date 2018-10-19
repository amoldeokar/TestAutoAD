package MyPackage;

public class StartInterface implements MyInterface,MyInterface2 {

	
	@Override
	public void method1() {
		System.out.println("Interface1 Method1..");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 Method2..");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 Method3..");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartInterface SI1=new StartInterface();
		SI1.method1();
		SI1.method2();
		SI1.method3();
	}

}
