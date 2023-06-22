import java.util.*;


public class TAsk1Sem4 {
    public static void main(String[] args) {
        // Создаем списки

        Deque<Integer> deq1 = new LinkedList<>();
        Deque<Integer> deq2 = new LinkedList<>();
        int number = 0;
        int size = 3;
        System.out.printf("Введите %d числа для первого списка: \n", size);
        Scanner iScanner = new Scanner(System.in);
        
        for (int i = 0; i < size; i++) {
            number = iScanner.nextInt();
            deq1.add(number);
        }
        System.out.printf("Введите %d числа для второго списка: \n", size);
        for (int i = 0; i < size; i++) {
            number = iScanner.nextInt();
            deq2.add(number);
        }
        System.out.println("\n");
        iScanner.close();
        System.out.println(deq1);
        System.out.println(deq2);
        System.out.println("\n");

        // Переворачиваем
        Deque<Integer> rev1 = recDeq(deq1); 
        Deque<Integer> rev2 = recDeq(deq2);
        
        System.out.println(rev1);
        System.out.println(rev2);
        int num = number(rev1) * number(rev2);
        System.out.println(Deq(num));
    }
    public static int number(Deque<Integer> deque) { // переводим в число
        int num = 0;
        int stepen = deque.size()-1;
        while (!deque.isEmpty()) {
            num += deque.removeFirst()*(Math.pow(10, stepen));
            stepen -= 1;
        }

        return num;
    }


    public static Deque<Integer> recDeq(Deque<Integer> deq){ // Метод переворота
        Deque<Integer> deq3 = new LinkedList<>();
        while (!deq.isEmpty()) {
            deq3.add(deq.removeLast());
        }
        return deq3;
    }

    public static Deque<Integer> Deq(int num){ // возвращаем результат в список
        Deque<Integer> deq = new LinkedList<>();
        int length = String.valueOf (num).length();
        for (int i = 0; i < length; i++) {
            int digit = num % 10;
            deq.addFirst(digit);
            num /= 10;
        }
        return deq;
    }
   
}
