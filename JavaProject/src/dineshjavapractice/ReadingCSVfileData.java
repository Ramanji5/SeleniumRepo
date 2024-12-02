package dineshjavapractice;

import java.util.Scanner;
import java.io.*;  


public class ReadingCSVfileData {

	public static void main(String[] args) throws Exception {
		
		
		//parsing a CSV file into Scanner class constructor 
		Scanner sc = new Scanner(new File("C:\\Users\\asula\\OneDrive\\Documents\\Ram.csv"));
		//sets the delimiter pattern  
		//sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
        sc.close(); 
	}

}
