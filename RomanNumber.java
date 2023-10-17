
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        String userInput = scanner.nextLine();
        char[] charArray = userInput.toCharArray();

        Map<Character, Integer> romanToValue = new HashMap<>();
        romanToValue.put('I', 1);
        romanToValue.put('V', 5);
        romanToValue.put('X', 10);
        romanToValue.put('L', 50);
        romanToValue.put('C', 100);
        romanToValue.put('D', 500);
        romanToValue.put('M', 1000);

        int totalValue = 0;
        int prevValue = 0;

        for (int i = charArray.length - 1; i >= 0; i--) {
            int currentValue = romanToValue.get(charArray[i]);
            
            if (currentValue < prevValue) {
                totalValue -= currentValue;
            } else {
                totalValue += currentValue;
            }
            
            prevValue = currentValue;
        }

        System.out.println(totalValue);
    }
}