package dineshjavapractice;

public class methodwithparametres {

	static void ram(String name, int age) {
		System.out.println(name + " is "+ age);
	}
	
	static void ram(String name, int age,int grade) {
		System.out.println(name + " is " + age + " and his grade is " + grade);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ram("Dinesh",28,3);

	}

}
