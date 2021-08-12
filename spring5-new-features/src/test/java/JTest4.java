import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.sxuet.service.UserTableService;

/**
 * @program: Spring5
 * @description: Spring 整合junit4 和测试
 * @author: Sxuet
 * @create: 2021-07-03 15:53
 */
@RunWith(SpringJUnit4ClassRunner.class) // 单元测试框架
@ContextConfiguration("classpath:bean1.xml") // 加载配置文件
public class JTest4 {
  @Autowired private UserTableService userService;

  @Test
  public void test() {
    userService.transfer();
  }
}
