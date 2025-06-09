// Operators

package Oops.com;
import java.util.*;
public class Oops_Operators {
	public static void main(String[] args)  {
	   
	// 	bitwise     // BitWise (& | !)
		
		// Bitwise Operators
		
		// Git Bit 
	/*	int n=5;
		int pos=3;
		int bitmask=1<<pos;
		
		if((bitmask&n)==0) {
			System.out.println("Bit was Zero");
		}
		else {
			System.out.println("Bit was not Zero");
		}

	
	    // Set Bit
	   
	    // --> or
	
	   int n=5;
	   int pos=1;
	    int bitmask=1<<pos;
	    
	    int newNumber=(bitmask|n);
	    System.out.println(newNumber);
	    
	  
	    
		// Clear Bit
		
		// And With not
		int n=5;
		int pos=2;
		int bitmask=1<<pos;
		
		int NewNumber=~(bitmask);
		int Number=(NewNumber&n);
		System.out.println(Number);
		*/
		
		
		// Update Bit
		
		// if oper=0 then perform And With Not
		// if oper=1 then perform Or
		
	/*	int n=5;
		int pos=2;
		int bitmask=1<<pos;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int oper=sc.nextInt();
		
		if(oper==0) {
			int  newnumber=~(bitmask);
			int num=newnumber&n;
			System.out.println(num);
		}else {
			int newy=bitmask|n;
			System.out.println(newy);
		}
		*/ 
		
		// Arithematic Operator 
		
		/*   + --> Addition
		 *   - --> Substrcation
		 *   * --> Multiplication
		 *   / --> Divide
		 *   % --> Modulus
		 *    
		 * */
		
		// Assingment Operarotrs
		
		/*  +=
		 *  -=
		 *  %=
		 *  *=
		 *  
		 * */
		
		// Comparssion Operator
		
		/*  ==
		 * >=
		 * <=
		 * >
		 * <
		 * 
		 */
		
		// Logical Operators
		
		//  && (And), || (or), ! (not)
		
		/*  For And
		 * 
		 *  true && false=flase
		 *  true && true=true
		 *  false && false=false
		 *  false && true=false
		 *  
		 * */
		
		/*  For Or
		 * 
		 *  true || false=true
		 *  true || true=true
		 *  false || false=false
		 *  false || true=true
		 *  
		 * */
		
		/*  For Or
		 * 
		 *  ! true=false
		 *  ! false=true
		 *  
		 * */
		
	/*	boolean a=true;
		boolean b=false;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(!a);
		*/
}
}



// String Methods
//--> String is an Class Which Can be Used as a Data Type

