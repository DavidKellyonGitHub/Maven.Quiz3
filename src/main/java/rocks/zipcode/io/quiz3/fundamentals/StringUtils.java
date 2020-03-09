package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] letters = str.toCharArray();
        Character letter = letters[indexToCapitalize];
        letters[indexToCapitalize] = letter.toUpperCase(letter);
        return letters.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
