
// 0 for Rock,1 for Papper and 2 for Sissors 

package com.pack;

    import java.util.Random;
    import java.util.Scanner;
    import java.util.random.*;
    
  public class project_3_java {
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter The 0 value for Rock,1 value for Papper And 2 for Sissor");
		System.out.println("Enter The UserValue:");
		Scanner sc=new Scanner(System.in);
		int userInput=sc.nextInt();
		
		Random random=new Random();
		int computerInput=random.nextInt(3); //--> Here We put value 3 Becoz Computer Will Choice Only Three Number As Random Number
		
		if(userInput==computerInput) {
			System.out.println("Draw");
		}
		else if(userInput==0&&computerInput==2 ||userInput==0 && computerInput==1||userInput==2 && computerInput==0) {
			System.out.println("You Win");
		}
		else {
			System.out.println("Computer Will Win");
		}
	//	System.out.println("Computer Choice:"+computerInput);
		
		if(computerInput==0) {
			System.out.println("Computer Choice Is Rock");
		}
		else if(computerInput==1) {
			System.out.println("Computer Choice Is Papper");
		}
		else if(computerInput==3) {
			System.out.println("Computer Choice Is Sissor");
		}
  }
}