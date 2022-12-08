//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу,
//        которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class second {
    public static void main(String[] args) {
        List<String> staff = new ArrayList<>();
        staff.add("Петров");
        staff.add("Иванов");
        staff.add("Сидоров");
        staff.add("Володин");
        staff.add("Сидоров");
        staff.add("Сидоров");
        staff.add("Петров");
        staff.add("Курлюков");
        System.out.println(staff);
        Map<String,Integer> staffs = new HashMap<>();
        int count = 0;
        for (int i = 0; i <staff.size() ; i++) {
            for (int j = 1; j <staff.size()-1 ; j++) {
                if (staff.get(i).equals(staff.get(j))) count ++;

            }

        }
    }
}