import com.wang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanggy5
 * @date 2020/5/23 23:58
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //我们的对象现在都在spring中管理了，我们要使用，直接去里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
