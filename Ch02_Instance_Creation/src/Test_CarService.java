import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_CarService {
    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("instance.xml");
        CarService carService =
                (CarService)context.getBean("carService");
        carService.serve();
    }
}
