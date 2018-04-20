import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_InitializingBean {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans_life_cycle.xml");
        Demo_InitializingBean obj =
                (Demo_InitializingBean)context.getBean("obj_Initializing");
        System.out.println(obj);
    }
}
