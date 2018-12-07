package integerUtilities;

import stringUtilities.StringUtilities;

public class IntegerUtilities {

    public static Integer getSumOfNumbersUpTo(Integer n) {
        Integer result = 0;

        for (int i = 1; i <= n; i++) {
            result = result + i;
        }

        return result;
    }

    public static Integer reverseDigits(Integer val) {

        String input = Integer.toString(val);
        input = StringUtilities.reverse(input);
        Integer result = Integer.valueOf(input);


        return result;
    }



}
