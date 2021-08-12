import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.sxuet.config.TxConfig;
import top.sxuet.service.UserTableService;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-07 20:23
 */
public class TxTest {
  /** 事务测试 */
  @Test
  public void test01() {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(TxConfig.class);
    UserTableService service = context.getBean(UserTableService.class);
    service.transfer();
  }
}
