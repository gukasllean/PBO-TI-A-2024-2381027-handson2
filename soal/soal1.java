package soal;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama : ");
        bilangan[0]= input.nextInt();

        System.out.println("Masukkan bilangan kedua : ");
        bilangan[1]= input.nextInt();

        if(bilangan[1] > bilangan[0]){
            System.out.println(bilangan[1]);
        } else {
            System.out.println(bilangan[0]);
        }
    }
}
