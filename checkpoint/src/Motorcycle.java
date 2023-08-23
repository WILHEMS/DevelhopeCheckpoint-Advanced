import java.util.Objects;

public class Motorcycle extends Vehicle{
    public Motorcycle(String model, Integer year, double price) {
        super(model, year, price);
    }
public  String showInfo(String model){
  if(Objects.equals(model, super.getModel())){
      return "model is "+ super.getModel() + " year is " + super.getYear() + " price is "+ super.getPrice();
  }
  return "Not Found";
}
}
