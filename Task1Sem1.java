

import java.util.Scanner;

public class Task1Sem1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt();
        int count = 0;
        int fibo = 1;
        iScanner.close();
        for(int i = 0; i <= number; i++){
            count += i;
            if (i != 0) fibo *= i;     
             
        }

        System.out.printf("Сумма чисел от 1 до %d равна %d \n", number, count);
        System.out.printf("Произведение чисел от 1 до %d равно %d \n", number, fibo);

    }
}
