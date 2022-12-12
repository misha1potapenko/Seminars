import java.util.*;

public class Notebook {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        return Objects.equals(getStamp(), notebook.getStamp()) && Objects.equals(model, notebook.model) && Objects.equals(getRAM(), notebook.getRAM()) && Objects.equals(getHardDiskCapacity(), notebook.getHardDiskCapacity()) && Objects.equals(opirationSystem, notebook.opirationSystem) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStamp(), model, getRAM(), getHardDiskCapacity(), opirationSystem, color);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "stamp='" + stamp + '\'' +
                ", model='" + model + '\'' +
                ", RAM='" + RAM + '\'' +
                ", hardDiskCapacity='" + hardDiskCapacity + '\'' +
                ", opirationSystem='" + opirationSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    private String stamp;
    private String model;
    private Integer RAM;
    private Integer hardDiskCapacity;
    private String opirationSystem;
    private String color;

    public Notebook(String stamp, String model, Integer ram, Integer hardDiskCapacity,
                    String opirationSystem, String color) {
        this.stamp = stamp;
        this.model = model;
        RAM = ram;
        this.hardDiskCapacity = hardDiskCapacity;
        this.opirationSystem = opirationSystem;
        this.color = color;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(Integer hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }
//    public static void choiseNotebook() {
//        Integer choise = 0;
//        ArrayList<String> forChoiseBook = new ArrayList<>();
//        while (choise!=7) {
//            System.out.println("Здравствуйте. Подскажите какой критерий выбора вас интересует: (введите цифру)\n" +
//                    "1 Марка\n" +
//                    "2 Объем оперативной памяти\n" +
//                    "3 Размер жесткого диска\n" +
//                    "4 Операционная система\n" +
//                    "5 Цвет\n" +
//                    "6 Поиск\n" +
//                    "7 Выход\n");
//            Scanner forChoise = new Scanner(System.in);
//            choise = forChoise.nextInt();
//            if (choise == 1){
//                System.out.println("Введите марку: (Asus, Mac, Aser, HP)");
//                Scanner stamp = new Scanner(System.in);
//                String forStamp = stamp.nextLine();
//                forChoiseBook.add(forStamp);
//            }
//            if (choise == 2){
//                System.out.println("Введите объем оперативной памяти: (4Гб, 8Гб, 16Гб, 32Гб, 64Гб)");
//                Scanner stamp = new Scanner(System.in);
//                String forStamp = stamp.nextLine();
//                forChoiseBook.add(forStamp);
//            }
//            if (choise == 3){
//                System.out.println("Введите объем жесткого диска: (512Гб, 1024Гб)");
//                Scanner stamp = new Scanner(System.in);
//                String forStamp = stamp.nextLine();
//                forChoiseBook.add(forStamp);
//            }
//            if (choise == 4){
//                System.out.println("Введите  систему: (Linux, Win10, Mac)");
//                Scanner stamp = new Scanner(System.in);
//                String forStamp = stamp.nextLine();
//                forChoiseBook.add(forStamp);
//            }
//            if (choise == 5){
//                System.out.println("Введите цвет: (white, black)");
//                Scanner stamp = new Scanner(System.in);
//                String forStamp = stamp.nextLine();
//                forChoiseBook.add(forStamp);
//            }
//            if (choise == 6){
//                System.out.println("Ищем подходящие ноутбуки: ");
//                System.out.println(forChoiseBook);
//
//
//                }
//            }
//
//        }

    }

