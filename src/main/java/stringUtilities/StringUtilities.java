package stringUtilities;

import java.util.ArrayList;

public class StringUtilities {

        public static String padLeft(String stringToBePadded, int amountOfPadding) {

            return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
        }


        public static String padRight(String stringToBePadded, int amountOfPadding) {

            return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
        }

        public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

            String result = "";

            for (int i = 0; i < numberOfTimeToRepeat; i++) {
                result += stringToBeRepeated;
            }

            return result;
        }

        public static String removeLastSubString(String baseString, String stringToRemove) {

            int start = baseString.lastIndexOf(stringToRemove);
            return baseString.substring(0,start) + baseString.substring(start + stringToRemove.length());
        }

        public static String removeNthSubstring(String baseString, String stringToRemove, int nthOccurrence) {

            int startIndex = getIndexOfNthSubstring(baseString, stringToRemove, nthOccurrence);
            int endIndex = startIndex + stringToRemove.length();

            return baseString.substring(0, startIndex) + baseString.substring(endIndex);
        }

        public static Integer getIndexOfNthSubstring(String baseString, String subString, Integer nthOccurrence) {

            int pos = baseString.indexOf(subString);
            while (--nthOccurrence > 0 && pos != -1)
                pos = baseString.indexOf(subString, pos + 1);
            return pos;
        }

        public static Integer getNumberOfOccurrences(String baseString, String subString) {

            ArrayList<Integer> indexes = new ArrayList<>();
            for (int i = 0; i < baseString.length(); i++) {
                int nextOcc = baseString.lastIndexOf(subString);
                indexes.add(nextOcc);
                baseString = baseString.substring(0,nextOcc);
            }

            return indexes.size();
        }

        public static Boolean isSpecialCharacterString(String string) {
            return string.matches("[!@#$%^&*() ]+");
        }

    public static String camelCase(String str) {

        String[] arr = str.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result = result + " " + Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        result = result.substring(1);
        return result;
    }

    public static String reverse(String str) {

        String result = "";


        for (int i = (str.length() - 1); i >= 0; i--) {

            result = result + str.charAt(i);

        }

        return result;

    }

    public static String reverseWords(String str) {

        String[] arr = str.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            String currentWord = arr[i];
            result = result + " " + reverse(currentWord);
        }

        result = result.substring(1);
        return result;


    }

    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length()-1);
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);

    }

    }
