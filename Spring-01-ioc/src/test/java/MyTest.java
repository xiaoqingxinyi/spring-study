import com.wang.daoimpl.UserDaoMysqlImpl;
import com.wang.serviceimpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanggy5
 * @date 2020/5/23 19:39
 */
public class MyTest {
    public static void main(String[] args) {

//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        //获取applicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");

        userService.getUser();
    }
}
