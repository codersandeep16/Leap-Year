package java_workshop;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int y=sc.nextInt();
		if(y%4==0 && y%400==0 && y%100==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}
	}
}
