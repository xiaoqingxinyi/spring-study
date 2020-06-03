import com.wang.config.MyConfig;
import com.wang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wanggy5
 * @date 2020/6/3 23:47
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置方法去做，我们就只能通过AnnotationConfigApplicationContext上下文来获取容器，通过配之类的class对象加载。
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
