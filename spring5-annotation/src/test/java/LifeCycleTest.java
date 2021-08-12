import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sxuet.config.MainConfigOfLifeCycle;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 20:34
 */
public class LifeCycleTest {

  /** bean的生命周期 init destroy */
  @Test
  public void test01() {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
    //    Car car = context.getBean("car", Car.class);
    //    Cat cat = context.getBean("cat", Cat.class);
    //
    //    System.out.println(car);
    //    System.out.println(cat);
    context.close();
  }
}
