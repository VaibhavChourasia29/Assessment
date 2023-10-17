import java.util.*;
public class PangramChecker {
    public static boolean isPangram(String str) {
	
        Set<Character> letterSet = new HashSet<>();
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterSet.add(ch);
            }
        }
        return letterSet.size() == 26;
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
 	String userInput = scanner.nextLine();

	if(isPangram(userInput )){
	System.out.println("Input String is Pangram"); 
	}
	else{
System.out.println("Input String is not Pangram"); 

		}

        
    }
}