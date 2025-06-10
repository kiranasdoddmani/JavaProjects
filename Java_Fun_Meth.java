// Functions And Methods --> Both Are Perform Same Operation Which Are Bolck Of Code Which Can Store Data 

// 1.Functions --> Functions Can Call Directly  (static means Function) 
// 2.Methods --> Methods Are Call By Creating an Class Of Objects  (no static means methods)
 
package Oops.com;
import java.util.*;
public class Oops_Function_Methods {
/*
	// 1. Print a Givem Name In A Function
	
	public static void PrintMyname(String name) {
		System.out.println("PrintMyname:-->"+name);
	}
	
	// 2. Make a Function to Add 2 Number And Return The Sum
	
	// int  ...arr -- its is varible Arrgument Syntax if we use No need pass Arguments 
	public static int sum(int ...arr) {
		
		int result=0;
		for(int e:arr) {
			result +=e;
		}
		return result;
	}
	
	// 3. Make a Functiom to multiple of 2 number return the product
	
	public static int Product(int a,int b) {
		return a*b;
	}
	
	// 4. Factorial and Fibonocci Number --> these are recursion examples(recursion means A Function can be call by itself)
	
	public static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	public static int Fib(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return Fib(n-1)+Fib(n-2);
		}
	}
	
	
	
	public static int logic(int a,int b) {   // --> if static is not used then by creating objects we call them
		if(a<b) {
			return a+b;
		}
		else {
			return a*5+b;
		}
		}
	
	public static  void telljoke2() {
		System.out.println("I Tell The Joke...!");
	}
	*/
	/*
	// Changes The Values Example(int Function) 
	
	public  static void change2(int a)
	   {
		   a=98;
	   }
	
	// case 2: --> In Array we passing reference so Value will changes during the declartion ex--->
	   public  static void change4(int []arr) {
		   arr[0]=101;
	   }
	*/
	
	/*
	// Method OverLoding
	
	public static void foo() {
		System.out.println("Good Morning Fooo..!");
	}

	public static void foo1(int a) {
		System.out.println("Good Morning Fooo..! "+a+" times");
	}

	public static void foo2(int a,int b) {
		System.out.println("Good Morning " + a +" Fooo..! " +b+  " times");
	}
	*/
	// 2. Methods
	/*
	public  int logic1(int a,int b) {   // --> in this code we not use static  so by creating object we call the logic1
		if(a<b) {
			return a+b;
		}
		else {
			return a*5+b;
		}
		}
	
	public void telljoke() {
		System.out.println("I Tell The Joke...!");
	}
	
	public void meth() {
		System.out.println("Hello Evrey One I am Kirana S Doddmani");  // ---> Method Declaration Hence we not use Static (Static is not Used in Methods 
		// -- but Static can be used in Function becoz in function we can not create the objects
	}
	*/
	
	/*
	// Changes The Values Example (in Methods)
	    
	// case 1 --> Normal
	   public  void change(int a)
	   {
		   a=98;
	   }
	   
	// case 2: --> In Array we passing reference so Value will changes during the declartion ex--->
	   public void change3(int []arr) {
		   arr[0]=101;
	   }
	*/
	/*
	// Method OverLoding
	
		public  void foo() {
			System.out.println("Good Morning Fooo..!");
		}

		public  void foo1(int a) {
			System.out.println("Good Morning Fooo..! "+a+" times");
		}

		public  void foo2(int a,int b) {
			System.out.println("Good Morning " + a +" Fooo..! " +b+  " times");
		}
		*/
	
	
	     //VARIBLE ARGUMENTS IN JAVA  (In Function)
	
	// passing no arguments...
	
	/*    public static int sum(int ...arr) {
	    	
	    	int result=0;
	    	for(int e:arr) {
	    		result +=e;
	    	}
	    	return result;
	    }
	      */
	
	// passing atleat one arguments......
	
   /*     public static int sum(int x,int ...arr) {
	    	
	    	int result=x;
	    	for(int e:arr) {
	    		result +=e;
	    	}
	    	return result;
	    }
	*/
	
	
	//VARIBLE ARGUMENTS IN JAVA  (In Methods)
	/*
		// passing no arguments...
		
		    public  int sum(int ...arr) {
		    	
		    	int result=0;
		    	for(int e:arr) {
		    		result +=e;
		    	}
		    	return result;
		    }
		      
		*/
		// passing atleat one arguments......
		/*
		
		 
	      public int sum(int x,int ...arr) {
		    	
		    	int result=x;
		    	for(int e:arr) {
		    		result +=e;
		    	}
		    	return result;
		    }
		*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Function
		
	/*	
	 
	    System.out.println(sum());  // --> this show o/p as Zero But If we pass one arguments then is shown error 
		System.out.println(sum(10,1,2,3,4,5,6));
	
*/
		
		
	//	System.out.println(sum());  // --> Show as Error
	//	System.out.println(sum(10,1,2,3,4,5,6));  // 10 is an X value
		
		
		
		// 2. Methods
		
	/*	Oops_Function_Methods obj=new Oops_Function_Methods();
		System.out.println(obj.sum(1,2,3,4,5));
		System.out.println(obj.sum());
		
		*/
	
		/*
		 
		 
		Oops_Function_Methods obj=new Oops_Function_Methods();
		System.out.println(obj.sum(1,2,3,4,5));
	//	System.out.println(obj.sum());  //--> this sown error becoz we pass Atleast one argument
		
		*/
		
		
	/*	// 2.Methods
	 * 
	 * Oops_Function_Methods obj=new Oops_Function_Methods();  // --> Method Calling By Creating an Object of Class
		System.out.println(obj.logic1(5, 9));
		obj.meth();
		
		obj.telljoke();
	*/	
	/*	Oops_Function_Methods obj=new Oops_Function_Methods();
		obj.foo();
		obj.foo1(60);
		obj.foo2(60,70);
		*/
	/*	int x=45;
		obj.change(x);
		System.out.println("The Value a is :"+x);
		*/
		
	/*	int []arr= {1,2,3,4,5,6};
		obj.change3(arr);
		System.out.println("The  change the value of array is :"+arr[0]);
		System.out.println("The  change the value of array is :"+arr[2]);
		*/
		
	/*	System.out.println("Enter The Input:-->");
		Scanner sc=new Scanner(System.in);
		
	    int a=sc.nextInt();
		int b=sc.nextInt();
		int Mul=Product(a,b);
		String name=sc.nextLine();
		
		PrintMyname(name);
		
		
	//	int a=sc.nextInt();
	//	int b=sc.nextInt();
		int num=sum(a,b);
		System.out.println(num);
		
		
		
	//	System.out.println(sum(1,2,3,4));
		
	//	System.out.println(Mul);
		
		System.out.println(Product(5,3));
		System.out.println(fact(5));
		System.out.println(Fib(5));
		
		*/
		
	//	System.out.println(logic(2,3));
		
	//	telljoke2();
		
		/*
		int x1=452;
		change2(x1);
		System.out.println("The Value a is :"+x1);
		
		int []arr1= {1,2,3,4,5,6};
		change4(arr1);
		System.out.println("The  change the value of array is :"+arr1[0]);
		System.out.println("The  change the value of array is :"+arr1[2]);
		
		*/
		
	/*	foo();
		foo1(5);
		foo2(5,6);
		*/
	}

}
