import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList noutList = new ArrayList<>();
        noutList.add("sdfg");
        noutList.add("sdfsf");
        ArrayList res = new ArrayList<>();
        noutList = res;
        for (int i = 0; i < noutList.size(); i++) {
            System.out.println(noutList.get(i));
        }
       }

}
   

