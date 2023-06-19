import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of your list: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(0,50));
        }
        System.out.println(list);
        sc.close();
        minItem(list);
        maxItem(list);
        arithmeticOfItems(list);
        delEvenItems(list);
    }
    public static void minItem(ArrayList<Integer> list) {
        list.sort(null);
        System.out.printf("Minimum value of the list: " + list.get(0) + "\n");    
    }
    public static void maxItem(ArrayList<Integer> list) {
        list.sort(null);
        System.out.printf("Maximum value of the list: " + list.get(list.size()-1)+ "\n");
    }
    public static void arithmeticOfItems(ArrayList<Integer> list) {
        double sum=0;
        for (Integer item : list) {
            sum+=item;    
        }
        double res = sum/list.size();
        System.out.printf("Arithmetic mean of the list "+ res + "\n");
    }
    public static void delEvenItems(ArrayList<Integer> list) {
        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}