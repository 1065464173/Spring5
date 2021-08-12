import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import top.sxuet.bean.Person;
import top.sxuet.config.MainConfig;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 16:37
 */
// @SpringJUnitConfig(MainConfig.class)
public class TestDemo {
  //  @Autowired private Person person;
  ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

  @Test
  public void test01() {
    printBean(context);
  }

  /** 获取扫描范围的bean名 */
  public void printBean(ApplicationContext context) {
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
  }

  /** 获取经过操作系统的类型过滤的所有ioc容器中的bean */
  @Test
  public void test02() {
    Environment environment = context.getEnvironment();
    String property = environment.getProperty("os.name");
    System.out.println("System environment:" + property);
    printBean(context);
  }

  /** 注解lazy懒加载测试 */
  @Test
  public void test03() {
    printBean(context);
    Person person1 = context.getBean("person1", Person.class);
  }

  @Test
  public void testFactory() {
    // 会调用getObject方法
    Object bean1 = context.getBean("colorFactoryBean");
    Object bean2 = context.getBean("colorFactoryBean");
    Object bean3 = context.getBean("&colorFactoryBean");
    System.out.println("Bean1的类型:" + bean1.getClass());
    System.out.println(bean1 == bean2);
    System.out.println("Bean3的类型:" + bean3.getClass());
  }
}
