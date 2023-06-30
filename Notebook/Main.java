import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Notebook("Notebook 3", 8, "linux", 85000, "Lenovo"));
        set.add(new Notebook("Notebook 4", 4, "linux", 90000, "Horizont"));
        set.add(new Notebook("Notebook 5", 16, "Mac", 90000, "Horizont"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}