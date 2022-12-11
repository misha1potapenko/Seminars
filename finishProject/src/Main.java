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

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Asus", "pavilion 326", "8Гб",
                "512Гб", "Mac", "white");
        Notebook notebook2 = new Notebook("Asus", "pavilion 329", "16Гб",
                "512Гб", "Win10", "black");
        Notebook notebook3 = new Notebook("HP", "426", "8Гб",
                "1024Гб", "Win10", "black");
        Notebook notebook4 = new Notebook("Aser", "JPQ 876", "32Гб",
                "512Гб", "Mac", "white");
        Notebook notebook5 = new Notebook("Aser", "HDl 586", "8Гб",
                "512Гб", "Linux", "black");
        Map <String, Object> forNotebook = new TreeMap();
        forNotebook.put("notebook1", notebook1);
        forNotebook.put("notebook2", notebook2);
        forNotebook.put("notebook3", notebook2);
        forNotebook.put("notebook4", notebook2);
        forNotebook.put("notebook5", notebook2);
        Notebook.choiseNotebook();


        }
    }
}


