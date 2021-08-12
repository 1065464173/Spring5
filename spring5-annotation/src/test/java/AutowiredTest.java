import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sxuet.bean.Boss;
import top.sxuet.bean.Car;
import top.sxuet.config.MainConfigOfAutoWried;
import top.sxuet.service.PersonService;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 19:04
 */
public class AutowiredTest {
  AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(MainConfigOfAutoWried.class);

  /** 测试autoWried 的匹配规则 */
  @Test
  public void test() {
    printBean(context);
    PersonService personService = context.getBean("personService", PersonService.class);
    personService.print();
    //    context.close();
  }

  /**
   * 打印容器中所有bean
   *
   * @param context
   */
  public void printBean(ApplicationContext context) {
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
  }

  /** 测试autoWried注释在set方法上 */
  @Test
  public void test1() {
    printBean(context);
    Boss boss = context.getBean("boss", Boss.class);
    Car car = context.getBean("car", Car.class);
    System.out.println(car);
    System.out.println(boss);
    //    context.close();
  }
  /** 测试autoWried注释在有参构造器上 */
  @Test
  public void test2() {
    printBean(context);
    Boss boss = context.getBean("boss", Boss.class);
    Car car = context.getBean("car", Car.class);
    System.out.println(car);
    System.out.println(boss);
    //    context.close();
  }
}
