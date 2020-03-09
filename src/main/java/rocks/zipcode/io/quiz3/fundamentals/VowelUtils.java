package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] letters = word.toLowerCase().toCharArray();
        for (char letter : letters){
            if (letter == 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter == 'u'){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int counter = -1;
        int vowelCounter = 0;
        char[] letters = word.toCharArray();
        for (char letter : letters) {
            counter++;
            if (VowelUtils.isVowel(letter)){
                vowelCounter ++;
                break;
            } else if (!hasVowels(word)){
                return -1;
            }
        }
        return counter;
    }


    public static Boolean startsWithVowel(String word) {
        if (VowelUtils.getIndexOfFirstVowel(word) == 0){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        return VowelUtils.hasVowels(character.toString().toLowerCase());
    }
}
