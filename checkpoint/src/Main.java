public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota",2023, 200_000.00);
        Motorcycle motorcycle = new Motorcycle("Suzuki", 2023, 50000.00);

        System.out.println("Car details");

        System.out.println(car.getPrice());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println("Motocycle details");

        System.out.println(motorcycle.getPrice());
        System.out.println(motorcycle.getModel());
        System.out.println(motorcycle.getYear());

        }
}