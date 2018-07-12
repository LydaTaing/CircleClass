package chapter9;
/**
 * 
 * @author tainglyda
 * CSC 143
 * 4/5/18
 * CircleClient, used to test Circle. 
 */
public class CircleClient {

	public static void main(String[] args) {
		
		try {
			Cicrle c1= new Cicrle (0, 0 , -5);
			System.out.println(c1);
		}
		catch (IllegalArgumentException e) {
			
			System.out.println(e);
		}
		
		
		System.out.println("John did this.");

	}

}
