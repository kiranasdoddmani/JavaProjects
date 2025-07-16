/*
 *          Advanced Java-01
 *    Collelction framework:
 *     Collection framework which is used to write code quickly and efficiently     
 *     why we need collection framework becoz of resize the array , insert between them,delete elemts in array and applying certain opertaion to change the array
 *     
 *     
 *     ArrayList:- for varible size collection
 *     Set:-for distinct collection
 *     Stack:-LIFO DataStructure
 *     HashMap:-for storing key-value pairs   
 *     
 *       import java.util.*;
 *     
 *     ArrayList<Integer> l1=new ArrayList<Integer>(5);
 *     5 is an Array size
 *     LinkedList<Integer> l2=new LinkedList<>();
 *     ArrayDeque<Integer> l3=new ArrayDeque<>();
 *  
 *     
 *     Some Common  Which Are Commanly Used For i.e
 *     
 *     l1.add();
 *     l1.addAll(l2);
 *     l1.clear();
 *     l1.set(index,element);
 *     l1.remove();
 *     l1.removeAll();
 *     System.out.println(l1.setcontains());
 *     System.out.println(l1.lastindexof());
 *     System.out.println(l1.indexof());
 *     
 *     // for printing the all elements
 *     
 *     for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i));
			System.out.print(",");
			
		}
 *     
 *    // The Difference Between ArrayList and LinkedList Is Some Commond which are used in linked list  
 *    
 *    l1.addfirst();       these two commands are work on linked list
 *    l1.addlast();
 *  
 *         // ArrayDeque 
 *         ArrayDeque means it is a double ended queue means elemets are added from first also remove from first also
 *         and elemets are added form lastindex also also removed from the last index also
 *         
 *         ArrayDeque<Integer> l3=new ArrayDeque<>();
 *  
 *  
 *        // Hashing Technique
 *       In case of array--Hashing which is used for fast searching and  insertion
 *       whose fromula is f(x)=x%10;
 *       if remainder will same and one number alreay occupied during that time empty index will be occupied by anthor data..
 *       
 *       In case of linkedlist--if remainder will same and one number alreay occupied then anthor number occupied the same place in term of hash chainig
 *       
 *       collections:-
 *       HasSet
 *       HasMap
 *       LinkedHashMap
 *       HashTable
 *       
 *       HashSet:-
 *       HashSet<Integer> l1=new HashSet<>(intial capacity:16,load factor:0.75);
 *       
 *       HashSet whose Intial capacity is 16 and load factor is 0.75
 *       
 *       HasSet which have similar commands are used for adding,set,contains,clear,removal and addall etc..
 *       
 *    In HashSet we dispalyed all array elements we dont call the for loop we just call the object name
 *    System.out.println(obj.name);
*/

package Oops.com;
import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class Oops_Advanced_java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> l1=new HashSet<>();
		HashSet<Integer> l2=new HashSet<>();
		l1.add(1111);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(0);   // first zero is an index and second zero is an element
		
		
		
		
	//	l1.set(0, 310);  // set method which is used replace the element...
		
		l1.addAll(l2);
		System.out.println(l1);
		
	//	System.out.println(l1.lastIndexOf(3310));
	//	System.out.println(l1.indexOf(310));
		
	//	l1.clear();        // --> it will erase all data...
	//	System.out.println(l1.contains(5));
		
	
		
 /*
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();  
		l2.add(6);
		l2.add(7);
		l2.add(8);
		l2.add(2210);
		
		l1.add(1111);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(0, 0);   // first zero is an index and second zero is an element
		
		l1.addFirst(33822);
		l1.addLast(120);
		
		
	//	l1.set(0, 310);  // set method which is used replace the element...
		
		l1.addAll(l2);
		
	//	System.out.println(l1.lastIndexOf(3310));
	//	System.out.println(l1.indexOf(310));
		
	//	l1.clear();        // --> it will erase all data...
	//	System.out.println(l1.contains(5));
		
	for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i));
			System.out.print(",");
			
		}
		*/
	}

}



/*
 *   Date and Time In Java:-
 *   
 *   Date and Time Methods are deprecated in java-->System.out.println(System.currentTimeMillis());
 *   That line of Java code prints the current time in milliseconds since January 1, 
 *   1970 (the Unix epoch). It's useful for measuring execution time or logging timestamps
 *   
 *   
 *   System.out.println(System.currentTimeMillis()/1000/3600/24/365);
 *   3600 represents the number of seconds in an hour. Since there are 60 seconds in a minute and 60 minutes in an hour,
       1000 is used to convert milliseconds into seconds. Since System.currentTimeMillis() returns the current time in milliseconds,
        dividing it by 1000 converts it to seconds.
          For example:
           - 1 millisecond = 0.001 seconds
           - 1000 milliseconds = 1 second
           
           
 *       // Calender Class 
 *       Calender Class Is An Abstract Class Which Contain Static Method
 *       Calendar c=Calendar.getInstance();
 *       
 *       System.out.println(c.getCalendarType());
	//	System.out.println(c.getTimeZone());
		
	//	System.out.println(c.getTimeZone().getID());
		
		// getId()--> Which Is Used to Print Location Id
 *       
 *       
 *       
 *       //Gergorian Calender Class & Time Zone In Java
 *       Calender Class Is An Abstract We Can Create As A Instance
 *       
 *       TimeZone:- GregorianCalendar c1 = new GregorianCalendar();
		System.out.println(c1.isLeapYear(2024));     //    --> isLeapYear Means Feb29
 		
		System.out.println(TimeZone.getAvailableIDs());
		- It helps list all available time zones when choosing a specific one.
- Useful for applications that allow users to select their preferred time zone.
- Helps developers understand the different time zone IDs used across regions.
Example usage:
String[] timeZones = TimeZone.getAvailableIDs();
System.out.println(Arrays.toString(timeZones)); // Prints all available time zone IDs
		
		System.out.println(TimeZone.getAvailableIDs(2021));
		
		
		
		Java.Time API:-
		LocalDate,LocalTime,LocalDateTime
 *		DateTimeFormatter
 *       
 */
