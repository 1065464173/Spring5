import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.sxuet.service.UserTableService;

/**
 * @program: Spring5
 * @description: spring 整合junit5的测试
 * @author: Sxuet
 * @create: 2021-07-03 16:02
 */
// @ExtendWith(SpringExtension.class)
// @ContextConfiguration("classpath:bean1.xml")
// 代替上面两个注解
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {
  @Autowired private UserTableService userTableService;

  @Test
  public void test() {
    userTableService.transfer();
  }
}
