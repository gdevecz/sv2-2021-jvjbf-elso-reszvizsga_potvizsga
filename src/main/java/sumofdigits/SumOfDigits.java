package sumofdigits;

public class SumOfDigits {

    public int getSumOfDigits(int number) {
        int result = 0;
        // végigmehetne numberrel is, de elvileg a paraméter megváltoztatása, hacsak nem az a cél(referencián át), kerülendő
        int tmpNumber = number;

        while (tmpNumber > 0) {
            result += tmpNumber % 10;
            tmpNumber /= 10;
        }
        return result;
    }
}
