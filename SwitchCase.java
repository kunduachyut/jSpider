//Date 05-04-2025
public class SwitchCase{
	public static void main(String args[]){
		/*char choice = 'a';
		switch(choice){
		//This is the process of grouping of cases
		//case 'a','e','i','o','u':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("This is a vowel");
			break;
		default:
			System.out.println("This is not a vowel");

		}*/

		//Store the value of switch case into a variable
		//only decision making statement is "SWITCH"
		int choice = 2;
 		String res = 
		switch(choice){
		case 1: {
			yield "Doramon";
		}
		default:{
			yield "Shinchan";
		}
		};

		System.out.println(res);
	}
}