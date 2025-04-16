package com.pack;

import java.util.Scanner;
import java.util.random.*;


public class project_1_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random()*100);
		int MyNum=0;
		do {
			System.out.println("Guess The Number(1-100):");
			MyNum=sc.nextInt();
			
			if(MyNum==num) {
				System.out.println("Yes U Enter The Correct Number");
				break;
			}
			else if(MyNum>num) {
				System.out.println("U Enter The Large Number");
			}
			else{
				System.out.println("U Enter The Small Number");
			}
		}while(MyNum>0);
		
		System.out.println("MyNumber Was:"+ MyNum);
	}

}
