
// Interface  And Default Methods....!  And Inheritence in Interface
/*
 * the main difference between Abstract and Interface is 
 * abstract --  it is not necessary to implement all methods , we can not extend multiple Abstract class ,we can not create multiple class by using abstract class
 * interface -- it is compulsary to implements all methods , we use implements keyword in interface , we can create multiple class by using interface
 * 
 * java does not support multiple inheretience directly but it can be achived using interface
 * 
 * Interface--> which consists of Constant fields(ie properties) and default methods 
 * interface are Default method  means(No need to write public void interface we just write interface ie default)
 * 
 * Interface--> can create the reference of interface  not create the object.....!
 * interface can use extend keyword during only when (one interface can extend anthor interface)
 * 
 * if interface can extend the class then use implements keyword....!
 * 
 * Interface --> interface also have a private methods  but this private methods can not access directly so we use (!.....default methods.....!)
 *  this default methods are declared in Interface methods
 * 
 * In Interface we can Implement Two Class At a time but It can not achived in Inheritence...
 * 
 * */

/*
 *   Polymorphism in Interface:--
 *    Polymorphism means one entity many forms 
 *      example:-- phone which contain apps,speaker,camera..etc phone which like one entity many forms..
 * 
 * */


package Oops.com;
/*
interface Bycycle{
	int a=3310;
	void greet(String name);
	void greet2(String name);
	private void SayGood(String name) {
		System.out.println("U Have Lucky Day Today Mr "+name);
	}
	
	default void LuckyDay() {
		SayGood("Kirana S Doddmani");
	}
}
class You implements Bycycle{

 //	int a=4410;
	
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello Good Morning "+name);
	}

	
	@Override
	public void greet2(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello Good Evening "+name);
	}
	
}*/

interface ByHorn{
	public void meth1();
	public void meth2();
}
/*
interface BlowHorn {
	public void meth3();
	public void meth4();
}
*/
interface BlowHorn extends ByHorn{         // this is one interface can extend anthor interface 
	public void meth3();
	public void meth4();
}

//class HornHorn implements BlowHorn,ByHorn{   // this can be can not done my inheritence (ie at a time it can extend two class)

class HornHorn implements BlowHorn{
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("This Method Contain Meth1......!");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("This Method Contain Meth2......!");
	}

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		System.out.println("This Method Contain Meth3......!");
	}

	@Override
	public void meth4() {
		// TODO Auto-generated method stub
		System.out.println("This Method Contain Meth4......!");
	}
	
}

public class Oops_Interface_con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		You sc=new You();
	// 	int a=5510;          --> ie Interface Have a Constant fields (Can Not be Chanaged..)
		int a = sc.a;
		System.out.println("The value of A is="+a);
		sc.greet("Kirana S Doddmani");
		sc.greet2("Kirana S Doddmani");
		sc.LuckyDay();
	//	sc.SayGood("Kirana S Doddmani");  --> shown an error becoz of it is private method....so we call SayGood Method by using anthor default method
	*/
		
		HornHorn sc=new HornHorn();
		sc.meth1();
		sc.meth2();
		sc.meth3();
		sc.meth4();
	}

}
