//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу,
//        которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.


import java.util.*;

public class second {
    public static void main(String[] args) {
        List<String> staff = new ArrayList<>();
        staff.add("Сидоров");
        staff.add("Потапенко");
        staff.add("Петров");
        staff.add("Иванов");
        staff.add("Сидоров");
        staff.add("Володин");
        staff.add("Потапенко");
        staff.add("Володин");
        staff.add("Володин");
        staff.add("Володин");
        staff.add("Володин");
        staff.add("Володин");
        staff.add("Сидоров");
        staff.add("Потапенко");
        staff.add("Сидоров");
        staff.add("Петров");
        staff.add("Потапенко");
        staff.add("Курлюков");
        staff.add("Потапенко");
        staff.add("Сидоров");
        System.out.println(staff);
        Map<Integer,String> staffs = new HashMap<>();
        for (int i = 0; i < staff.size() ; i++) {
            int count = 1;
            for (int j = 0; j < staff.size() ; j++) {
                if (staff.get(i).equals(staff.get(j))) count ++;
                if (count > 1 || j == staff.size()-1) staffs.put(count -1 , staff.get(i));

            }

        }
        TreeMap<Integer, String> sortedMap = new TreeMap<>(staffs);
        Set set = staffs.entrySet();
        Iterator i = set.iterator();

        // Traverse map and print elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println(sortedMap);
    }
}