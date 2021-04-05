package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Car firstCar = new Car(4, 2);
        firstCar.setCost(5000);
        firstCar.printInfo();

        Car secondCar = new Car(4, 4);
        secondCar.setCost(4590);
        secondCar.printInfo();

        Motorcycle firstMotorcycle = new Motorcycle(3, 100);
        firstMotorcycle.printInfo();

        Motorcycle secondMotorcycle = new Motorcycle(2, 120);
        secondMotorcycle.printInfo();
    }
}
