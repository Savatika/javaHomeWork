import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;


public class Main {
    public static void main(String[] args){
        Notebook nout1 = new Notebook("Asus", 8, 1024,  "Windows", "Black");
        Notebook nout2 = new Notebook("Hp", 8, 512, "Linux", "Silver");
        Notebook nout3 = new Notebook("Sony", 16, 1024, "Mac", "Black");
        Notebook nout4 = new Notebook("Huawei", 8, 512, "Windows", "Wite");
        Notebook nout5 = new Notebook("Horizont", 4, 256, "Windows", "Black");
        Map<String, Object> myNotebook;
        myNotebook  = new HashMap<String,Object>();

        ArrayList noutList = new ArrayList<>();
        ArrayList finalList = new ArrayList<>();
        noutList.add(nout1);
        noutList.add(nout2);
        noutList.add(nout3);
        noutList.add(nout4);
        noutList.add(nout5);
        HashSet <Notebook> laptops = new HashSet<>(Arrays.asList(nout1,nout2,nout3,nout4,nout5));
        HashSet <Notebook> res = new HashSet<>();

        

        Scanner iScanner = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.println("Выберите параметр:");
            System.out.println("1. Размер оперативной памяти");
            System.out.println("2. Размер жесткого диска");
            System.out.println("3. Операционная система");
            System.out.println("4. Цвет");
            System.out.println("5. Вывод подходящих вариантов");
            Integer choise = iScanner.nextInt();
            switch(choise){
                case 1:
                    System.out.println("Введите минимальное значение оперативной памяти: ");
                    int opMem = iScanner.nextInt();
                    myNotebook.put("ram", opMem);
                    break;
                case 2:
                    System.out.println("Введите минимальное значение памяти жесткого диска: ");
                    int hardMem = iScanner.nextInt();
                    myNotebook.put("memory", hardMem);
                    break;
                case 3:
                    System.out.println("Выберите операционную систему ");
                    iScanner.nextLine();
                    String sistema = iScanner.nextLine();
                    myNotebook.put("sistema", sistema);
                    break;
                case 4:
                    System.out.println("Выберите цвет: ");
                    iScanner.nextLine();
                    String cvet = iScanner.nextLine();
                    myNotebook.put("color", cvet);
                    break;
                case 5:
                System.out.println("Вот, что я могу предложить: ");
                flag = true;
                    break;
                default:
                    System.out.println("Ошибка!!!");
                break;
            }
        }

        for (Entry<String, Object> entry : myNotebook.entrySet()) {
            if(entry.getKey().equals("ram")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook) it.next();
                    if(lap.getRam()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
             if(entry.getKey().equals("memory")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook)it.next();
                    if(lap.getMemory()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("sistema")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Notebook lap = (Notebook)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                Notebook lap = (Notebook)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }
}