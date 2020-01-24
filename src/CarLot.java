import java.util.ArrayList;

public class CarLot {
    private ArrayList<Car> inventory ;

    public CarLot(ArrayList<Car> cars) {
        this.inventory = cars;
    }
    
    public CarLot()
    {
        this.inventory = new ArrayList<>();
    }

    /**
     * Add a car to the inventory
     * @param newCar
     */
    public void addCar(Car newCar)
    {
        inventory.add(newCar);
    }

    /**
     * This method returns the value of all the Car objects
     *
     */
    public double getInventoryValue()
    {
        double inventoryValue =0;

        for (Car car:inventory)
            inventoryValue += car.getPrice();

        return inventoryValue;
    }

    /**
     * This method will return the number of Car objects in the
     * inventory
     */
    public int getNumberOfCars()
    {
        return inventory.size();
    }

    /**
     * This method will return a Collection of Car objects
     * that have the specifed model year
     */
    public ArrayList<Car> getCarsWithYear(int modelYear)
    {
        ArrayList<Car> carsForYear = new ArrayList<>();
        for (Car car:inventory)
        {
            if (car.getModelYear()==modelYear)
                carsForYear.add(car);
        }
        return carsForYear;
    }


}
