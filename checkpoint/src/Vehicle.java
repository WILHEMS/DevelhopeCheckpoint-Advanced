import java.time.LocalDate;

public class Vehicle {
    private String model;
    public Integer year;
    public double price;

    public Vehicle(String model, Integer year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Vehicle() {
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
