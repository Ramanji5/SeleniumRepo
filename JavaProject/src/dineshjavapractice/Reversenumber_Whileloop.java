package dineshjavapractice;

public class Reversenumber_Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=56892, reverse=0;
		while(number!=0) {
			
			int r=number%10;
			reverse=reverse*10+r;
			number=number/10;
			
		}
		System.out.println("The Reverse of Given number is :" + reverse);

	}

}
