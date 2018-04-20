public class Car {
    private String chassis_number, color, fuel_type;

    public void setChassis_number(String chassis_number) {
        this.chassis_number = chassis_number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    private long price;
    private double average;

    public Car()
    {
        chassis_number="eng00";
        color="white";
        fuel_type = "diesel";
        price = 5700001;
        average = 12d;
    }
    public Car(String chassis_number, String color, double average, long price, String fuel_type)
    {
        this.chassis_number = chassis_number;
        this.color = color;
        this.average = average;
        this.price = price;
        this.fuel_type = fuel_type;
    }

    public void show() {
        System.out.println("Showing car " + chassis_number + " having color:-" + color + " and price:-" + price);
    }

}
