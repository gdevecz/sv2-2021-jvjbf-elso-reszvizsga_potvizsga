package firstnumber;

public class FirstNumber {

    public char getFirstNumber(String s) {
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return result;
    }
}
