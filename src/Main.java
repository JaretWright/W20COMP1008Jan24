public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car(2019,"Mazda","CX5",18034,"automatic",34754);
        Car car2 = new Car(2019,"Mazda","CX3",12034,"automatic",18763);
        Car car3 = new Car(2020,"Mercedes","C350",2345,"automatic",65473);

        CarLot jamesMotors = new CarLot();
        jamesMotors.addCar(car1);
        jamesMotors.addCar(car2);
        jamesMotors.addCar(car3);

        System.out.printf("The inventory is worth: $%.2f", jamesMotors.getInventoryValue());
        System.out.printf("The cars with model year 2019:%n");
        System.out.printf("%s%n", jamesMotors.getCarsWithYear(2019));
    }
}
