//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу,
//        которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.


import java.util.*;
import java.util.stream.Collectors;

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
        Map<String,Integer> staffs = new HashMap<>();
        for (int i = 0; i < staff.size() ; i++) {
            int count = 1;
            for (int j = 0; j < staff.size() ; j++) {
                if (staff.get(i).equals(staff.get(j))) count ++;
                if (count > 1 || j == staff.size()-1) staffs.put(staff.get(i),count -1);

            }

        }

        Map<String, Integer> sortedMap = staffs.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        sortedMap.entrySet().forEach(System.out::println);
    }
    }
