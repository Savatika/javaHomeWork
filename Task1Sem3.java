import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;


public class Task1Sem3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер списка: ");
        Integer sizeArr = iScanner.nextInt();
        iScanner.close();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < sizeArr; i++){
            arr.add(random.nextInt(0,100));
        }
        System.out.println(arr); 
        deleteEven(arr);
        Integer maxima = Collections.max(arr);
        Integer minima = Collections.min(arr);
        System.out.printf("Максимальное число: "+ maxima + "\n");
        System.out.printf("Минимальное число: "+ minima + "\n");
        arithmetiMean(arr);
        
    }

    public static void deleteEven(ArrayList<Integer> array){
        for(int j = array.size()-1; j >=0; j--){
            Integer even = array.get(j) % 2;
            if (even == 0){
                array.remove(j);
            }
        }  
        System.out.println(array);     
    }
    public static void arithmetiMean(ArrayList<Integer> array){
        double summa = 0;
        for(int j = 0; j < array.size(); j++){
            summa = summa + array.get(j);
            }
        double srednee = summa / array.size();
            System.out.printf("Среднее арифметическое: "+ srednee + "\n"); 
        }  
                
    }

