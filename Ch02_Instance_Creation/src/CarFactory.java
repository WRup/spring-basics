public class CarFactory {

    private static Car car = new Car();

    public Car buildCar()
    {
        System.out.println("building the car");
        return car;
    }
}