package Oops.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Oops_javaAdvanceClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Java.Time API:-
/*
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		*/
		
		/*
		// Date Time Set Formatter
		LocalDateTime t1= LocalDateTime.now();
		System.out.println(t1);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("DD-MM-YYYY--E H:M a"); // E is an day of Week, a is an Pm or Am
	 //	DateTimeFormatter df=DateTimeFormatter.ISO_LOCAL_DATE;
               String MyDate=t1.format(df);
               System.out.println(MyDate);
           */    
		
		//  Gergorian Calender Class & Time Zone In Java
	//	Calendar c=Calendar.getInstance();
	//	System.out.println(c.getTime());
		/*
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		*/
	//	System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		
	//	GregorianCalendar c1 = new GregorianCalendar();
	//	System.out.println(c1.isLeapYear(2024));     //    --> isLeapYear Means Feb29
		
	//	System.out.println(TimeZone.getAvailableIDs());
		
	//	System.out.println(TimeZone.getAvailableIDs(2021));  // list the all available timezone are present
		
		
		
		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/singapure"));   
		System.out.println(c);
		
	//	System.out.println(c.getCalendarType());
	//	System.out.println(c.getTimeZone());
		
	//	System.out.println(c.getTimeZone().getID());
		
		// getId()--> Which Is Used to Print Location Id
		
		
		/*
		Date dt=new Date();
		System.out.println(dt);
		*/
		
		
		/*
		Date d=new Date();
		System.out.println(d.getTime());
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		*/
		
       /*
		System.out.println(System.currentTimeMillis());
		System.out.println(Long.MAX_VALUE);
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		*/
		
	}

}


/*
 *  // Creating our own Documentation
 *  
 *  Java Tags For Class
 *  
 *   // Annotations
 *   
 *   Annotations Means Used To provide Extra Information About program  they are Some Annotations Are used 
 *   1.@Override --> Which marks The Overriden element in the class
 *   2.@SupressWarnings --> Used to Supress the generated waring by the complier
 *   3.@deprecated  --> used to marks the deprecated method 
 *   deprecated means command not used in java field is considered outdated and should no longer be used.
 *   4.@FunctionalInterface -->used to ensure an Interface is a Functional Interface
 * 
 * */

 //        /**/ --> It is Comment
//         /** --> It is Java Documnet Creation
package Oops.com;
/** 
 *  // Used For Creating Java Documentation  which is similar to HTML Command 
 *  // They are Some Commands Used for java Documentation
 *  
 *  @param --> is used for thr describing the parameter
 *  @return  --> for describing the return value
 *  @throw --> for describing exception throw
 *  @deprecated --> for describing the depricated Status
 *  
 *  @author KIRANA S DODDAMANI
 *  @version 0.1
 *  @since    2025
 *  @see
 * 
 * */
@FunctionalInterface       // --> It Take Only One Method and must and should write the this method
interface MyFunctionalInterface{
	void method1();
//	void method2();     
}
class MyNewPhone implements MyFunctionalInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Show a Override Method...!");
	}
	@Deprecated
	public int sum(int a,int b) {
		return a+b;
	}
	
	
}
public class Oops_javaAdvanceClass3 {
	
	/**
	 * @param args These are Argumnets supplied to command line
	 * */

	public static void Javadoc(int a,int b) {
		System.out.println(" The Sum Of A and B Is:"+a+b);
	}
//	@supresswaring("deprecated");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Javadoc(2,5);
	}

}


/*
 *  // Lamda Expression
 *   Lamda Expression which is used to reduce the code 
 *   // Lamda Expression      --> It should be in the form of @FunctionalInterface(Means interface should contain only one method)
		MyMethod obj=()->{
			  System.out.println("Welcome to java by using the Lamda  Class");
		  };
			obj.Method();
		
		MyMethod obj1=()->{
			System.out.println("Hello Every One Wlc JavaWorld...!");
		};
		obj1.Method();
		
 *   
 *   if we use the lamda expression the interface should be in Form @FunctionalInterface
 *   
 *   // Java Generics
 *   
 *   
 * */

