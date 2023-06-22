import java.util.logging.*;


public class Task2Sem2 {
    public static void main(String[] arg){
        Integer[] array = {4, 2, 5, 3, 1};
        int max = 0;
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j + 1]){
                    max = array[j];
                    array[j] = array[j+1];
                    array[j+1] = max;
                }
        }
    }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
    }
}
