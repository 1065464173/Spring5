import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import top.sxuet.bean.Person;
import top.sxuet.config.MainConfigOfPropertyValues;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 18:43
 */
public class PropertyTest {
  AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

  @Test
  public void test01() {
    printBean(context);
    Person person = context.getBean("person", Person.class);
    ConfigurableEnvironment environment = context.getEnvironment();
    String property = environment.getProperty("person.nickName");
    System.out.println(property);
    System.out.println(person);
    context.close();
  }
  /**
   * 打印容器中的所有bean
   *
   * @param context
   */
  public void printBean(ApplicationContext context) {
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
  }
}
