import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.sxuet.config.TxConfig;
import top.sxuet.service.UserTableService;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-02 21:13
 */
public class TransactionTest {

  /** 事务基于注解测试 */
  @Test
  public void test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    UserTableService userTableService = context.getBean("userTableService", UserTableService.class);
    userTableService.transfer();
  }

  /** 事务基于xml测试 */
  @Test
  public void test02() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    UserTableService userTableService = context.getBean("userTableService", UserTableService.class);
    userTableService.transfer();
  }

  /** 完全注解——配置类的测试 测试失败，找不到transactionManager 的bean 可能是因为jdk的版本过于新了？ */
  @Test
  public void test03() {
    ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
    UserTableService userTableService = context.getBean("userTableService", UserTableService.class);
    userTableService.transfer();
  }
}
