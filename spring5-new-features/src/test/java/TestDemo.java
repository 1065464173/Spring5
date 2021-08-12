import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;
import top.sxuet.User;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 15:35
 */
public class TestDemo {
  /** 函数式创建风格，创建bean 注册到spring进行管理 */
  @Test
  public void test01() {
    // 创建GenericApplicationContext对象
    GenericApplicationContext context = new GenericApplicationContext();
    // 注册对象
    context.refresh();
    context.registerBean(User.class, () -> new User());
    // 获取spring注册对象
    User user = (User) context.getBean("top.sxuet.User");
    System.out.println(user);
  }
}