package Oops.com;

@FunctionalInterface
interface MyMethod{
	void Method();
//	void Method1();
}
/*
class MynewClass implements MyMethod{

	@Override
	public void Method() {
		// TODO Auto-generated method stub
		System.out.println("This Is A Method 1");
	}

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("I am Method 2");
	}
	
}
*/
public class Oops_JavaAdvanceClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		MynewClass MyC=new MynewClass();
		MyC.Method();
		*/

		/*
		 
       // 1.Ananymous Class  --> which is used to reduce the  code 
		MyMethod obj=new MyMethod() {

			@Override
			public void Method() {
				// TODO Auto-generated method stub
				System.out.println("Hello Every One...!");
			}

			@Override
			public void Method1() {
				// TODO Auto-generated method stub
				System.out.println("Hello My JavaWorld...!");
			}
		};
		
		obj.Method();
		obj.Method1();
		
		
		*/
		
		
		/*
		// Lamda Expression      --> It should be in the form of @FunctionalInterface(Means interface should contain only one method)
		MyMethod obj=()->{
			  System.out.println("Welcome to java by using the Lamda  Class");
		  };
			obj.Method();
		
		MyMethod obj1=()->{
			System.out.println("Hello Every One Wlc JavaWorld...!");
		};
		obj1.Method();
		
		*/
		
		
		
	}

}


/*
 *   // File Handling
 *   1. Reading The File
 *   2. Writing The File
 *   3. Create New File
 *   4. Deleting a File
 *   
 *   while creating the file and writing the file it should be under the try and catch
 *   
 * */

package Oops.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Oops_JavaAdvanceClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Creating a NewFile
		File MyFile=new File("Oops_Advanced_java1.java");
		try {
			MyFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 2. Writing The File
		try {
			FileWriter MyWrite=new FileWriter("Oops_Advanced_java1.java");
			MyWrite.write("Oops_Advanced_java1.java");
			MyWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		// Reading The File
		
		File myfile=new File("Oops_Advanced_java1.java");
		try {
			Scanner sc=new Scanner(myfile);
			while(sc.hasNextLine()) {
			String line=sc.nextLine();
			System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Deleting The File
		
		File myfile1=new File("Oops_Advanced_java1.java");
		if(myfile1.delete()) {
			System.out.println("This File Is Deleted....!");
		}
		else {
			System.out.println("This File Is Not deleted due to some issues..!");
		}
	}

}
/*
 * 🗂 File myfile = new File("W6File.txt");
This creates a File object named myfile that points to a file called W6File.txt. This file is expected to exist in the project's root directory (same folder as your .java file or working directory when you run the code).

🧪 try { ... } catch (FileNotFoundException e) { ... }
Since accessing files can lead to exceptions (e.g., if the file doesn’t exist), this code uses a try-catch block to handle the possibility gracefully instead of crashing the program.

🔍 Scanner sc = new Scanner(myfile);
This line attempts to create a Scanner object that reads from the file. If W6File.txt doesn’t exist or can’t be opened, Java throws a FileNotFoundException, which is caught in the catch block.

📖 while(sc.hasNextLine()) { ... }
This loop checks if the file has another line to read using hasNextLine(). If yes, it enters the loop body.

✏️ String Line = sc.nextLine();
Reads the next available line from the file and stores it in a String variable Line.

📢 System.out.println(Line);
Prints the contents of that line to the console, so you see each line of the file output one by one.

🔐 sc.close();
Once all lines are read, the Scanner is closed to free up resources (good practice!).

❌ catch (FileNotFoundException e) { e.printStackTrace(); }
If the file can’t be found or opened, this section gets triggered. e.printStackTrace() outputs detailed error information to help you debug the issue.

In short, this code reads a text file line by line and prints each one. Want me to show you how to modify this to count words or display only certain lines?

 * This creates a File object named myfile that points to a file called W6File.txt. This file is expected to exist in the project's root directory (same folder as your .java file or working directory when you run the code).

🧪 try { ... } catch (FileNotFoundException e) { ... }
Since accessing files can lead to exceptions (e.g., if the file doesn’t exist), this code uses a try-catch block to handle the possibility gracefully instead of crashing the program.

🔍 Scanner sc = new Scanner(myfile);
This line attempts to create a Scanner object that reads from the file. If W6File.txt doesn’t exist or can’t be opened, Java throws a FileNotFoundException, which is caught in the catch block.

📖 while(sc.hasNextLine()) { ... }
This loop checks if the file has another line to read using hasNextLine(). If yes, it enters the loop body.

✏️ String Line = sc.nextLine();
Reads the next available line from the file and stores it in a String variable Line.

📢 System.out.println(Line);
Prints the contents of that line to the console, so you see each line of the file output one by one.

🔐 sc.close();
Once all lines are read, the Scanner is closed to free up resources (good practice!).

❌ catch (FileNotFoundException e) { e.printStackTrace(); }
If the file can’t be found or opened, this section gets triggered. e.printStackTrace() outputs detailed error information to help you debug the issue.


*/

