package soal;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukin angka ke 1 : ");
        int nomorPertama = input.nextInt();

        System.out.println("Masukin angka ke 2 : ");
        int nomorKedua = input.nextInt();

        System.out.println("Masukin angkanya mau diapain ( + , -, *, /, % ): ");
        String operand = input.next();

        int hasill;

        switch (operand){
            case "+":
                hasill = nomorPertama + nomorKedua;
                break;
            case "-":
                hasill = nomorPertama - nomorKedua;
                break;
            case "*":
                hasill = nomorPertama * nomorKedua;
                break;
            case "/":
                hasill = nomorPertama / nomorKedua;
                break;
            case "%":
                hasill = nomorPertama % nomorKedua;
                break;
            default:
                System.out.println("Ga ada");
                return;
        }
        System.out.println("Hasilnya adalah : "+ hasill);
        input.close();
    }
}
