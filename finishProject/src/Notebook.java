//1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …


public class Notebook {

    private String stamp;
    private String model;
    private String RAM;
    private String hardDiskCapacity;
    private String opirationSystem;
    private String color;

    public Notebook(String stamp, String model, String ram, String hardDiskCapacity,
                    String opirationSystem, String color) {
        this.stamp = stamp;
        this.model = model;
        RAM = ram;
        this.hardDiskCapacity = hardDiskCapacity;
        this.opirationSystem = opirationSystem;
        this.color = color;
    }
}