package Oops.com;
import java.util.*;
public class Oops_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		// name.length()
		String name="kirana s doddmani";
		System.out.println(name.length());
				
		// name.toUppercase()
		System.out.println(name.toUpperCase());
		
		// name.toLowercase()
		System.out.println(name.toLowerCase());
		
		// name.trim (--> trim which is used to Remove the Spaces-->)
		String Name="   Harry with code    ";
		System.out.println(Name.trim());
		
		// name.Substring()
		System.out.println(name.substring(5));
		System.out.println(name.substring(5, 8));
		
		// name.replace (only one charater will be replace
		System.out.println(name.replace('k','v'));
		System.out.println(name.replace("kirana","varun"));
		
		// name.startwith()
		System.out.println(name.startsWith("kirana"));
		
		// name.endswith()
		System.out.println(name.endsWith("doddmani"));
		
		// name.charAt()
		System.out.println(name.charAt(5));
		
		// name.indextof() 
		System.out.println(name.indexOf('a'));  //--> For char
		System.out.println(name.indexOf("na")); // --> For String
		
		// name.lastindexof()
		System.out.println(name.lastIndexOf('n'));
		System.out.println(name.lastIndexOf("an"));
		System.out.println(name.lastIndexOf('d', 11));
		
		// name.equals()
		System.out.println(name.equals("kirana s doddmani"));
		System.out.println(name.equals("Kirana S Doddmani"));
		
		// name.equalsIgnoreCase()  (-->This Method Ignore Lower and Uppercase -->)
		System.out.println(name.equalsIgnoreCase("Kirana S doDDmani"));
		
		*/
		
		// Escape Sequence Character
	//	--> which contains More Than one Character
		
		/* 
		 *   \n --> new Line
		 *   \t --> for tab
		 *   \" --> It will act like double cout
		 *   \\ --> Black slash
		 * */
		
		
		/*  %d --> formatter specifier
		 *  %s --> String
		 *  %c --> for character
		 *  %f --> float
		 *  
		 *  ; --> SemiColon is an Terminator
		 *  
		 *  %.2f --> printf only two decimal
		 *  %8.2f --> for 8 Space and two decimal
		 *  
		 *   sc.next(); --> only one Word Print
		 *   sc.nextLine(); --> Print Full Sentence
		 * */
		
		// Conditional Statements
		
		// if statements , if else statements and switch Statements
		
		// if statements,if else statements
	/*	System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int obj=sc.nextInt();
		if(obj==1) {
			System.out.println("Hello Every One");
		}
		else if(obj==2) {
			System.out.println("object 2");
		}
		else {
			System.out.println("No Object");
		}
		*/
	/*	switch(obj) {
		case 1:
			if(obj==1) {
			System.out.println("object 1");
			}
		case 2:
			if(obj==2) {
				System.out.println("object 2");
			}
	case 3:
		if(obj==3) {
			System.out.println("object 3");
		}
			
	}
	*/
	
		
	/*	char obj1='A';
		switch(obj1) {
		case 'A':
			System.out.println("Hello I am A");
			break;
		case 'S':
		System.out.println("object 2");
		break;
	case 'K':
			System.out.println("object 3");
		break;
		default:
			System.out.println("Welcome");
	}	
	*/
		
		// Loops ,Break and Continue Statements
		
	/*	// For Loop and Break Statements
		int n=5;
		for(int i=0;i<=n;i++) {
			System.out.println(i);
			if(i==3) {
				System.out.println("Hello Every One");
				break;
			}
		}
		System.out.println("Java Is Great....!");
		*/
		
		
		// For Loop and Continue Statements
		
		/*		int n=5;
				for(int i=0;i<=n;i++) {
					System.out.println(i);
					System.out.println("Java Is Great....!");
					if(i==3) {
						System.out.println("Hello Every One");
						continue;
					}
				}
			*/	
		
		
		  // While Loops
		
	//   while(1) ---> this condition is not used int java it used only in c programming langauge
		
		// while also used for boolean condition
		
		// while condition will first check the condition then Excecute
		
	/*	int n=5;
		int i=0;
		while(i<n) {
			System.out.println(i);
			i++;
		}
		
		// Do While
		// --> Do While loop will Similar to while loop but onr thing do while first Excecute the check the condition
		
		do {
			i++;
			System.out.println("Hello....!");
		}while(i<n);
		*/
		
		
		
		// Intrduction to Arrays
		
		// Two Types    1.One Dimenstional Array
		//              2.Two Dimenstional Array
		// Arraya --> Array is an object           -->  new is an KeyWord
		
	//	--> One Dimenstional Array
		
	/*	int [] marks=new int[5];
		marks[1]=10;
		marks[2]=20;
		marks[3]=30;
		marks[4]=40;
		marks[5]=50;
		System.out.println(marks[2]); */
		
		// They Are Thre Ways To Create One Dimenstional Array
		
		/*  1. Declarationa Then Initilization
		 *   
		 *   int []marks;
		 *   marks=new int[5];
		 *
		 * */
		
		/*  2. Declarationa And Initilization
		 * 
		 *   int []marks=new int[5];
		 * 
		 * */
		
		/*  3. Declarationa And Memory Allocation
		 * 
		 *   int []marks={10,20,30,40,50};
		 * 
		 * */
		
	/// using for loop
		
	//	int []marks={10,20,30,40,50};
	/*	System.out.println(marks.length);
		
		for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
		}
		*/
		
		
		// For Array In Revesing Order
		
	/*	for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}
		*/
		
		// Also Printing The Array Using The For Each loop
		
	/*	for(int elements:marks) {
			System.out.println(elements);
		}
		
		*/
		
		// Two Dimenstional Array
		// [] --> first row and [] --> column
		
	/*	int [][] marks=new int[2][3];
		marks[0][1]=101;
		marks[0][2]=102;
		marks[0][3]=103;
		marks[1][1]=201;
		marks[1][2]=202;
		marks[1][3]=203;
		System.out.println(marks[1][2]);
		*/
		
		
		// Two Dimenstinal Array Using For Each Loop
		
		int [][] marks= {
				{1, 2, 3},
				{4, 5, 6}
				};
		for(int[] e:marks) {
			for(int num:e) {
			System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
