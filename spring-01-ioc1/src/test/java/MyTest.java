import com.yangtao.dao.UserDaoMysqlImpl;
import com.yangtao.dao.UserDaoSqlserverImpl;
import com.yangtao.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangtao
 * @description
 * @create 2021-02-26 11:29
 */
public class MyTest {

    //用户实际调用的是业务层
    @Test
    public void TestUserDaoImpl(){
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoSqlserverImpl());
//        userService.getUser();

        //获取ApplicationContext，拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //拿到容器后，需要什么直接get就行了
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }



}
