package recursionLab;

import java.util.Scanner;

public class P04_RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num= Integer.parseInt(scanner.nextLine());

        System.out.println(recursiveFactorial(num));
    }

    public static int recursiveFactorial(int num){
        if (num == 1){
            return 1;
        }

       return num * recursiveFactorial(num - 1);
    }
}
