import java.util.*;

public class Task1Sem5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneAndName = new HashMap<>();
        boolean fun = false;
        while(!fun){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\n 1. Add contact\n 2. Output all\n 3. Exit");
        int number = iScanner.nextInt();
        
        switch(number) {
            case 1:
            addContact(phoneAndName);
            break;
            case 2:
            sortedPrint(phoneAndName);
                    break;
            case 3:
                fun = true;

            }
            
        }
        
    }
    public static void addContact(HashMap<String, ArrayList<Integer>> phoneAndName){
        ArrayList<Integer> addNewPhone = new ArrayList<Integer>();
        ArrayList<Integer> addPhone = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        String name = "";
        System.out.println("Введите фамилию абонента:");
        name = iScanner.nextLine();
        int phone;
        if (phoneAndName.containsKey(name)) {
            addNewPhone = phoneAndName.get(name);
            System.out.print("Абонент существует.");
            System.out.println("Введите дополнительный номер телефона: ");
            phone = iScanner.nextInt();
            addNewPhone.add(phone);
            phoneAndName.put(name, addNewPhone);
        } else {
            System.out.println("Введите номер телефона: ");
            phone = iScanner.nextInt();
            addPhone.add(phone);
            phoneAndName.put(name, addPhone);
            System.out.println();

        }
    }
    static void sortedPrint(Map<String, ArrayList<Integer>> map) {
        Set<String> keySet = map.keySet();
       int maxCount = 0;
       int minCount = 1_000_000;
           
       for (var item : map.entrySet()) {
           if (maxCount < item.getValue().size())
               maxCount = item.getValue().size();
           if (minCount > item.getValue().size())
               minCount = item.getValue().size();
               
       }
        
       Stack<String> st = new Stack<>();
       int num = minCount;
       while (num <= maxCount) {
           for (var item : map.entrySet()) {
               if (item.getValue().size() == num) {
                   st.push(item.getKey());
               }  
           }
            num += 1;
       }
   
       String name;
       for (int i = 0; i < keySet.size(); i++) {
           name = st.pop();
           for (var item : map.entrySet()) {
               if (name == item.getKey()) {
                   System.out.printf("%8s: ", item.getKey());
                   System.out.println(item.getValue());
               }
           }
       }
       System.out.println();
       }

}
   

