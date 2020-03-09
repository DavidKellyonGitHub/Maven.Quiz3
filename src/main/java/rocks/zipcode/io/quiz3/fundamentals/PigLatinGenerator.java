package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] array = str.split(" ");
        for (int i = 0; i<array.length;i++){
            int firstVowelIndex;
            String placeholder = "";
            if (VowelUtils.startsWithVowel(array[i])) {
                array[i] += "way";
            } else {
                firstVowelIndex = VowelUtils.getIndexOfFirstVowel(array[i]);
                if (firstVowelIndex < 0){
                    array[i]+="ay";
                } else {
                    placeholder += array[i].substring(firstVowelIndex);
                    placeholder += array[i].substring(0, firstVowelIndex);
                    placeholder += "ay";
                    array[i] = placeholder;
                }
        }


        }
        String answer = array[0];
        for (int i = 1;i<array.length;i++){
            answer += " " + array[i];
        }

        return answer;
    }
}
