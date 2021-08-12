import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-03 15:26
 */
public class UserLog {
  private static final Logger log = LoggerFactory.getLogger(UserLog.class);

  @Test
  public void test() {
    log.info("info log4");
    log.warn("warn log4");
  }
}
