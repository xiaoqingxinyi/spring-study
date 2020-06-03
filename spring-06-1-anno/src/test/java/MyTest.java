import com.wang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanggy5
 * @date 2020/6/3 23:14
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
