package recursionLab;

import java.util.Scanner;

public class P03_GeneratingZeroOneVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Integer[] memory = new Integer[num];

        fillVector(memory, 0);
    }

    public static void fillVector(Integer[] memory, int index) {
        if (index >= memory.length){
            print(memory);
            return;
        }

        for (int i = 0; i <= 1; i++) {
            memory[index] = i;
            fillVector(memory, index + 1);
        }
    }

    public static void print(Integer[] memory){
        for (Integer integer : memory) {
            System.out.print(integer);
        }

        System.out.println();
    }
}
