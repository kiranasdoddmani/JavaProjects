
 //   AcessModifier  And Thread
         // Public , Protected , Default(No Modifier) And Private  
           
                                   // class            // Package           // subclass       // world     
         // Public                    Yes                   Yes                   Yes             Yes
       
         // Protected                 Yes                   Yes                   Yes              No   

         // Default(No Modifier)      Yes                   Yes                   No               No

         // Private                   Yes                   No                    No               No

 // MultiThreading...which act as a Both MultiTasking and MultiProcessing
                  
              /*  
               *  Multithreading is More Faster 
               *  Which Can Share The Memory
               *  Thread is a Light weight where as Process is Very Heavy Weight..
               *  
               *  MultiThreading which is used for Concurrently Exceution of methods 
               *  we also use one default method ie Thread (extends Thread...means extend is Inherit keyword Thread is InBuilt Function)
               *  
               *  They Are Two Ways To Create a Thread 
               *  
               *  1.Using Extends Thread   (we can Directly call Method By using start keyword)
               *  2.Implements Runnable interface..      (Indirectly call Method )
               *  
               *  
               *  1.Using Extends Thread  
               *  
               *  But one problem is execution will not be sequence acc to we given
               *  
               *  The public void run() method is the entry point for a thread's execution in Java
               *  
               *  - The run() method contains the task that the thread is supposed to perform.
- When you call start() on a thread, it internally calls the run() method in a new thread of execution.
- If you call run() directly (without start()), it behaves like a normal method and runs in the current thread, not a new one.

                    
                    Thread life cycle
                    
                    1.new --> Thread is Created by new involving start(); keyword <-----------------------------
                       |                                                                                        |
                    2.runnable --> after involving start() & before selected to be run by the schedular  ---- > 3.no ruunable --> thread is alive but blocked
                        |
                    4.terminated --> run() method is exicited
                    
               */

package Oops.com;

/*
         class AccessModifier{
        	 public int a=10;
        	 protected int b=4;
        	 int c=5;
        	 private int d=3;
        	 public void run() {
        	 System.out.println(d);
         }
         }
         class PrivateModifier extends AccessModifier{
        	 public void Meth() {
        		 System.out.println(a);
        		 System.out.println(b);
        		 System.out.println(c);
        	//	 System.out.println(d);       --> Shows an Error 
        	 }
         }
        
         */
         
        

             //  1.Using Extends Thread    
/*
                class Mytharcar extends Thread{
                	
                	public void run() {
                		System.out.println("Say Hi To Every One...!");
                		System.out.println("Hello Budies..!");
                	}
                }
                
                class Mytharcar2 extends Thread{
                	public void run() {
                		System.out.println("I Called Meth 1 Method...!");
                		System.out.println("I Called Meth 2 Method...!");
                	}
                	
                }
                */

               //     2.Implements Runnable interface..      (Indirectly call Method )

class Mytharcar implements Runnable{
	
	public void run() {
		System.out.println("Say Hi To Every One...!");
		System.out.println("Hello Budies..!");
	}
}

class Mytharcar2 implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("I Called Meth 1 Method...!");
		System.out.println("I Called Meth 2 Method...!");
	}
	}
}

public class Oops_AcessModifierAndThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //	     2.Implements Runnable interface..      (Indirectly call Method )
		Mytharcar bullet=new Mytharcar();
		Thread gun=new Thread(bullet);
		gun.start();
		
		Mytharcar2 bullet2=new Mytharcar2();
		Thread gun2=new Thread(bullet2);
		gun2.start();
		
		/*        //  1.Using Extends Thread
		Mytharcar T1=new Mytharcar();
		Mytharcar2 T2=new Mytharcar2();
		T1.start();
		T2.start();
		
	//	T2.Meth2();
	 */
	
		/*
		 
		PrivateModifier Sc=new PrivateModifier();
		Sc.Meth();
	//	Sc.run();
		
		*/
	}

}






// Constructor In Thread...   And Thread Priority  And Java Thread methods 1.Thread.jion();     2.Thread.sleep(milisecond);

/*
 * Constructor In Thread it gives id(ie get.id()) and name(ie get.name())
 * 
 * thread.jion();--> this method is used untill the one methods is completly exceution
 * thread.sleep(milisecond);--> this method it hold the exceution for each exceution(ie hold miliseconds)
 * 
 * both thread are used under try and catch Block
 */

package Oops.com;

class MyNewThar extends Thread{
	public MyNewThar(String name) {
	super(name);
	//	System.out.println("Your Name Is:--"+name);
	}
	public void run() {
		for(int i=0;i<=1;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("My Name Is "+this.getName());
		System.out.println("I Created New Thread....!");
	}
}
	}


class MyNewThar2 extends Thread{
	
	public void run() {
		for(int i=0;i<=1;i++) {
		System.out.println("I am Run Method");
		System.out.println("I Created New Run  Thread....!");
	}
}
	}
             
              // Max And Min Prioroty
 /*
  class MyNewThar extends Thread
  {
	  
	  public MyNewThar(String name) {
		//  System.out.println("Your Name Is:--"+name);
		  super(name);
  }
	  public void run() {
		  for(int i=0;i<=1;i++) {
			System.out.println("Yes U r name Plss..."+this.getName() ); 
		  }
	  }
  }
  */
public class Oops_NewConstrcutorThrejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyNewThar obj=new MyNewThar("Kirana s Doddmani");
		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyNewThar2 obj2=new MyNewThar2();
		obj2.start();
		
		
	//	System.out.println(obj.getName());
	//	System.out.println(obj.getId());
	//	System.out.println(obj.getPriority());
		
		
		/*
		MyNewThar obj1=new MyNewThar("kirana s doddmani");
		MyNewThar obj2=new MyNewThar("Varuna s doddmani");
		MyNewThar obj3=new MyNewThar("Charana s doddmani");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		obj3.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(Thread.MIN_PRIORITY);
		*/
	}

}
