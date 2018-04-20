import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

    public static void main(String[] args)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");

        Customer obj = (Customer)context.getBean("customer");
        System.out.println(obj.getCust_name() + "\t"+ obj.getCust_id() + "\t" + obj.getCust_address());
    }
}
