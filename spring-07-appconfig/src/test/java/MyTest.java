import com.yangtao.config.MyConfig;
import com.yangtao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangtao
 * @description
 * @create 2021-02-28 21:06
 */
public class MyTest {

    @Test
    public void TestJavaConfig(){
        //如果完全使用了配置类方式，就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }

}
