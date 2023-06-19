

import java.util.Scanner;

public class Task3Sem1 {
    public static void main(String[] args) {
        int result = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        System.out.printf("Что будем делать? Введите действие: + - / * ");
        char operator = iScanner.next().charAt(0);
        iScanner.close();
        switch(operator) {
            case '+': result = a + b;
               break;
            case '-': result = a - b;
               break;
            case '*': result = a * b;
               break;
            case '/': result = a / b;
               break;
            default:  System.out.printf("Error! Enter correct operator");
               return;
         }

         System.out.printf(a + " " + operator + " " + b + " = " + result);
         
    }
    
}
