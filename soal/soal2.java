package soal;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan bilangan pertama : ");
            bilangan[i] = input.nextInt();
        }

        int largestNum = bilangan[0];
        for (int i = 1; i < 3; i++) {
            if (largestNum < bilangan[i]) {
                largestNum = bilangan[i];
            }
        }
        System.out.println(largestNum);
    }
}
