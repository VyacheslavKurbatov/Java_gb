public class Laptop {
    static int idStart = 0;
    private int id;
    private String brand;
    private String type;
    private int ram;
    private int hd;
    private String operatingSystem;
    private String color;

    /**
     * Это конструктор
     * @param brand это марка
     * @param type это серия
     * @param ram это объем оперативной памяти
     * @param hd это объем жесткого диска
     * @param operatingSystem это тип операционной системы
     * @param color это цвет
     */
    public Laptop(String brand, String type, int ram, int hd, String operatingSystem, String color) {
        this.brand = brand;
        this.type = type;
        this.ram = ram;
        this.hd = hd;
        this.operatingSystem = operatingSystem;
        this.color = color;
        id = ++idStart;
    }
    public Laptop(String brand, String type, int ram, int hd, String operatingSystem){
        this(brand,
            type,
                ram,
                hd,
            operatingSystem,
            "not set");
    }
    public Laptop(String brand, String type, int ram, int hd){
        this(brand,
                type,
                ram,
                hd,
                "not set",
                "not set");
    }
    public Laptop(String brand, String type, int ram){
        this(brand,
                type,
                ram,
                -1,
                "not set",
                "not set");
    }
    public Laptop(String brand, String type){
        this(brand,
                type,
                -1,
                -1,
                "not set",
                "not set");
    }
    public Laptop(String brand){
        this(brand,
                "not set",
                -1,
                -1,
                "not set",
                "not set");
    }
    public Laptop(){
        this("not set",
                "not set",
                -1,
                -1,
                "not set",
                "not set");
    }

    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public int getRam(){
        return ram;
    }
    public int getHd(){
        return hd;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", RAM=" + ram +
                ", HD=" + hd +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public void setBrand(String inputBrand){
        brand = inputBrand;
    }
    public void setType(String inputType){
        type = inputType;
    }
    public void setRam(int inputRAM){
        ram = inputRAM;
    }
    public void setHd(int inputHD){
        hd = inputHD;
    }
    public void setOperatingSystem(String inputOS){
        operatingSystem = inputOS;
    }
    public void setColor(String inputColor){
        color = inputColor;
    }

}
