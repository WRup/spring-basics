public class CarService {

    private static CarService carService = new CarService();

    private CarService(){}

    public static CarService createService()
    {
        return carService;
    }
    public void serve()
    {
        System.out.println("car service");
    }

}
