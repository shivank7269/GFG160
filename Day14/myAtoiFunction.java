package Day14;
import java.util.stream.Collectors;
public class myAtoiFunction {
    public int myAtoi(String s) {
        // Step 1: Remove leading/trailing whitespaces
        s = s.strip();
        if (s.isEmpty()) {
            return 0;
        }

        // Step 2: Determine the sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        // Step 3: Filter numeric characters using Stream
        String numericPart = s.substring(index) // Take substring after the sign
                .chars()
                .takeWhile(Character::isDigit) // Stop when non-digit is encountered
                .mapToObj(c -> String.valueOf((char) c)) // Convert back to String
                .collect(Collectors.joining()); // Join all digits into one string

        if (numericPart.isEmpty()) {
            return 0;
        }

        // Step 4: Parse the numeric part and handle overflow
        int result = 0;
        try {
            result = Integer.parseInt(numericPart) * sign;
        } catch (NumberFormatException e) {
            // Handle overflow cases
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return result;
    }
}
