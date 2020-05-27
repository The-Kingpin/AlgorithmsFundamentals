package recursionLab;

import java.util.Scanner;

public class P02_RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        recursiveDrawing(num);
        recursiveDrawingSecondVariant(num);
    }

    public static void recursiveDrawing(int num) {
        drawStars(num);
        drawHashTag(1, num);
    }

    public static void recursiveDrawingSecondVariant(int num) {
        if (num == 0) {
            return;
        }

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }

        System.out.println();

        recursiveDrawingSecondVariant(num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print("#");
        }

        System.out.println();

    }

    public static void drawStars(int num) {
        if (num > 1) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
            drawStars(num - 1);

        } else {
            System.out.println("*");
        }
    }

    public static void drawHashTag(int start, int end) {

        if (start < end) {
            for (int i = 0; i < start; i++) {
                System.out.print("#");
            }

            System.out.println();

            drawHashTag(start + 1, end);
        } else {
            for (int i = 0; i < end; i++) {
                System.out.print("#");
            }

        }
    }
}
