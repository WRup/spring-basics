public class Car {
    private String chassis_number, color, fuel_type;
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

    public void show() {
        System.out.println("Showing car " + chassis_number + " having color:-" + color + " and price:-" + price);
    }

}
