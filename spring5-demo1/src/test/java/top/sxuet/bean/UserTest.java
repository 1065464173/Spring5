package top.sxuet.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 12:36
 */
class UserTest {

  @Test
  void add() {
    System.out.println(System.getProperty("user.dir"));
    // 加载配置文件
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    // ApplicationContext context2 = new ClassPathXmlApplicationContext("bean1.xml");

    // 获取配置创建对象
    User user = context.getBean("user", User.class);
    user.add();
    System.out.println(user);
  }
}
