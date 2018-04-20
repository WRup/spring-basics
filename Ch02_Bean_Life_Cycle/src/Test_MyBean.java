import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_MyBean {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans_life_cycle.xml");

        MyBean obj = (MyBean)context.getBean("obj_myBean");
        obj.display();
    }
}
