import com.yangtao.pojo.Hello;
import com.yangtao.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangtao
 * @description
 * @create 2021-02-26 16:20
 */
public class MyTest {

    @Test
    public void TestHello(){
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在Spring中管理了，如果要使用，就直接去取出来就行了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

    @Test
    public void TestStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

}
