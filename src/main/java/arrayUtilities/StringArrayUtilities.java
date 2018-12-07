package arrayUtilities;

public class StringArrayUtilities {

    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if(startingIndex < 0) {
            throw new IllegalArgumentException();
        }
        if(endingIndex >= arrayToBeSpliced.length) {
            throw new IndexOutOfBoundsException();
        }

        String[] result = new String[(endingIndex - startingIndex) + 1];
        int ind = 0;
        for (int i = 0; i < arrayToBeSpliced.length; i++) {
            if(i >= startingIndex && i <= endingIndex) {
                result[ind] = arrayToBeSpliced[i];
                ind++;
            }
        }
        return result;
    }

    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        if(startingIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        if(startingIndex >= arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        }


        return getSubArray(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length - 1);
    }

}
