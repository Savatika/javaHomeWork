

import java.util.Scanner;

public class Task2Sem1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt();
        iScanner.close();
        boolean boo;
         for(int i=2; i < number; i++) {
        boo = true;
             for (int j=2; j <= i/j; j++)
                      if((i%j) == 0) boo = false;
             if (boo)
                     System.out.print(i + " ");
        }

    }
    
}
