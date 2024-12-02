package dineshjavapractice;

public class Methodoverloading {

	static int addition(int a,int b) {
		return a+b;
	}
	
	static double addition(double x, double y) {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add=addition(4,5);
		double multi=addition(4.3,7.2);

		System.out.println("Addition of two number is " +add);
		System.out.println("Multiplication of two number is " + multi);
	}

}
