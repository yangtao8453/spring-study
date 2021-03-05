import com.yangtao.dao.UserMapper;
import com.yangtao.pojo.User;
import com.yangtao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-03-02 14:05
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapperImpl2 = context.getBean("userMapperImpl2", UserMapper.class);
        List<User> users = userMapperImpl2.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
