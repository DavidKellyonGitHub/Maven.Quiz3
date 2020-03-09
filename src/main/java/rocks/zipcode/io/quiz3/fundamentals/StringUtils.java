package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] letters = str.toCharArray();
        String resultString = "";
        Character letter = letters[indexToCapitalize];
        letters[indexToCapitalize] = letter.toUpperCase(letter);
        for (char alphanumeric : letters){
            resultString += alphanumeric;
        }
        return resultString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> subs = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            for (int j = i+1;j <= string.length();j++){
                subs.add(string.substring(i,j));
            }
        }
        String[] result = new String[subs.size()];
        int counter = 0;
        for (String sub : subs){
            result[counter] = sub;
            counter++;
        }
        return result;
    }

    public static Integer getNumberOfSubStrings(String input){
        ArrayList<String> subs = new ArrayList<>();
        for (int i = 0; i < input.length(); i++){
            for (int j = i+1;j <= input.length();j++){
                subs.add(input.substring(i,j));
            }
        }
        return subs.size();
    }
}
