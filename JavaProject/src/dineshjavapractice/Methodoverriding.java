package dineshjavapractice;

public class Methodoverriding {
	
	void eat() {
		System.out.println("eat method of base class");
		System.out.println("eating");
	}
	
	static class Dog extends Methodoverriding {
		
		void eat() {
			System.out.println("eat method of derived class");
			System.out.println("Dog is eating");
		}
	}
	class Overriding{

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog d1= new Dog();
		Methodoverriding m1 =new Methodoverriding();
		
		d1.eat();
		m1.eat();
		
		Methodoverriding methodr =new Dog();
		methodr.eat();
		
		
	}
	}
}
