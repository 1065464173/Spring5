package top.sxuet.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Spring5
 * @description:
 * @author: Sxuet
 * @create: 2021-07-01 19:33
 */
public class TestCollections {
  /** bean1 */
  @Test
  public void test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    Stu stu = context.getBean("stu", Stu.class);
    System.out.println(stu);
  }
  /** bean2 */
  @Test
  public void test02() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    Book book = context.getBean("book", Book.class);
    System.out.println(book);
  }
}
