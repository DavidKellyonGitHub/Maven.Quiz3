package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        boolean allSquares = true;
        int squareCounter = 0;
        for (Integer square : squaredValues){
            for (Integer root : inputArray){
                if (Math.sqrt(square) == root){
                    squareCounter++;
                    break;
                }
            }
        }
        if (squareCounter == inputArray.length && squareCounter == squaredValues.length){
            return true;
        }
        return false;
    }
}
