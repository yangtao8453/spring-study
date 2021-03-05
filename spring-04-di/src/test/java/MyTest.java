import com.yangtao.pojo.Student;
import com.yangtao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangtao
 * @description
 * @create 2021-02-28 10:39
 */
public class MyTest {

    @Test
    public void TestStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void TestUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        User user1 = (User) context.getBean("User1");
        System.out.println(user1.toString());

        User user2 = (User) context.getBean("User2");
        System.out.println(user2.toString());
    }

}
