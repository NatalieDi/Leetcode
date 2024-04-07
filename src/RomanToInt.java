import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("VI"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
        public static int romanToInt(String s) {
            Map<Character, Integer> romanNumbers = new HashMap<>();
            romanNumbers.put('I', 1);
            romanNumbers.put('V', 5);
            romanNumbers.put('X', 10);
            romanNumbers.put('L', 50);
            romanNumbers.put('C', 100);
            romanNumbers.put('D', 500);
            romanNumbers.put('M', 1000);

            int answer = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1
                        && romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))) {
                    answer += romanNumbers.get(s.charAt(i + 1)) - romanNumbers.get(s.charAt(i));
                    i++;
                } else {
                    answer += romanNumbers.get(s.charAt(i));
                }
            }
            return answer;
        }
    }

