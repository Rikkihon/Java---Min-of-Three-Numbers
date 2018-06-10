import java.util.*;
import java.util.Scanner; 

public class minofthree {

	 public static int count(String str, char a) {
		 int number = 0;
		 int i = 0;
		 char[] ch =str.toCharArray();
		 
		 for (i = 0; i <= str.length()-1; i++) {
			 if (ch [i] == a)
				 number ++; 
			 
		 }
		 //Scanner
	 System.out.println("The number of times it appears is " + number);
	 return number;
		 }
	 
	 public static void main (String [] args) {
		 System.out.println("Enter the words you would like read in order  to count the number of times a character appears " );
		 Scanner keyboard = new Scanner(System.in);
		 String Str = keyboard.nextLine();
		 System.out.println("Enter the character you would like me to search for " );
		 
		 char characterName = keyboard.next().charAt(0);
		 System.out.println("The number of times that character appears is" + count(Str, characterName));
	 }
}
