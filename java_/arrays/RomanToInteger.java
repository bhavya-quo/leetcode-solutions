package java_.arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i<s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))) {
                sum -= m.get(s.charAt(i));
            }
            else {
                sum += m.get(s.charAt(i));
            }
        }
        return sum;
    }

    // generate driver program and unit test cases for this code
    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("III"));
        System.out.println(r.romanToInt("IV"));
        System.out.println(r.romanToInt("IX"));
        System.out.println(r.romanToInt("LVIII"));
        System.out.println(r.romanToInt("MCMXCIV"));
    }
}
