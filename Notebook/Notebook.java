

public class Notebook {
    private String model;
    private Integer ram;
    private Integer memory;
    private String os;
    private String color;
    
    public String getModel() {
        return model;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getMemory() {
        return memory;
    }
    
    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        
        this.color = color;
    }

    public Notebook(String model, Integer ram, Integer memory, String os, String color){
        this.model = model;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }
    public String toString() {
        return model + "; " +
                "ОЗУ:" + ram +  "; " +
                "Диск: " + memory + "; " +
                "ОС: " + os + "; " +
                "цвет:" + color + "; ";
    }
}
