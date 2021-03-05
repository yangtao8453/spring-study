import com.yangtao.service.UserService;
import com.yangtao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 18:36
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //注意动态代理返回的是一个接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

    }
}
