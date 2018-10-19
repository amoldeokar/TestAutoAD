package MyPackage;

 class Boy {
	String Name;
	int age;
	float ht;
	int wt;
	String hobby;
	Boy()
	{
		
	}
	Boy(String Name,int age,int ht,int wt)
	  {
		this.Name=Name;
		this.age=age;
		this.ht=ht;
		this.wt=wt;
	}
	
	public void run(){
		System.out.println("");
		System.out.println("***************");
		System.out.println(this.Name + " is Running");
	}
	 void display(){
		System.out.println("Name : " + this.Name);
		System.out.println("Age : " + this.age);
		System.out.println("H : " + this.ht);
		System.out.println("W : " + this.wt);
		
	}	
	
	public int pointsEarned(float h,int w)
	{
		int points=0;
		h=this.ht;
		w=this.wt;
		
		if (h>5 && w <50) 
		  points=points+3;
		else if (h>4 && w <40)
		  points=points+2;
		else
		 points=points+1;
				
		return points;
	}
	
	public void displayHobby()
	{
		System.out.println(this.Name + " has '" + this.hobby + "' as a hobby");
		System.out.println("***************");
	}
	
	
	
	
}
