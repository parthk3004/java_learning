package dulicate;
import java.util.Arrays;
public class HighestPossibleNumber {
    public int conversion(int num) {
            String numStr = Integer.toString(num);
            char numArr[] = numStr.toCharArray();
            Arrays.sort(numArr);
            char numArrRev[] = new char[numArr.length];
            for(int i=0;i<numArr.length;i++) {
                numArrRev[i] = numArr[numArr.length-i-1];
            }

            int number = Integer.parseInt(String.valueOf(numArrRev));
            return number;
        }
    }



