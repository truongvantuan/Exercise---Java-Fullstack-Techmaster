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

        // Add new values to array
        int[] resultArray = new int[inputArray.length + 1];
        System.out.println("\nNhap gia tri can them vao mang: ");
        int addValue = input.nextInt();

        // Call method addtoArray
        resultArray = addToArray(inputArray, addValue);
        System.out.print("Mang sau khi them gia tri " + addValue + " la: ");
        for (int e : resultArray
        ) {
            System.out.print(e + " ");
        }
    }


    public static int[] addToArray(int[] inputArray, int addValue) {
        int[] outputArray = new int[inputArray.length + 1];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
        }
        outputArray[inputArray.length] = addValue;
        return outputArray;
    }

}

