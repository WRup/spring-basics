import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

    public static void main(String[] arogs)
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("customer.xml");

        Customer customer = (Customer)context.getBean("customer");
        System.out.println(customer.getCust_name() + "\t" + customer.getCust_id());
    }
}
