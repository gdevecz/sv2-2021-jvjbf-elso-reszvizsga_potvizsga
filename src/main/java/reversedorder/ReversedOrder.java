package reversedorder;

public class ReversedOrder {

    public String getWordsInReversedOrder(String[] words) {
        StringBuilder result = new StringBuilder();
        boolean first = true;

//        Elvileg ez is jó: bár for-each, zavaró kissé, kevésbé egyértelmű (és sok a mozgatás), bár itt  metódusnév jól utal a feladatra
//        for (String word : words) {
//            if (first) {
//                first = false;
//                result.append(word);
//            } else {
//                result.insert(0, word + ", ");
//            }
//        }
        for (int i = words.length - 1; i >= 0; i--) {
            if (first) {
                first = false;
                result.append(words[i]);
            } else {
                result.append(", ").append(words[i]);
            }
        }

        return result.toString();
    }
}
