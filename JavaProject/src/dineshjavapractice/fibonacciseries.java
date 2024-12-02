package dineshjavapractice;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=2,n2=3,n3,i,count=5;
		// To Print 2 and 3
		System.out.print(n1+ "  " +n2);
		////loop starts from 5 because 2 and 3 are already printed  
		for(i=2; i<count; ++i) 
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
				
		}

	}

}
