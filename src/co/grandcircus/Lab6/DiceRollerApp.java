/* Shontinique Uqdah
 * 07/19/2018
 */
package co.grandcircus.Lab6;

public class DiceRollerApp {

	public static String namesOfRolls(int num1, int num2) {
		
		//Declares and Initializes return string to blank, in event no case below applies
		String rollMessage = "";
		
		//Checks for different dice values
		switch (num1) {
		case 1:
			//When both die roll 1, assigns snake eyes to return string
			if (num2 == 1) {
				rollMessage = "Snake Eyes";
			}
			//When one die is 1 and the other is 2, assigns ace deuce to return string
			else if (num2 == 2) {
				rollMessage = "Ace Deuce";
			}
			break;
		case 6:	
			//Assigns boxcars to return string when both die are a 6
			if (num2 == 6) {
				rollMessage = "Boxcars";
			}
			break;
		default: 
			break;
		}
		
		return rollMessage;
			
	

}
}
