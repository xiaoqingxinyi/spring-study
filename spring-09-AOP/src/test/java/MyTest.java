import com.wang.service.UserService;
import com.wang.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanggy5
 * @date 2020/10/25 20:49
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
