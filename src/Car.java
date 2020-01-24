import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Car {
    private int modelYear, mileage;
    private String make, model, transmission;
    private double price;

    public Car(int modelYear, String make, String model, int mileage,  String transmission, double price) {
        setModelYear(modelYear);
        setMileage(mileage);
        setMake(make);
        setModel(model);
        setTransmission(transmission);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be greater than or equal to 0");
    }

    public Car(int modelYear, String make, String model) {
        setModelYear(modelYear);
        setMake(make);
        setModel(model);
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        if (modelYear>= 1885 && modelYear<= LocalDate.now().getYear()+1)
            this.modelYear = modelYear;
        else
            throw new IllegalArgumentException("Model year must be 1885-2021");
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage>=0)
            this.mileage = mileage;
        else
            throw new IllegalArgumentException("mileage must be greater than or equal to 0");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        List<String> brands = Arrays.asList("Chevrolet","Mazda","VW","Toyota","Mercedes");

        if (brands.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Valid brands are: "+brands);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty())
            this.model = model;
        else
            throw new IllegalArgumentException("Model cannot be empty");
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        List<String> transmissions = Arrays.asList("manual","automatic","electric","CVT");
        if (transmissions.contains(transmission))
            this.transmission = transmission;
        else
            throw new IllegalArgumentException("valid transmissions are: "+transmissions);
    }

    public String toString()
    {
        return String.format("%d %s %s", modelYear,make,model);
    }
}
