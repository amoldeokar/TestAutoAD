package MyPackage;

public class ArrayDemo {

		
	public static void main(String[] args) {
	
		//we can declare array by 3 ways
		//<datatype>[] arr; (or)
		//<datatype> []arr; (or)
		//<datatype> arr[];
		
		int a[];
		a=new int[5]; //declaration and instantiation
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60; error Arrayindexoutofbound because size/length is 5 only (i.e. up to index 4)
		System.out.println(a[4]);
		
		System.out.println("\n");
		
		//single dimensional
		int b[] = {20,30,40,50};
		for (int i=0; i<b.length;i++)
			System.out.println(b[i]);
		
		//OR 
		
		for(int x:b)
		{
			System.out.println(x);
		}
		
		System.out.println("\n");
		String names[]= {"Amol","Ashish"};
		for(String name:names)
		{
			System.out.println(name);
		}
				
		
		//2D [2][2] (2 rows, 2 columns)
		int c[][]={{1,2},{3,4}};
		System.out.println("\n2D array: Number of rows => "+c.length);
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}
		
 System.out.println("-======-");
			
						
				
		//multidimensional [3][4] (3 rows, 4 columns)
		int multarr[][]={{11,12,13,14},{21,22,23,24},{31,32,33}};
		System.out.println("Multidimensinal array: Number of rows => "+multarr.length);
				
		for(int i1=0;i1<multarr.length;i1++)
		{
			for(int j=0; j<multarr[i1].length;j++)
				{
				System.out.print(multarr[i1][j] + " ");
				}
			System.out.println("\n");
		}
		
		
		//Addition of 2 Matrices
		//multidimensional [3][4] (3 rows, 4 columns)
				int a1[][]={{11,12,13,14},
						    {21,22,23,24},
						    {31,32,33}};
				
				int b1[][]={{1,2,3,4},
						    {1,2,3,4},
						    {1,2,3},
						    };
				
				int c1[][];  //to Store Addition of 2 matrices into 3rd matrix
				
			//	System.out.println("Multidimensinal array: Number of rows in first matrix => "+a1.length);
			//	System.out.println("Multidimensinal array: Number of rows in second matrix => "+b1.length);
						
				int a1size=a1.length;
				int col1=a1[0].length;
							
				c1=new int[a1size][col1];  //final size of resultant array
				
				for(int i1=0;i1<a1.length;i1++)
				{
					for(int j=0; j<a1[i1].length;j++)
						{
						   
							c1[i1][j]=a1[i1][j] + b1[i1][j];
						}
					
				}
				
				System.out.println("Addition of two multidimensional arrays \n");
				
				for(int p=0;p<a1.length;p++)
				{
					for(int q=0; q<a1[p].length;q++)
						{
						System.out.print(a1[p][q] + " ");
						}
					System.out.println("\n");
				}
				System.out.println("+ \n");
				
				for(int p=0;p<b1.length;p++)
				{
					for(int q=0; q<b1[p].length;q++)
						{
						System.out.print(b1[p][q] + " ");
						}
					System.out.println("\n");
				}
				System.out.println("= \n");
				
				for(int p=0;p<c1.length;p++)
				{
					for(int q=0; q<c1[p].length;q++)
						{
						System.out.print(c1[p][q] + " ");
						}
					System.out.println("\n");
				}
				
		
	
	
	}

}
