package javafullstack.techmaster;

import java.lang.Math;
import java.util.Scanner;

public class ModifyingArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array with random values
        int[] inputArray = new int[10];
        System.out.print("Mang duoc tao ngau nhien la: ");
        for (int i = 0; i < 10; i++) {
            inputArray[i] = (int) (Math.random() * 10);
            System.out.print(inputArray[i] + " ");
        }

        // Call method addtoArray
        int[] resultArray = new int[inputArray.length + 1];
        System.out.print("\nNhap gia tri can them vao mang: ");
        int addValue = input.nextInt();
        resultArray = addToArray(inputArray, addValue);
        System.out.print("Mang sau khi them gia tri " + addValue + " la: ");
        for (int e : resultArray
        ) {
            System.out.print(e + " ");
        }

        // Call method insertToArray
        System.out.print("\nNhap gia tri va vi tri can chen vao mang: ");
        int insertValue = input.nextInt();
        int position = input.nextInt();
        resultArray = insertToArray(inputArray, position, insertValue);
        System.out.println("\nMang sau khi chen gia tri la: ");
        for (int e : resultArray
        ) {
            System.out.print(e + " ");
        }

        // Call method removeFromArray
        System.out.print("\nNhap vi tri muon xoa: ");
        int deletePisition = input.nextInt();
        resultArray = removeFromArray(inputArray, deletePisition);
        System.out.print("Mang sau khi xoa gia tri " + inputArray[deletePisition] + " tai vi tri " + deletePisition + " la: ");
        for (int e : resultArray
        ) {
            System.out.print(e + " ");
        }
    }

    // Method addToArray
    public static int[] addToArray(int[] inputArray, int addValue) {
        int[] outputArray = new int[inputArray.length + 1];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
        }
        outputArray[inputArray.length] = addValue;
        return outputArray;
    }

    // Method insertToArray
    public static int[] insertToArray(int[] inputArray, int position, int insertValue) {
        int[] outputArray = new int[inputArray.length + 1];
        //Use built-in method System.arraycopy to copy
        System.arraycopy(inputArray, 0, outputArray, 0, position);
        System.arraycopy(inputArray, position, outputArray, position + 1, inputArray.length - position);
        outputArray[position] = insertValue;
        return outputArray;
    }

    // Method removeFromArray
    public static int[] removeFromArray(int[] inputArray, int deletePosition) {
        int[] outputArray = new int[inputArray.length - 1];
        // Use built-in method System.arraycopy to copy
        System.arraycopy(inputArray, 0, outputArray, 0, deletePosition);
        System.arraycopy(inputArray, deletePosition + 1, outputArray, deletePosition, inputArray.length - deletePosition - 1);
        return outputArray;
    }
}

