import org.springframework.beans.factory.DisposableBean;

public class Demo_DisposableBean implements DisposableBean {

    private String message;
    private String name;

    public Demo_DisposableBean()
    {
        System.out.println("Constructor gets called for initializing data members in Disposable Bean");
        message = "welcome";
        name = "no name";
    }

    @Override
    public String toString()
    {
        return message + "\t" + name;
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroy fro disposable bean get called");
        name = null;
    }
}
