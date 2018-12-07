package arrayUtilities;

import java.util.ArrayList;

public class IntArrayUtilities {

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int sumValuesOfArray(int[] input) {

        int sum = 0;

        for(int i : input) {
            sum += i;
        }
        return sum;
    }

    public static double sumDoublesOfArray(double[] input) {

        double sum = 0;

        for(double d : input) {
            sum += d;
        }
        return sum;
    }

    public static Integer getProduct(Integer[] intArray) {

        Integer product = 1;
        for (int i = 0; i < intArray.length; i++) {
            product = product * intArray[i];
        }

        return product;
    }


    public static int averageOfArray(int[] input) {
        return sumValuesOfArray(input) / input.length;
    }

    public static double doubleAverageOfArray(double[] input) {
        return sumDoublesOfArray(input) / input.length;
    }

    public static boolean containsValue(int[] input, int numb) {

        for(int i: input) {
            if(i == numb)
                return true;
        }
        return false;
    }

    public static void reverseArray(int[] input) {

        int highEnd = input.length - 1;
        int lowEnd = 0;

            while(highEnd > lowEnd) {
                int temp = input[lowEnd];
                input[lowEnd] = input[highEnd];
                input[highEnd] = temp;
                highEnd--;
                lowEnd++;
            }
    }

    public static int findIndexOf(int[] input, int numb) {

        for (int i = 0; i < input.length; i++) {
            if(input[i] == numb)
                return i;
        }
        return -1;
    }

    public static int[] copyArrayByLoop(int[] input) {

        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }

        return output;
    }

    public static int[] copyArraySetLength(int[] input, int length) {

        int[] output = new int[length];

        for (int i = 0; i < length; i++) {
            output[i] = input[i];
        }

        return output;
    }

    public static int[] removeElementFromArray(int[] input, int numb) {

        int[] output = new int[input.length - 1];
        int index = 0;
        for(int i: input) {
            if(i != numb) {
                output[index] = i;
                index++;
            }
        }
        return output;
    }

    public static int[] insertIntoArrayAt(int[] input, int numb, int index) {

        if(index > input.length) {
            throw new IndexOutOfBoundsException();
        }

        int[] output = new int[input.length + 1];

        for (int i = 0; i < output.length; i++) {
            if(i < index) {
                output[i] = input[i];
            } else if(i == index) {
                output[i] = numb;
            } else {
                output[i] = input[i - 1];
            }
        }
        return output;
    }

    public static int[] removeDupesFromArray(int[] input) {
        int[] output = new int[input.length];
        int index = 0;
        for(int i: input) {
            if(!containsValue(output, i)) {
                output[index] = i;
                index++;
            }
        }
        return copyArraySetLength(output, index);
    }

    public static ArrayList<Integer> makeMeAnArrayListFromArray(int[] input) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i: input){
            list.add(i);
        }
        return list;

    }

    public static int[] makeMeAnArrayFromArrayList(ArrayList<Integer> input) {

        int[] array = new int[input.size()];
        int index = 0;

        for(Integer i: input) {
            array[index] = i;
            index++;
        }
        return array;
    }


    public static boolean check2ArraysForEqual(int[] input1, int[] input2) {

        for (int i = 0; i < input1.length; i++) {
            if(input1[i] != input2[i]) {
                return false;
            }
        }
        return true;
    }

    public static Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            index++;
        }
        for(int k = 0; k < array2.length; k++){
            result[index] = array2[k];
            index++;
        }

        return result;

    }

    public static Integer[] rotate(Integer[] array, int i) {
        Integer[] result = new Integer[array.length];

        for (int j = 0; j < array.length - i; j++) {
            result[j] = array[j + i];
        }
        int index = 0;
        for (int k = array.length - i; k < array.length; k++) {
            result[k] = array[index];
            index++;

        }

        return result;
    }

    public static Integer countOccurrance(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (Integer numb: array1) {
            if(numb.equals(valueToEvaluate)) {
                count++;
            }
        }
        for (Integer numb: array2) {
            if(numb.equals(valueToEvaluate)) {
                count++;
            }
        }

        return count;

    }

    public static Integer mostCommon(Integer[] array) {
        int[] counts = new int[10];

        for (Integer numb: array) {
            counts[numb]++;
        }
        Integer largest = 0;
        Integer index = 0;
        Integer mostCommonNumber = 0;
        for (int i: counts) {
            if(i > largest){
                i = largest;
                mostCommonNumber = index;
            }
            index++;
        }
        return mostCommonNumber;

    }

}
