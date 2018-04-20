import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor_Ambiguity {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");

        Car obj = (Car)context.getBean("car_const1");
        obj.show();
    }
}
