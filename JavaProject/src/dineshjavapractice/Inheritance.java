package dineshjavapractice;

public class Inheritance {

	
	static class Father {
		void shooter() {
			System.out.println("I am the Father! I am right handed shooter! ");
		}
	}
	
	public static class child extends Father{
		void shooter() {
			System.out.println("I am the son! I am left handed shooter! ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father F =new Father();
		F.shooter();
		Father fc =new child();
		fc.shooter();

	}

}
