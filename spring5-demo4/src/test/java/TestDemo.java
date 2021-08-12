import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.sxuet.aopanno.User;
import top.sxuet.aopxml.Book;
import top.sxuet.dao.UserDao;
import top.sxuet.factory.JDKProxy;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 16:07
 */
public class TestDemo {
  /** JDK aop 动态代理手动写原理演示测试 */
  @Test
  public void test01() {
    JDKProxy jdkProxy = new JDKProxy();
    Object instance = jdkProxy.getInstance();
    UserDao instance1 = (UserDao) instance;
    System.out.println(instance1.add(1, 2));
    System.out.println(instance1.update("1"));
  }

  /** 测试Spring+AspectJ 注解方式测试 */
  @Test
  public void test02() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    User user = context.getBean("user", User.class);
    user.add();
  }

  /** 测试Spring+AspectJ xml配置文件方法测试 */
  @Test
  public void test03() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    Book book = context.getBean("book", Book.class);
    book.read();
  }
}
