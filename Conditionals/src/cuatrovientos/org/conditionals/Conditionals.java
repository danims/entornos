package cuatrovientos.org.conditionals;

/**
 * 
 * @author Daniel Martin
 *
 */

public class Conditionals {
	public static void main(String [] args) {
		int a = 6;
		int b = 6;
		
		if (a > b) {
			System.out.println("a is bigger than b");
		} else {
			if (a < b) {
			System.out.println("a is smaller than b");
			}	else {
					System.out.println("a and b are equals.");
			}
		}
		switch(a) {
		case 0:
			System.out.println("A is 0");
			break;
		case 1:
			System.out.println("A is 1");
			break;
		case 5:
			System.out.println("A is 5");
			break;
			default:
				System.out.println("I don't know");
				break;
			
		
		}
		System.out.println("Program ended");
	}

}
