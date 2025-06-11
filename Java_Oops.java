//Inheritence --> Inheritence Means New class Are derived from Exisiting class
 // from SubClass To(Extends) Supper class java does not support multiple inheritence but it can be achived

package Oops.com;
/*
// constructor                
class Base{                      // Constructor means The Constrcutor class name and Method name will Be Same no use public void Or
                                 // else And Super key will Be Work On Constructor
	int id=3310;
	String name="Kirana S Doddmani";
	 Base() {
		System.out.println("My Id Is:--"+id);
		System.out.println("My Name Is:--"+name);
	}
}
*/


// Inheritence   , Super And This keyword  , And Dynamic Dispatch Methods...

 // class Hi{  // super class
	
	/* Hi(int x) {
		System.out.println("Print The Value Of x"+x);
		}
	 */
	/* 
	public void Sayhello() {
		System.out.println("I wan Tell Sayhello...!");
	}
	
	public void SayHi() {
		System.out.println("This Is SayHi...!");
	}
	public void Greet() {
		System.out.println("This is Hi Method .....!");
	}
}
*/
	/*
class Hello extends Hi{    // subclass
	
//	 Hello(int x,int y) {
//		super(x);
//		System.out.println("Print The Value Of Y Is:"+y);
//	}
	
	public void Greet() {
		System.out.println("Good Morning ........!");
	}

	public void Greet2() {
	System.out.println("Good AfterNoon.........!");
}
	public void Greet3() {
		System.out.println("Good Evening......!");
	}
}
*/

 // Abstract Class And Abstract Methods

/*  
 *  Abstrct class which contain Abstract Methods 
 *  Abstrct class can be Declared without Implementation
 *  public void Greet();  --> Abstract method
 *  it is possible to create reference of abstract class but not create abstract methods...
 *  we can implements abstract methods but not create abstract objects
 *  
 */
    abstract class SayHi {
    	public void Greet() {
    		System.out.println("Good Moring Madam...!");
    	}
    	public void Greet2() {
    		System.out.println("Good AfterNoon.........!");
    	}
    		public void Greet3() {
    			System.out.println("Good Evening......!");
    		}
    }
    
    class SayHello extends SayHi{
    	public void Sayhello() {
    		System.out.println("I wan Tell Sayhello...!");
    	}
    }
    
    class SayBye extends SayHello{
    	
    }
public class Oops_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstract
		
	//	SayHi obj=new SayHi();  --> Its a abstract Class So Can not Create Abstract objects..
		
		SayBye sc=new SayBye();
		sc.Greet();
		sc.Sayhello();
		
		// Inheritence 
		
	/*	Base sc=new Base();
		sc.Base(); 
		*/
	/*	
		// Dynamic Dispatch  (--> Super class reference Sub class-->)
		
	   //  Hi Odd=new Hello(3310, 4410);
		Hi Odd=new Hello();
	     Odd.Sayhello();
	     Odd.SayHi();
	  //   Odd.Greet2();    //--> it show Error becoz Its can only Take Hi Methods if methods Are present in Both it can also take Example
		Odd.Greet();           // example:--> And Print the Hello Method...
		
		*/
	}

}
