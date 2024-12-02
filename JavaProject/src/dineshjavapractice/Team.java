package dineshjavapractice;

public class Team {

	static class IndianTeam{
		void PlayingXI() {
			System.out.println("MS Dhoni,Sachin,Ganguly,Sehwag,vvs,Rahul");
			//System.out.println("MS Dhoni","Sachin","Ganguly","Sehwag","vvs","Rahul");
		}
	}
	
	public static class Cap extends IndianTeam{
		
		void PlayingXI() {
			
			System.out.println("Rohit,Gill,Jaiswal,KL Rahul,Tilak");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndianTeam IT= new IndianTeam();
		IT.PlayingXI();
		IndianTeam ITC= new Cap();
		ITC.PlayingXI();

	}

}
