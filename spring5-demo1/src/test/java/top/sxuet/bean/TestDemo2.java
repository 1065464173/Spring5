package top.sxuet.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.sxuet.service.UserService;

/**
 * @program: spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 16:55
 */
public class TestDemo2 {
  /** 外部bean */
  @Test
  public void TestDaoService() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    UserService userService = context.getBean("userService", UserService.class);
    System.out.println(userService);
    userService.add();
  }

  /** 内部bean */
  @Test
  public void testEmpDept() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
    Emp emp = context.getBean("emp", Emp.class);
    System.out.println(emp);
  }

  /** 级联复制 */
  @Test
  public void testBean4() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
    Emp emp = context.getBean("emp", Emp.class);
    System.out.println(emp);
  }
}
