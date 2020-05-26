import com.wang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanggy5
 * @date 2020/5/25 0:03
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = applicationContext.getBean("people",People.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}
