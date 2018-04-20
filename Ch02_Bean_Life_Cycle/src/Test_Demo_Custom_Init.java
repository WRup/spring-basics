import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Demo_Custom_Init {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans_life_cycle.xml");
        Demo_Custom_Init obj =
                (Demo_Custom_Init)context.getBean("obj");
        System.out.println(obj);
    }
}
