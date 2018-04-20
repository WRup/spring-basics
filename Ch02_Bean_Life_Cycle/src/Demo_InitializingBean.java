import org.springframework.beans.factory.InitializingBean;

public class Demo_InitializingBean implements InitializingBean {

    private String message;
    private String name;

    public Demo_InitializingBean(){
        System.out.println("constructor stub gets called for initializing data members in demo Initializing bean");
        message = "welcome";
        name = "no name";
    }

    @Override
    public String toString()
    {
        return message + "\t" + name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        name = "Mr. " + name.toUpperCase();
        System.out.println("after properites Set get called");
    }
}
