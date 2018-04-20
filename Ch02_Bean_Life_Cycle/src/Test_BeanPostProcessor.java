import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_BeanPostProcessor {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans_life_cycle.xml");

        Demo_BeanPostProcessor obj =
                (Demo_BeanPostProcessor)context.getBean("beanPostProcessor");
        System.out.println(obj);
    }
}
