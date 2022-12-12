/*Подумать над структурой класса Ноутбук для магазина техники -
        выделить поля и методы. Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий
        (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
        Критерии фильтрации можно хранить в Map. Например:
        “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев -
        сохранить параметры фильтрации можно также в Map.
        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/


import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Asus", "pavilion 326", 8,
                512, "Mac", "white");
        Notebook notebook2 = new Notebook("Asus", "pavilion 329", 16,
                512, "Win10", "black");
        Notebook notebook3 = new Notebook("HP", "426", 8,
                1024, "Win10", "black");
        Notebook notebook4 = new Notebook("Aser", "JPQ 876", 32,
                1024, "Mac", "white");
        Notebook notebook5 = new Notebook("Aser", "HDl 586", 8,
                512, "Linux", "black");
        Map <String, Object> forNotebook = new TreeMap();
        forNotebook.put("notebook1", notebook1);
        forNotebook.put("notebook2", notebook2);
        forNotebook.put("notebook3", notebook2);
        forNotebook.put("notebook4", notebook2);
        forNotebook.put("notebook5", notebook2);
        choiseNotebook();






        }
    public static Map<String,String> choiseNotebook() {
        Integer choise = 0;
        Map <String, String> forChoiseBook = new TreeMap<>();
        while (choise!=7) {
            System.out.println("Здравствуйте. Подскажите какой критерий выбора вас интересует: (введите цифру)\n" +
                    "1 Марка\n" +
                    "2 Объем оперативной памяти\n" +
                    "3 Размер жесткого диска\n" +
                    "4 Операционная система\n" +
                    "5 Цвет\n" +
                    "6 Поиск\n" +
                    "7 Выход\n");
            Scanner forChoise = new Scanner(System.in);
            choise = forChoise.nextInt();
            if (choise == 1){
                System.out.println("Введите марку: (Asus, Mac, Aser, HP)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                forChoiseBook.put("Stamp", forStamp);


            }
            if (choise == 2){
                System.out.println("Введите объем оперативной памяти: (4Гб, 8Гб, 16Гб, 32Гб, 64Гб)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                forChoiseBook.put("ram",forStamp);
            }
            if (choise == 3){
                System.out.println("Введите объем жесткого диска: (512Гб, 1024Гб)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                forChoiseBook.put("hardDiskCapacity",forStamp);
            }
            if (choise == 4){
                System.out.println("Введите операционную систему: (Linux, Win10, Mac)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                forChoiseBook.put("opirationSystem",forStamp);
            }
            if (choise == 5){
                System.out.println("Введите цвет: (white, black)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                forChoiseBook.put("color",forStamp);
            }
            if (choise == 6){
                System.out.println("Ищем подходящие ноутбуки: ");
                System.out.println(forChoiseBook);

            }
        }
    return forChoiseBook;
    }
    }



