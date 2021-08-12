import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sxuet.ext.ExtConfig;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-07 21:18
 */
public class ExtTest {
  /**
   * MyBeanFactoryPostProcessor测试
   *
   * <p>MyBeanDefinitionRegistryPostProcessor测试
   *
   * <p>MyApplicationListener 测试
   *
   * <p>所有的bean定义好后，尚未初始化的时候调用一下方法postProcessBeanFactory
   */
  @Test
  public void test01() {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(ExtConfig.class);
    context.publishEvent(new ApplicationEvent(new String("我发布的一个事件")) {});
    context.close();
  }
}
