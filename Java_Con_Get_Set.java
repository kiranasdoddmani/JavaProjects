// Access Modifier and Getter And Setter

// Access Modifier  --> Public ,Private,Protected And Default
package Oops.com;
/*
 class HelloEmployee{
	
	 // In Getter And Setter Id And Name Are Private ie(Arguments Are Private We Can not Access Directly So We Use Getter And Setter)
private	int id;
private String name;

public int getId() {
	return id;
}
public String getname() {
	return name;
}
public void setId(int id) {
	this.id=id;
}
public void setname(String name) {
	this.name=name;
}
}

*/
 
/*
 class MyMainEmployee{
	 int EmployeeId;
	 String EmployeeName;
	 
	 public int getId() {
		 return EmployeeId;
	 }
	 public String getName() {
		 return EmployeeName;
	 }
	 public void setId(int Id) {
		 this.EmployeeId=Id;
	 }
	 public void setname(String name) {
		 this.EmployeeName=name;
	 }
 }
 */

 class HelloEveryOne{
	 int side=4;
	 int a=5;
	 int b=2;
/*	 public void SayHi() {
		 System.out.println("Hello Evrey One...!");
	 }
	 public void Vibrating() {
		 System.out.println("Phone Was Vibrating....!");
	 }
	 public double area() {
		 System.out.println("Print Area Of Circle..!");
		 return 2*Math.PI*side;
	 }
 }
 */
	 
	 // CONSTRUCTOR --> constructor means to initilize the object while creating it
	 
	 public double MyCylinder(int a,int b) {              // --> Constructor By Passing An Argumnets.....s
		 System.out.println("Print Area Of Cylinder..!");
		 return 2*a*b*side;
	 }
	 
	 
	   int id=3310;
	   String name="Kirana S Doddmani";
	           
	   public int getid() {
		   return id;
	   }
	   public String getname() {
		   return name;
	   }
	     public void setId(int id) {
	    	 this.id=id;
	     }
	     public void setName(String name) {
	    	 this.name=name;
	     }
	     
	     public double Parameter() {
	    	 System.out.println("Print Parameter Of Rectangle..!");
	    	 return 2*(a+b)*side;
	     }
	     
		 }
	 
 
 
public class Oops_AccessModifier {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloEveryOne Bob=new HelloEveryOne();
		System.out.println(Bob.MyCylinder(5, 2));
	/*	System.out.println(Bob.getid());
		System.out.println(Bob.getname());
		System.out.println(Bob.Parameter());
		*/
	/*	HelloEveryOne sc=new HelloEveryOne();
	//	sc.SayHi();
	//	sc.Vibrating();
		
		//sc.side=4;
		System.out.println(sc.area());
		*/
		
	/*	MyMainEmployee sc=new MyMainEmployee();
		sc.setId(3310);
		System.out.println(sc.getId());
		sc.setname("Kirana S Doddmani");
		System.out.println(sc.getName());
*/
	/*	HelloEmployee sc=new HelloEmployee();
		sc.setId(3310);
		System.out.println(sc.getId());
		sc.setname("Kirana S Doddmani");
		System.out.println(sc.getname());
		*/
	}

}
