package recursionLab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] input = scanner.nextLine().split(" ");
//        int[] numArr = new int[input.length];
//
//        for (int i = 0; i < numArr.length; i++) {
//            numArr[i]= Integer.parseInt(input[i]);
//        }

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        printArrSum(numArr, 0, 0);
    }

    private static void printArrSum(int[] numArr, int index, int sum) {
        if (index == numArr.length){
            System.out.println(sum);
        }else {
            sum+= numArr[index];
            printArrSum(numArr, ++index, sum );
        }
    }
}
