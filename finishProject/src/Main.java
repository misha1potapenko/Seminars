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
        Set<Notebook> laptops = new HashSet<Notebook>();
        laptops.add(new Notebook("Asus", "pavilion 326", 8,
                512, "Mac", "white"));
        laptops.add(new Notebook("Asus", "pavilion 329", 16,
                512, "Win10", "black"));
        laptops.add(new Notebook("Asus", "pavilion 354549", 32,
                512, "Win10", "black"));
        laptops.add(new Notebook("Asus", "pavilion 354549", 64,
                512, "Win10", "black"));
        laptops.add(new Notebook("HP", "426", 8,
                1024, "Win10", "black"));
        laptops.add(new Notebook("HP", "4dsd26", 16,
                1024, "Win10", "black"));
        laptops.add(new Notebook("Aser", "JPQ 876", 32,
                1024, "Mac", "white"));
        laptops.add(new Notebook("Aser", "JPadadQ 876", 64,
                1024, "Linux", "white"));
        laptops.add(new Notebook("Mac", "HDl 586", 8,
                512, "Linux", "black"));
        laptops.add(new Notebook("Mac", "HDl 586", 64,
                512, "Linux", "black"));
        List<Notebook> filtered = new ArrayList<>();
        List<Notebook> filtered2 = new ArrayList<>();
        List<Notebook> filtered3 = new ArrayList<>();
        List<Notebook> filtered4 = new ArrayList<>();
        int choise = 0;
        while (choise != 5) {
            System.out.println("Здравствуйте. Подскажите какой критерий выбора вас интересует: (введите цифру)\n" +
                    "1 Марка\n" +
                    "2 Объем оперативной памяти\n" +
                    "3 Размер жесткого диска\n" +
                    "4 Операционная система\n" +
                    "5 Выход\n");
            Scanner forChoise = new Scanner(System.in);
            choise = forChoise.nextInt();
            if (choise == 1) {
                System.out.println("Введите марку: (Asus, Mac, Aser, HP)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                for (Notebook laptop : laptops) {
                    if (laptop.getStamp().equals(forStamp))
                        filtered.add(laptop);


                }
                System.out.println(filtered);
            }
            if (choise == 2) {
                System.out.println("Введите объем оперативной памяти: (4Гб, 8Гб, 16Гб, 32Гб, 64Гб)");
                Scanner ram = new Scanner(System.in);
                int forRam = ram.nextInt();
                for (Notebook laptop : filtered) {
                    if (laptop.getRAM().equals(forRam))
                        filtered2.add(laptop);
                }
                System.out.println(filtered2);
            }
                if (choise == 3) {
                    System.out.println("Введите объем жесткого диска: (512Гб, 1024Гб)");
                    Scanner hardDiskCapacity = new Scanner(System.in);
                    int forhardDiskCapacity = hardDiskCapacity.nextInt();
                    for (Notebook laptop : filtered2) {
                        if (laptop.getHardDiskCapacity().equals(forhardDiskCapacity))
                            filtered3.add(laptop);
                    }
                    System.out.println(filtered3);
                }
            if (choise == 4) {
                System.out.println("Введите операционную систему: (Linux, Win10, Mac)");
                Scanner stamp = new Scanner(System.in);
                String forStamp = stamp.nextLine();
                for (Notebook laptop : filtered2) {
                    if (laptop.getOpirationSystem().equals(forStamp))
                        filtered4.add(laptop);
                }
                System.out.println(filtered4);
            }

                }


        }

    }



