import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_CarFactory {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("instance.xml");
        Car car = (Car)context.getBean("car_obj_new");
        car.show();
    }
}
