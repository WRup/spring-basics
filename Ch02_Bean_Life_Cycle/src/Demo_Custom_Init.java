public class Demo_Custom_Init {

    private String message;
    private String name;

    public Demo_Custom_Init()
    {
        System.out.println("constructor get called for initializing data membersin Custom init");
        message = "welcome";
        name = "no name";
    }

    @Override
    public String toString()
    {
        return message+"\t"+name;
    }

    public void myInit()
    {
        name = name.toUpperCase();
        System.out.println("myInit() get called");
    }

    public void destroy()
    {
        name = null;
        System.out.println("destroy called");
    }
}
