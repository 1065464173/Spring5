import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.sxuet.SpringConfig;
import top.sxuet.service.UserService;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 13:03
 */
public class TestDemo {
  /** Component、 Service、 Controller、 Repository、注解的使用测试 */
  @Test
  public void test01() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);
    userService.add();
  }

  /** Autowired \ Qualifier(value = "userDao") 的使用测试 */
  @Test
  public void test02() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);
    userService.add();
    String name = userService.getName();
    System.out.println(name);
  }

  /** 配置类测试 */
  @Test
  public void test03() {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = context.getBean("userService", UserService.class);
    System.out.println(userService);
    userService.add();
    String name = userService.getName();
    System.out.println(name);
  }
}
