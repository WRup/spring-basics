import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_DisposableBean {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans_life_cycle.xml");

        Demo_DisposableBean obj =
                (Demo_DisposableBean)context.getBean("obj_Disposable");
        System.out.println(obj);

        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
