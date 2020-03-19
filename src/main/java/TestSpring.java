import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // can access this class because of Spring Context dependency
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); // access applicationContext. xml file, read it and put Beans to Application Context

        TestBean testBean = context.getBean("testBean", TestBean.class); // Bean id name & class, Bean of which we want to get

        System.out.println(testBean.getName());

        context.close(); // when finished working with Application Context, connection must be closed
    }
}
