
        // 1.Error And Exceptions
/*
 *       They are Three Types Of Exception   1.Syntax Error 2.Logical Error 3.RunTime Error (Run time error is also called exception error)
 * 
 *  logica error best example is Prime number
 * 
 * 
 *        // 2. try and ctach block
 *         try and catch block occur when a program is exceuted and distrub the normal flow of instruction
 *         1. checked -- complile time exception
 *         2. unchecked -- runtime exception
 *         
 *     // Commonly occur exception
 *      null pointer exception
 *      arithematic exception
 *      array indexboundofexception
 *      illegal argument exception
 *      catch(IllegalArgumentException e) {
			System.out.println("HaHa");
		}
 *      number format exception
 *      
 *      
 *      // 3. Handled Specific Exception
 *      
 *      try{
 *       // code
 *      }
 *      catch(I O Exception){
 *       // code
 *      }
 *      catch(Arithematic Exception){
 *       // code
 *      }
 *      catch(Exception e){
 *       // code
 *      }
 *      
 *      // 3.Nested try and catch block of  code
 *      try{
 *       // code try{
 *      }
 *      catch(I O Exception){
 *       // code
 *      }
 *      }
 *      catch(Arithematic Exception){
 *       // code
 *      }
 */
package Oops.com;

import java.util.*;
public class Oops_ErrorAndException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // 1.Syntax Error
	/*	
	      int a=10;
		System.out.println(b);     --> Shown An Syntax Erro Becoz B is not declared
		
		
		
		// 2. Logiacal Error        (logical error is also called as a Debug Error)
		
		// print prime number
		for(int i=0;i<5;i++) {
			System.out.println(2*i+1);      // output:- 2 ,3,5,7,9 but 9 is not prime number so it is logical error
			}
			
		
		// 3. RunTime Error (Exception Error)
		 * --> These runtime error can be handled by try and catch
		
           int a=10;
           int b=0;
           int c=a/b;
           System.out.println(c);     //  --> Shown Runtime Error     
           
           //       output:--
    //       Exception in thread "main" java.lang.ArithmeticException: / by zero
    //   	at Oops/Oops.com.Oops_ErrorAndException.main(Oops_ErrorAndException.java:39)  
		
		*/
		
		
		// Try And Catch Exception
	/*	
		int a=1000;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		} catch(Exception e){
			System.out.println(e);
		}
		
		// output:-- java.lang.ArithmeticException: / by zero
		 */
		
		// ArrayIndexOutOfBoundException
	/*	
		int marks[]=new int[3];
		marks[0]=100;
		marks[1]=200;
		marks[2]=400;
		 
		System.out.println("Enter the Valid Index:--");
		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		while(flag) {
			int index=sc.nextInt();
			System.out.println("Enter the number you want to divide:");
			int number=sc.nextInt();
		try {
			System.out.println("Welocme Nested Try and Catch Block..!");
			try {
				System.out.println("The Value Of Enterd Index is:-"+marks[index]/number);
				flag=false;  //[becoz if condition is right then it will stop further moving]
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			catch(ArithmeticException e) {
				System.out.println(" ArithmeticException occured!");
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println("Some Other Exception Are Occured..!");
		}
	}
	*//*
		int[]marks=new int[3];
		marks[0]=40;
		marks[1]=45;
		marks[2]=50;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Arry index value");
		int index;
		boolean flag =true;
		int i=0;
		while(flag && i<5) {
			try {
				index=sc.nextInt();
				System.out.println("The Arry Index value[marks[index]-" +marks[index]);
				break;
			}
			catch(Exception e) {
				System.out.println("Invalid Index");		
				i++;
			}
		}
		if(i>=5) {
			System.out.println("Error");
		}
		*/
	}
}




// Custom Exception Error
/*   
 *   We can Write Our Own Custom Exception Error Using Exception Classs
 *   . This makes the custom exception a checked exception, 
 *   meaning it must be either handled using a try-catch block or declared in the method signature using throws.

 *        Exception Class Have a Three Import Methods 
 *         
 *         1.String to String
 *         2.void printstacktree   //these are the three methods which are alredy defined
 *         3.String getmessage
 *         
 *         
 *         In This Exception class We know Three Types methods These Methods are shown above
 *          in this program we use two methods  ie Custom Exception Class
 *          
 *          // Finally Block 
 *          which contain the code which is always exceuted whether excpetion handled or not
 *          
 *          we can also write try without using catch block of code 
 *          
 *          Throw is an exception explicity by the programmer
 *          
 *          throws is used to decalre an exception this give an information o the programmer that might bea an exception so it is better to
 *          be preapaare with try and catch block of code
 */
package Oops.com;

import java.util.Scanner;
/*
class MyException extends Exception{
	public String toString() {
		return "I am String";
	//	 return super.toString()+"I am  String";
	}
	public String getMessage() {
		return "I am GetMessage";
		// return super.getMessage()+"I am GetMessage";
	}
}
*/
             // Throw And Throws  // --. Throw and Throws are called which always Sourrend with try and catch

class NegativeRadiusException extends Exception{
	public String toString() {
		return "The Given Input is Negative";
	//	 return super.toString()+"I am  String";
	}
	public String getMessage() {
		return "I am GetMessage";
		// return super.getMessage()+"I am GetMessage";
	}
}

public class Oops_EXceptionEorror {

	public static double area(int r)throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double result= (Math.PI*r*r);
		return result;
	}
	public static int Divide(int a,int b)throws ArithmeticException{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Finally Block Of Code
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("These is finally Block...!");
		}
		
/*        // Throw and Throws
                 try {
                	 int Dc=Divide(5,0);
            		 System.out.println(Dc);
				//	double ar=area(-1);
				//	System.out.println(ar);
            		 
				} catch (Exception e) { 
					//catch (NegativeRadiusException e) {
					// TODO Auto-generated catch block
					 e.printStackTrace();
				}
                 */
		
		//      Custom Exception Class
/*		System.out.println("Enter the Number:-");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a<9) {
			try {
				throw new MyException();
			//	throw new ArithmeticException();  //  --> this shown null 
			}
			catch(Exception e) {
				System.out.println(e.getMessage());   
				System.out.println(e.toString());
				System.out.println(e); // --> if we print only e then print I am String output
				e.printStackTrace();
				  //  -->(this not a error) this is PrintstackTrcae output:--I am String  
				 //         at Oops/Oops.com.Oops_EXceptionEorror.main(Oops_EXceptionEorror.java:42)
				// PrintstackTrace which can used in complex programming languages
			}
		}
		else {
			System.out.println("The If condition is not satifised..");
		}
		System.out.println("The Program Is Finsihed...!");
		*/
	}

}
