import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sxuet.config.MainConfigOfProfile;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-04 20:57
 */
public class ProfileTest {
  /** 更换环境参数：1,在虚拟机运行环境配置里写上 -Dspring.profiles.active=环境值 2,代码实现激活的环境 */

  /** 环境@profile激活bean测试 默认环境为default */
  @Test
  public void test() {
    // 手动注册
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    // 设置激活环境
    context.getEnvironment().setActiveProfiles("test", "dev");
    // 注册配置类
    context.register(MainConfigOfProfile.class);
    // 启动刷新容器
    context.refresh();
    printBean(context);
  }

  public void printBean(ApplicationContext context) {
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
  }
}
