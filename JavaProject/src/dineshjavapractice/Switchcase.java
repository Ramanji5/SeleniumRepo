package dineshjavapractice;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int day=5;

Scanner input=new Scanner(System.in);
System.out.print("Please Enter Input :");
int num=input.nextInt();

 switch(num) {
 case 1:
	 System.out.println("Sunday");
	 break;
 case 2:
	 System.out.println("Monday");
	 break;
 case 3:
	 System.out.println("Thuesday");
	 break;
 case 4:
	 System.out.println("Wednesday");
	 break;
 case 5:
	 System.out.println("Friday");
	 break;
 case 6:
	 System.out.println("Saturday");
	 break;
 default:
	System.out.print("Please provide valid input");
	
	 
}
 
	}

}
