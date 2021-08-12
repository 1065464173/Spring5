import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sxuet.aop.MathCalculator;
import top.sxuet.config.MainConfigOfAOP;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-05 18:55
 */
public class AOPTest {
  AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

  /** 切面类logAspect测试 */
  @Test
  public void test01() {
    // 不要自己new类，要从IOC容器中get获取，才能有切片的功能
    MathCalculator bean = context.getBean(MathCalculator.class);
    System.out.println(bean.div(1, 0));
  }
}
